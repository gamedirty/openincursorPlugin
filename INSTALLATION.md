# Open in Cursor 插件安装与使用指南

## 快速开始

### 安装插件

1. **在 IntelliJ IDEA 或 Android Studio 中：**
   - 打开 `Settings/Preferences` (macOS: `⌘,` / Windows: `Ctrl+Alt+S`)
   - 进入 `Plugins`
   - 点击设置图标 `⚙️`
   - 选择 `Install Plugin from Disk...`
   - 选择 `build/distributions/openincursor-plugin-1.0.0.zip`
   - 点击 `OK`
   - 重启 IDE

### 配置 Cursor 命令行工具

为了让插件正常工作，需要确保 Cursor 命令行工具可用：

#### macOS

**方法 1：通过 Cursor 安装命令行工具（推荐）**

1. 打开 Cursor 编辑器
2. 按 `⌘ + Shift + P` 打开命令面板
3. 输入并执行：`Shell Command: Install 'cursor' command in PATH`

**方法 2：插件自动识别**

如果已经安装了 Cursor.app，插件会自动尝试使用 `open -a Cursor` 命令打开。

**验证安装：**

```bash
# 打开终端，执行以下命令：
cursor --version
# 或者
which cursor
```

#### Windows

1. 安装 Cursor 时，勾选 "Add to PATH" 选项
2. 或者手动将 Cursor 安装目录添加到系统 PATH 环境变量

**验证安装：**

```cmd
# 打开命令提示符，执行：
cursor --version
```

#### Linux

```bash
# 创建符号链接到系统路径
sudo ln -s /path/to/cursor/binary /usr/local/bin/cursor

# 例如，如果 Cursor 安装在 ~/.cursor 目录：
sudo ln -s ~/.cursor/cursor /usr/local/bin/cursor
```

**验证安装：**

```bash
cursor --version
which cursor
```

## 使用方法

1. 在 IntelliJ IDEA 或 Android Studio 中打开任意项目
2. 在项目视图中，右键点击项目根目录
3. 选择 `Open In` → `Cursor`
4. 项目将在 Cursor 编辑器中打开

## 截图

### 右键菜单位置

```
Project View
└── [Right Click on Project]
    └── Open In
        ├── Finder (macOS) / Explorer (Windows)
        ├── Terminal
        └── Cursor  ← 新增的选项
```

## 故障排除

### 问题 1：点击菜单后没有反应

**解决方案：**

1. 检查 Cursor 是否已正确安装
2. 验证命令行工具是否可用（参考上面的验证安装部分）
3. 查看 IDE 的事件日志（`Help` → `Show Log in Finder/Explorer`）

### 问题 2：提示 "无法打开 Cursor"

**解决方案：**

1. **macOS：** 确保已安装 Cursor.app 到 Applications 文件夹
2. **Windows：** 确保 Cursor 在 PATH 环境变量中
3. **Linux：** 确保创建了符号链接

### 问题 3：找不到菜单选项

**解决方案：**

1. 确保插件已正确安装并启用
2. 重启 IDE
3. 检查插件是否与当前 IDE 版本兼容

## 插件信息

- **插件名称：** Open in Cursor
- **版本：** 1.0.0
- **兼容性：** IntelliJ IDEA 2023.2+ / Android Studio 2023.2+
- **支持平台：** macOS, Windows, Linux

## 开发信息

### 从源码构建

```bash
# 进入项目目录
cd openincursorPlugin

# 构建插件
./gradlew buildPlugin

# 构建结果位于：
# build/distributions/openincursor-plugin-1.0.0.zip
```

### 在开发环境中测试

```bash
# 在沙箱环境中运行插件
./gradlew runIde
```

### 验证插件

```bash
# 验证插件配置
./gradlew verifyPlugin
```

## 反馈与支持

如果遇到问题或有功能建议，请通过以下方式联系：

- 提交 Issue 到项目仓库
- 发送邮件至：support@openincursor.dev

## 许可证

MIT License

---

**享受在 Cursor 中编码的乐趣！** 🎉

