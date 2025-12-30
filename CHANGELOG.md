# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Planned
- Add keyboard shortcut support
- Add configuration page for custom Cursor path
- Support opening specific file/folder in Cursor

## [2.0.5] - 2025-12-30

### Changed
- **Updated icon to use official Cursor logo** extracted from Cursor.app
- Replaced custom icon with accurate 3D cube design matching Cursor branding
- Improved icon rendering for both light and dark themes

## [2.0.4] - 2025-12-30

### Fixed
- **Resolved IDE compatibility issues** - Plugin now works with all IDE versions from 232+
- Disabled automatic `until-build` generation to ensure unlimited forward compatibility
- Fixed plugin not being searchable on JetBrains Marketplace

## [2.0.3] - 2025-12-30

### Fixed
- Updated compatibility range to support unlimited future IDE versions

## [2.0.2] - 2025-12-30

### Fixed
- Removed magic number from `until-build` attribute as per Marketplace requirements

## [2.0.1] - 2025-12-30

### Fixed
- Corrected plugin compatibility settings to work with newer IDE versions

## [2.0.0] - 2025-12-28

### Changed
- **Plugin renamed to "Launch in Cursor"** to differentiate from similar plugins
- Updated plugin ID to `dev.launchincursor.plugin`
- Enhanced description highlighting direct launch capability
- Updated all documentation to reflect new branding

### Key Advantage
- Can launch projects in Cursor **even if they've never been opened in Cursor before**
- Direct launch with project path, unlike other plugins that may fail with new projects

## [1.0.0] - 2025-12-28

### Added
- Initial release of Launch in Cursor plugin (originally "Open in Cursor")
- Right-click context menu integration in "Open In" submenu
- Custom Cursor brand icon (light and dark theme support)
- Cross-platform support (macOS, Windows, Linux)
- Smart Cursor installation detection
- Automatic fallback mechanisms for different launch methods
- Zero-configuration setup when Cursor is in PATH
- Friendly error messages with troubleshooting guidance
- GitHub Actions CI/CD for automated building and publishing

### Features
- 🖱️ Distinctive Cursor icon in context menu
- 🚀 One-click project opening in Cursor
- 🌍 Multi-platform compatibility
- 🎨 Theme-aware icon rendering
- ⚡ Fast and lightweight operation

### Technical
- Built with Kotlin 1.9.22
- Compatible with IntelliJ IDEA 2023.2 - 2026.1 (Build 232 - 261.*)
- Compatible with Android Studio 2023.2 - 2026.1
- SVG vector icons for crisp display at any resolution

---

**Built with Vibe Coding** - AI-assisted development for rapid, high-quality software creation.
