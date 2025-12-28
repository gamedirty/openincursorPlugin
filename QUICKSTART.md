# 快速开始指南

## 🎯 一分钟快速安装

### 1️⃣ 构建插件

```bash
cd openincursorPlugin
./gradlew buildPlugin
```

✅ 插件文件：`build/distributions/openincursor-plugin-1.0.0.zip`

### 2️⃣ 安装插件

在 IDE 中：

1. `Settings/Preferences` → `Plugins` → `⚙️` → `Install Plugin from Disk...`
2. 选择 `openincursor-plugin-1.0.0.zip`
3. 重启 IDE

### 3️⃣ 配置 Cursor 命令行（如果尚未配置）

**macOS 用户（最简单）：**

打开 Cursor → 按 `⌘+Shift+P` → 输入并执行：

```
Shell Command: Install 'cursor' command in PATH
```

**Windows 用户：**

安装 Cursor 时勾选 "Add to PATH"

**Linux 用户：**

```bash
sudo ln -s /path/to/cursor /usr/local/bin/cursor
```

### 4️⃣ 使用

在 IDE 项目视图中：

```
右键项目 → Open In → Cursor
```

完成！🎉

---

## ❓ 遇到问题？

### "无法打开 Cursor" 错误

验证 Cursor 命令是否可用：

```bash
# macOS/Linux
cursor --version
which cursor

# Windows
cursor --version
```

如果命令不存在，重新执行步骤 3。

### 菜单中找不到 "Cursor" 选项

1. 确认插件已启用：`Settings` → `Plugins` → 搜索 "Open in Cursor"
2. 重启 IDE
3. 确保右键点击的是项目根目录

---

## 📚 更多信息

- 完整文档：[README.md](README.md)
- 详细安装指南：[INSTALLATION.md](INSTALLATION.md)
- 中文说明：[README_CN.md](README_CN.md)

**享受编码！** 🚀

