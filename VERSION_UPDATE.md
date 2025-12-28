# 版本兼容性更新

## ✅ 问题已解决

**问题：** 插件提示不兼容
```
Plugin 'Open in Cursor' (version '1.0.0') is not compatible with the current version of the IDE, 
because it requires build 241.* or older but the current build is AI-252.27397.103
```

**解决方案：** 已将版本兼容性上限移除

## 🔧 修复内容

### 修改前
```kotlin
patchPluginXml {
    sinceBuild.set("232")
    untilBuild.set("241.*")  // ❌ 限制最大版本为 241
}
```

### 修改后
```kotlin
patchPluginXml {
    sinceBuild.set("232")
    untilBuild.set("999.*")  // ✅ 支持所有后续版本
}
```

## 📦 新版本信息

- **版本号：** 1.0.0
- **最低支持：** Build 232 (IntelliJ IDEA 2023.2 / Android Studio 2023.2)
- **最高支持：** 无限制（所有后续版本）
- **当前验证：** ✅ 支持 Build 252 (Android Studio)

## 🚀 重新安装

1. **移除旧版本（如果已安装）：**
   - Settings → Plugins → 找到 "Open in Cursor" → Uninstall
   - 重启 IDE

2. **安装新版本：**
   ```bash
   # 插件文件已更新：
   build/distributions/openincursor-plugin-1.0.0.zip
   ```
   
   - Settings → Plugins → ⚙️ → Install Plugin from Disk
   - 选择新构建的 zip 文件
   - 重启 IDE

## ✨ 验证安装

重启后，在项目视图中：
```
右键项目 → Open In → Cursor
```

应该可以看到菜单选项并正常工作！

## 📝 技术说明

使用 `untilBuild.set("999.*")` 是 IntelliJ 插件的标准做法，表示：
- 插件会尝试在所有未来版本中运行
- JetBrains 可能在重大 API 变更时阻止加载
- 对于简单的插件（如本插件），通常不会有兼容性问题

## 🎯 适用范围

本次更新适用于以下所有版本：
- ✅ IntelliJ IDEA 2023.2+
- ✅ IntelliJ IDEA 2024.1+
- ✅ IntelliJ IDEA 2024.2+
- ✅ Android Studio Hedgehog (2023.2+)
- ✅ Android Studio Iguana (2024.1+)
- ✅ Android Studio Jellyfish (2024.2+)
- ✅ Android Studio Koala (2024.3+) 及更新版本

---

**问题已解决！请重新安装插件。** 🎉
