# Open in Cursor Plugin

这是一个 IntelliJ IDEA / Android Studio 插件，用于在项目右键菜单的 "Open In" 子菜单中添加 "Cursor" 选项，方便快速使用 Cursor 编辑器打开项目。

## 功能特性

- ✅ 在项目右键菜单的 "Open In" 子菜单中添加 "Cursor" 选项
- ✅ 支持 macOS、Windows 和 Linux 系统
- ✅ 自动检测 Cursor 安装路径
- ✅ 友好的错误提示

## 使用方法

1. 在 IntelliJ IDEA 或 Android Studio 的项目视图中，右键点击项目
2. 选择 "Open In" -> "Cursor"
3. 项目将在 Cursor 编辑器中打开

## 安装说明

### 方式一：从源码构建

```bash
# 克隆项目
cd openincursorPlugin

# 构建插件
./gradlew buildPlugin

# 构建完成后，插件文件位于: build/distributions/openincursor-plugin-1.0.0.zip
```

### 方式二：安装到 IDE

1. 打开 IntelliJ IDEA 或 Android Studio
2. 进入 `Preferences/Settings` -> `Plugins` -> `⚙️` -> `Install Plugin from Disk...`
3. 选择构建好的 `openincursor-plugin-1.0.0.zip` 文件
4. 重启 IDE

## Cursor 配置要求

为了确保插件正常工作，需要确保 Cursor 的命令行工具可用：

### macOS

Cursor 通常会自动安装。如果无法使用，可以：

1. 打开 Cursor
2. 按 `Cmd+Shift+P` 打开命令面板
3. 输入 "Shell Command: Install 'cursor' command in PATH"
4. 执行该命令

或者直接使用应用名称打开（插件会自动尝试）。

### Windows

1. 安装 Cursor 后，确保安装目录在 PATH 环境变量中
2. 或者在安装时选择 "Add to PATH" 选项

### Linux

```bash
# 创建符号链接到 /usr/local/bin
sudo ln -s /path/to/cursor /usr/local/bin/cursor
```

## 开发说明

### 项目结构

```
openincursorPlugin/
├── build.gradle.kts           # Gradle 构建配置
├── settings.gradle.kts        # Gradle 设置
├── src/
│   └── main/
│       ├── kotlin/
│       │   └── com/example/openincursor/
│       │       └── OpenInCursorAction.kt   # 主要功能实现
│       └── resources/
│           └── META-INF/
│               └── plugin.xml              # 插件配置
└── README.md
```

### 开发环境要求

- JDK 17 或更高版本
- Gradle 8.0 或更高版本
- IntelliJ IDEA (推荐使用 Community 或 Ultimate 版本)

### 常用 Gradle 任务

```bash
# 构建插件
./gradlew buildPlugin

# 运行插件（在沙箱环境中测试）
./gradlew runIde

# 验证插件
./gradlew verifyPlugin

# 清理构建文件
./gradlew clean
```

## 技术实现

插件通过以下方式实现功能：

1. 继承 `AnAction` 类创建自定义动作
2. 在 `plugin.xml` 中注册动作到 `RevealGroup`（"Open In" 菜单组）
3. 根据操作系统类型，使用不同的命令打开 Cursor
4. 提供友好的错误处理和用户提示

## 兼容性

- IntelliJ IDEA 2023.2+ (Build 232+)
- Android Studio 2023.2+ (Build 232+)
- 支持所有后续版本（无版本上限）
- 支持 macOS、Windows 和 Linux

## 许可证

MIT License

## 贡献

欢迎提交 Issue 和 Pull Request！

## 更新日志

### v1.0.0 (2025-12-28)

- 🎉 初始版本发布
- ✨ 添加 "Open in Cursor" 功能
- ✨ 支持 macOS、Windows 和 Linux
- ✨ 友好的错误提示

