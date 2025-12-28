# GitHub Actions 自动发布配置指南

本项目配置了两个 GitHub Actions workflows：

## 📋 Workflows 说明

### 1. Build Workflow (`build.yml`)
**触发条件：** 推送到 main 分支或提交 PR

**功能：**
- 编译验证代码
- 运行插件验证
- 上传构建产物

**用途：** 日常开发时的 CI 检查

---

### 2. Release Workflow (`release.yml`)
**触发条件：** 推送版本标签（如 `v1.0.0`）

**功能：**
1. ✅ 自动构建插件
2. ✅ 创建 GitHub Release
3. ✅ 上传插件 zip 到 Release
4. ✅ 发布到 JetBrains Marketplace（可选）

---

## 🚀 发布新版本的步骤

### 方式一：使用命令行（推荐）

```bash
# 1. 确保所有更改已提交
git add .
git commit -m "Release v1.0.0"
git push

# 2. 创建并推送标签
git tag -a v1.0.0 -m "Release version 1.0.0 - Initial release with Vibe Coding"
git push origin v1.0.0

# 3. GitHub Actions 会自动：
#    - 构建插件
#    - 创建 GitHub Release
#    - 上传插件文件
#    - 发布到 JetBrains Marketplace（如果配置了 token）
```

### 方式二：使用 GitHub 界面

1. 进入 GitHub 仓库的 "Releases" 页面
2. 点击 "Create a new release"
3. 点击 "Choose a tag" → 输入新标签（如 `v1.0.1`）
4. 填写 Release 标题和描述
5. 点击 "Publish release"
6. GitHub Actions 会自动触发构建和发布

---

## 🔑 配置 JetBrains Marketplace 发布（可选但推荐）

如果您想自动发布到 JetBrains 插件市场，需要配置 publish token：

### 步骤 1: 获取 JetBrains Token

1. 访问 https://plugins.jetbrains.com/
2. 登录您的 JetBrains 账号
3. 进入 https://plugins.jetbrains.com/author/me/tokens
4. 点击 "Generate New Token"
5. 复制生成的 token（只显示一次，请保存好）

### 步骤 2: 添加 Token 到 GitHub Secrets

1. 进入 GitHub 仓库的 Settings
2. 选择 "Secrets and variables" → "Actions"
3. 点击 "New repository secret"
4. 填写：
   - **Name:** `JETBRAINS_PUBLISH_TOKEN`
   - **Value:** 粘贴您的 JetBrains token
5. 点击 "Add secret"

### 步骤 3: 验证配置

下次推送 tag 时，workflow 会自动发布到 JetBrains Marketplace！

---

## 📝 版本号规范

使用 [语义化版本](https://semver.org/lang/zh-CN/)：

- **主版本号(MAJOR)**: 不兼容的 API 修改
- **次版本号(MINOR)**: 向下兼容的功能性新增
- **修订号(PATCH)**: 向下兼容的问题修正

示例：
- `v1.0.0` - 首次发布
- `v1.0.1` - Bug 修复
- `v1.1.0` - 新功能
- `v2.0.0` - 重大更新

---

## 🔍 监控发布状态

### 查看 Workflow 运行状态

1. 进入 GitHub 仓库的 "Actions" 标签
2. 找到 "Release Plugin" workflow
3. 查看运行详情和日志

### 检查发布结果

- ✅ **GitHub Release:** `https://github.com/gamedirty/openincursorPlugin/releases`
- ✅ **JetBrains Marketplace:** `https://plugins.jetbrains.com/` (搜索 "Open in Cursor")

---

## ⚠️ 常见问题

### Q: 推送 tag 后 workflow 没有运行？
**A:** 检查：
- Tag 格式是否正确（必须是 `v*` 格式，如 `v1.0.0`）
- 是否成功推送到 GitHub：`git push origin --tags`
- 查看 Actions 标签是否有错误

### Q: Release 创建成功但没有发布到 Marketplace？
**A:** 可能的原因：
- `JETBRAINS_PUBLISH_TOKEN` 未配置或已过期
- Token 权限不足
- 查看 workflow 日志中的具体错误

### Q: 想要发布到 Marketplace 但还没准备好？
**A:** 暂时不配置 `JETBRAINS_PUBLISH_TOKEN`，这样：
- ✅ 仍会创建 GitHub Release
- ✅ 仍会上传插件文件
- ❌ 不会发布到 Marketplace

稍后配置 token 并重新运行 workflow 即可发布。

### Q: 如何更新已发布的版本？
**A:** 
- 修复代码后，创建新的 tag（如 `v1.0.1`）
- 不要修改已存在的 tag
- 每个 tag 对应一个不可变的 release

---

## 🎯 发布清单

在发布新版本之前，确保：

- [ ] 更新 `CHANGELOG.md`
- [ ] 更新 `build.gradle.kts` 中的版本号
- [ ] 更新 `plugin.xml` 中的版本信息（如果有）
- [ ] 所有测试通过
- [ ] 文档已更新
- [ ] 本地测试插件功能正常
- [ ] 提交所有更改到 main 分支

然后创建 tag 并推送：

```bash
# 更新版本号
vim build.gradle.kts  # 修改 version = "1.0.1"

# 提交
git add .
git commit -m "Bump version to 1.0.1"
git push

# 创建并推送 tag
git tag -a v1.0.1 -m "Release v1.0.1"
git push origin v1.0.1
```

---

## 📊 自动化流程图

```
推送 Tag (v1.0.0)
        ↓
GitHub Actions 触发
        ↓
    构建插件
        ↓
    验证插件
        ↓
  创建 GitHub Release
        ↓
上传插件 zip 文件
        ↓
发布到 JetBrains Marketplace
   (如果配置了 token)
        ↓
     完成 ✅
```

---

## 🔗 相关链接

- **JetBrains 插件开发文档:** https://plugins.jetbrains.com/docs/intellij/
- **JetBrains Token 管理:** https://plugins.jetbrains.com/author/me/tokens
- **GitHub Actions 文档:** https://docs.github.com/actions
- **语义化版本规范:** https://semver.org/

---

## 🎉 首次发布

现在您可以发布第一个版本了！

```bash
# 创建首个正式版本
git tag -a v1.0.0 -m "Initial release - Built with Vibe Coding

- Add right-click context menu integration
- Custom Cursor brand icon
- Cross-platform support
- Light/Dark theme support
"

# 推送 tag
git push origin v1.0.0

# 然后访问 GitHub Actions 查看自动发布过程
```

---

**Built with ❤️ using Vibe Coding**

