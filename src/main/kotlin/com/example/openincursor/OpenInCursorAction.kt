package com.example.openincursor

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import java.io.File
import java.io.IOException

/**
 * 在右键菜单 "Open In" 子菜单中添加 "Cursor" 选项
 */
class OpenInCursorAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val project: Project = e.project ?: return
        val projectPath = project.basePath ?: return

        try {
            openInCursor(projectPath)
        } catch (ex: IOException) {
            Messages.showErrorDialog(
                project,
                "无法打开 Cursor: ${ex.message}\n\n请确保 Cursor 已安装并且命令行工具可用。",
                "打开 Cursor 失败"
            )
        }
    }

    override fun update(e: AnActionEvent) {
        // 只有在项目存在时才显示此选项
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }

    /**
     * 使用 Cursor 打开指定路径
     */
    private fun openInCursor(path: String) {
        val osName = System.getProperty("os.name").lowercase()
        
        val command = when {
            osName.contains("mac") || osName.contains("darwin") -> {
                // macOS: 尝试多种方式打开 Cursor
                listOf(
                    listOf("open", "-a", "Cursor", path),
                    listOf("/usr/local/bin/cursor", path),
                    listOf("cursor", path)
                )
            }
            osName.contains("win") -> {
                // Windows: 尝试多种方式
                listOf(
                    listOf("cmd", "/c", "cursor", path),
                    listOf("cmd", "/c", "start", "cursor", path)
                )
            }
            else -> {
                // Linux: 尝试直接调用 cursor 命令
                listOf(
                    listOf("cursor", path),
                    listOf("/usr/bin/cursor", path),
                    listOf("/usr/local/bin/cursor", path)
                )
            }
        }

        var lastException: Exception? = null
        var success = false

        for (cmd in command) {
            try {
                val processBuilder = ProcessBuilder(cmd)
                processBuilder.directory(File(path))
                processBuilder.start()
                
                // 不等待进程结束，因为 Cursor 会继续运行
                success = true
                break
            } catch (e: Exception) {
                lastException = e
                // 继续尝试下一个命令
            }
        }

        if (!success) {
            throw IOException(
                "无法启动 Cursor。请确保：\n" +
                "1. Cursor 已正确安装\n" +
                "2. 已将 Cursor 添加到 PATH 环境变量中\n" +
                "\n原始错误: ${lastException?.message}"
            )
        }
    }
}

