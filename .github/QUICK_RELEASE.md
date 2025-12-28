# 🚀 快速发布指南

## 发布新版本（3 步完成）

### 1️⃣ 准备发布

```bash
# 确保在 main 分支且代码最新
git checkout main
git pull

# 更新 CHANGELOG.md（添加新版本的变更）
# 更新 build.gradle.kts 中的 version（如果需要）
```

### 2️⃣ 创建并推送标签

```bash
# 创建版本标签（替换为实际版本号）
git tag -a v1.0.0 -m "Release v1.0.0 - Initial release"

# 推送标签到 GitHub
git push origin v1.0.0
```

### 3️⃣ 等待自动发布 ✨

GitHub Actions 会自动：
- ✅ 构建插件
- ✅ 创建 GitHub Release  
- ✅ 上传插件文件
- ✅ 发布到 JetBrains Marketplace（如果已配置）

查看进度：https://github.com/gamedirty/openincursorPlugin/actions

---

## 🔑 首次配置 JetBrains Marketplace（仅需一次）

### 获取 Publish Token

1. 访问：https://plugins.jetbrains.com/author/me/tokens
2. 点击 "Generate New Token"
3. 复制 token

### 添加到 GitHub Secrets

1. 访问：https://github.com/gamedirty/openincursorPlugin/settings/secrets/actions
2. 点击 "New repository secret"
3. 添加：
   - Name: `JETBRAINS_PUBLISH_TOKEN`
   - Value: 粘贴您的 token
4. 保存

配置后，下次推送 tag 就会自动发布到插件市场！

---

## 📋 版本号规范

- `v1.0.0` - 首次发布
- `v1.0.1` - Bug 修复
- `v1.1.0` - 新功能
- `v2.0.0` - 重大更新

---

## ⚡ 一键发布命令

```bash
# 设置版本号
VERSION="1.0.0"

# 创建并推送 tag（一行命令）
git tag -a v${VERSION} -m "Release v${VERSION}" && git push origin v${VERSION}

# 查看发布进度
# https://github.com/gamedirty/openincursorPlugin/actions
```

---

## 📖 详细文档

查看完整配置和故障排除：[RELEASE_WORKFLOW_GUIDE.md](RELEASE_WORKFLOW_GUIDE.md)

---

**Built with Vibe Coding** 🚀

