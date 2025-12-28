# Launch in Cursor 插件

[English](README.md) | [中文](README_CN.md)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Vibe Coding](https://img.shields.io/badge/Built%20with-Vibe%20Coding-blue)](https://github.com/vibe-coding)

一键直接在 Cursor 编辑器中打开你的 IntelliJ IDEA / Android Studio 项目 - **即使 Cursor 从未打开过这个项目！**

> 🎉 **使用 Vibe Coding 构建** - 这个项目通过 AI 辅助开发流程创建，展示了现代 AI 驱动编码工作流的强大能力。

## 🚀 为什么选择这个插件？

**核心优势：** 与其他同类插件不同，本插件可以直接启动 Cursor 打开项目，即使 Cursor 之前从未打开过该项目。它直接使用项目路径启动 Cursor，真正做到零障碍！

其他插件在尝试打开 Cursor 从未见过的项目时可能会失败。这个插件完美解决了这个问题。

## ✨ 功能特性

- 🚀 **直接启动** - 即使是全新项目，Cursor 从未打开过也能正常工作
- 🖱️ **专属 Cursor 图标** - 菜单中显示独特的 Cursor 品牌图标
- ⚡ **一键访问** - 右键项目 → Open In → Cursor
- 🌍 **跨平台支持** - 支持 macOS、Windows 和 Linux
- 🔍 **智能检测** - 自动检测 Cursor 安装路径
- 🎨 **主题适配** - 亮色/暗色主题自动切换图标
- ⚙️ **零配置** - 如果 Cursor 在 PATH 中，开箱即用

## 📦 安装方法

### 从 JetBrains 插件市场安装（推荐）

1. 打开 IntelliJ IDEA 或 Android Studio
2. 进入 `Settings/Preferences` → `Plugins` → `Marketplace`
3. 搜索 "Launch in Cursor"
4. 点击 `Install`
5. 重启 IDE

### 从 Release 安装

1. 从 [Releases](https://github.com/gamedirty/openincursorPlugin/releases) 下载最新的 `launchincursor-plugin-x.x.x.zip`
2. 打开 IntelliJ IDEA 或 Android Studio
3. 进入 `Settings/Preferences` → `Plugins` → `⚙️` → `Install Plugin from Disk...`
4. 选择下载的 zip 文件
5. 重启 IDE

### 从源码构建

```bash
# 克隆仓库
git clone https://github.com/gamedirty/openincursorPlugin.git
cd openincursorPlugin

# 构建插件
./gradlew buildPlugin

# 插件文件位于 build/distributions/launchincursor-plugin-x.x.x.zip
```

## 🔧 配置 Cursor 命令行工具

插件需要 Cursor 命令行工具可用：

### macOS（推荐方式）

1. 打开 Cursor 编辑器
2. 按 `⌘ + Shift + P` 打开命令面板
3. 执行：`Shell Command: Install 'cursor' command in PATH`

或者，如果已安装 Cursor.app，插件会自动尝试 `open -a Cursor` 命令。

**验证：**
```bash
cursor --version
```

### Windows

安装 Cursor 时勾选 "Add to PATH" 选项。

**验证：**
```cmd
cursor --version
```

### Linux

```bash
# 创建符号链接
sudo ln -s /path/to/cursor /usr/local/bin/cursor

# 验证
cursor --version
```

## 🚀 使用方法

1. 在项目视图中，右键点击项目根目录
2. 选择 `Open In` → `Cursor`
3. 项目立即在 Cursor 编辑器中打开！🎉

**无论 Cursor 之前是否打开过这个项目 - 都能正常工作！**

## 🎯 兼容性

- **最低版本：** IntelliJ IDEA 2023.2+ / Android Studio 2023.2+ (Build 232+)
- **最高版本：** IntelliJ IDEA 2026.1+ / Android Studio 2026.1+ (Build 261.*)
- **平台：** macOS、Windows、Linux
- **主题：** 支持亮色和暗色主题

## 📁 项目结构

```
openincursorPlugin/
├── src/main/
│   ├── kotlin/com/example/openincursor/
│   │   ├── OpenInCursorAction.kt      # 核心功能实现
│   │   └── CursorIcons.kt             # 图标加载器
│   └── resources/
│       ├── icons/
│       │   ├── cursor.svg              # 亮色主题图标
│       │   └── cursor_dark.svg         # 暗色主题图标
│       └── META-INF/
│           └── plugin.xml              # 插件配置
├── build.gradle.kts                    # Gradle 构建脚本
├── README.md                           # 英文文档
└── README_CN.md                        # 本文件（中文文档）
```

## 🛠 开发说明

### 环境要求

- JDK 17+
- Gradle 8.5+
- IntelliJ IDEA（推荐）

### 构建命令

```bash
# 构建插件
./gradlew buildPlugin

# 在沙箱环境中测试
./gradlew runIde

# 验证插件配置
./gradlew verifyPlugin

# 清理构建文件
./gradlew clean
```

## 🤝 贡献

欢迎贡献！请随时提交 Pull Request。

1. Fork 本仓库
2. 创建特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 开启 Pull Request

## 📝 许可证

本项目采用 MIT 许可证 - 查看 [LICENSE](LICENSE) 文件了解详情。

## 🙏 致谢

- **Cursor** - AI 驱动的代码编辑器
- **JetBrains** - 优秀的 IntelliJ 平台
- **Vibe Coding** - AI 辅助开发方法论

## 💬 支持

如果遇到问题或有建议：

- 🐛 [报告 Bug](https://github.com/gamedirty/openincursorPlugin/issues)
- 💡 [功能建议](https://github.com/gamedirty/openincursorPlugin/issues)
- ⭐ 如果觉得有用，请给项目点个 Star！

## 🔗 相关链接

- [Cursor 编辑器](https://cursor.sh/)
- [IntelliJ Platform 插件 SDK](https://plugins.jetbrains.com/docs/intellij/)
- [JetBrains 插件市场](https://plugins.jetbrains.com/)

---

**使用 ❤️ 和 Vibe Coding 构建** - 一种快速创建高质量软件的 AI 辅助开发方法。

**如果觉得有用，请给项目 Star ⭐！**
