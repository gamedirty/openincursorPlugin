# Open in Cursor 插件

一个简单实用的 IntelliJ IDEA / Android Studio 插件，让您可以通过右键菜单快速在 Cursor 编辑器中打开项目。

## ✨ 功能

- 在项目右键菜单的 "Open In" 子菜单中添加 "Cursor" 选项
- 一键使用 Cursor 编辑器打开当前项目
- 跨平台支持：macOS、Windows、Linux

## 📦 安装

### 步骤 1：构建插件

```bash
./gradlew buildPlugin
```

构建完成后，插件文件位于：`build/distributions/openincursor-plugin-1.0.0.zip`

### 步骤 2：安装到 IDE

1. 打开 IntelliJ IDEA 或 Android Studio
2. 进入 `Settings/Preferences` → `Plugins`
3. 点击齿轮图标 ⚙️ → `Install Plugin from Disk...`
4. 选择构建好的 `openincursor-plugin-1.0.0.zip` 文件
5. 重启 IDE

### 步骤 3：配置 Cursor 命令行工具

#### macOS (推荐)

1. 打开 Cursor 编辑器
2. 按 `⌘ + Shift + P` 打开命令面板
3. 执行：`Shell Command: Install 'cursor' command in PATH`

或者插件会自动尝试使用 `open -a Cursor` 命令。

#### Windows

安装 Cursor 时勾选 "Add to PATH" 选项。

#### Linux

```bash
sudo ln -s /path/to/cursor/binary /usr/local/bin/cursor
```

## 🚀 使用方法

1. 在项目视图中右键点击项目
2. 选择 `Open In` → `Cursor`
3. 项目将在 Cursor 中打开！

## 📁 项目结构

```
openincursorPlugin/
├── build.gradle.kts                    # Gradle 构建配置
├── settings.gradle.kts                 # Gradle 设置
├── gradle/                             # Gradle Wrapper
├── src/
│   └── main/
│       ├── kotlin/
│       │   └── com/example/openincursor/
│       │       └── OpenInCursorAction.kt   # 核心功能实现
│       └── resources/
│           └── META-INF/
│               └── plugin.xml          # 插件配置文件
├── README.md                           # 项目说明
└── INSTALLATION.md                     # 详细安装指南
```

## 🛠 技术实现

- **语言：** Kotlin
- **构建工具：** Gradle + IntelliJ Platform Plugin
- **兼容性：** IntelliJ IDEA 2023.2+ / Android Studio 2023.2+ (所有后续版本)
- **JDK：** 17+

## 🎯 核心原理

1. 继承 `AnAction` 创建自定义操作
2. 通过 `plugin.xml` 注册到 `RevealGroup`（"Open In" 菜单组）
3. 根据操作系统执行相应的命令启动 Cursor
4. 提供友好的错误处理和提示

## 📝 开发命令

```bash
# 构建插件
./gradlew buildPlugin

# 在沙箱环境测试
./gradlew runIde

# 验证插件配置
./gradlew verifyPlugin

# 清理构建文件
./gradlew clean
```

## ⚠️ 注意事项

- 确保 Cursor 已正确安装
- 确保 Cursor 命令行工具在 PATH 中可用
- 如果遇到问题，请查看 `INSTALLATION.md` 中的故障排除部分

## 📄 许可证

MIT License

## 🙏 致谢

感谢使用本插件！如有问题或建议，欢迎反馈。

---

**立即安装，享受 Cursor 的强大功能！** 🚀

