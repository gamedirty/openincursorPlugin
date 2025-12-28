package com.example.openincursor

import com.intellij.openapi.util.IconLoader

/**
 * Cursor 图标定义
 */
object CursorIcons {
    /**
     * Cursor 编辑器图标
     * 在亮色主题下使用 cursor.svg
     * 在暗色主题下自动切换到 cursor_dark.svg
     */
    @JvmField
    val CURSOR = IconLoader.getIcon("/icons/cursor.svg", CursorIcons::class.java)
}

