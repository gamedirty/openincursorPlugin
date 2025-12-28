# Launch in Cursor Plugin

[English](README.md) | [中文](README_CN.md)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Vibe Coding](https://img.shields.io/badge/Built%20with-Vibe%20Coding-blue)](https://github.com/vibe-coding)

Launch your IntelliJ IDEA / Android Studio projects directly in Cursor editor with one click - **even if you've never opened the project in Cursor before!**

> 🎉 **Built with Vibe Coding** - This project was created through an AI-assisted development process, demonstrating the power of modern AI-powered coding workflows.

## 🚀 Why This Plugin?

**The Key Difference:** Unlike other similar plugins, this one can open projects in Cursor even when Cursor hasn't previously opened that project. It directly launches Cursor with your project path, making it truly hassle-free!

Other plugins may fail when trying to open a project that Cursor has never seen before. This plugin solves that problem completely.

## ✨ Features

- 🚀 **Direct Launch** - Works even for brand new projects never opened in Cursor
- 🖱️ **Custom Cursor Icon** - Displays the distinctive Cursor brand icon in the menu
- ⚡ **One-Click Access** - Right-click on project → Open In → Cursor
- 🌍 **Cross-Platform** - Supports macOS, Windows, and Linux
- 🔍 **Smart Detection** - Automatically detects Cursor installation paths
- 🎨 **Theme Support** - Adapts icon colors for light/dark themes
- ⚙️ **Zero Configuration** - Works out of the box if Cursor is in PATH

## 📦 Installation

### From JetBrains Marketplace (Recommended)

1. Open IntelliJ IDEA or Android Studio
2. Go to `Settings/Preferences` → `Plugins` → `Marketplace`
3. Search for "Launch in Cursor"
4. Click `Install`
5. Restart IDE

### From Release

1. Download the latest `launchincursor-plugin-x.x.x.zip` from [Releases](https://github.com/gamedirty/openincursorPlugin/releases)
2. Open IntelliJ IDEA or Android Studio
3. Go to `Settings/Preferences` → `Plugins` → `⚙️` → `Install Plugin from Disk...`
4. Select the downloaded zip file
5. Restart IDE

### From Source

```bash
# Clone the repository
git clone https://github.com/gamedirty/openincursorPlugin.git
cd openincursorPlugin

# Build the plugin
./gradlew buildPlugin

# The plugin will be in build/distributions/launchincursor-plugin-x.x.x.zip
```

## 🔧 Configuration

The plugin requires Cursor command-line tool to be available:

### macOS (Recommended)

1. Open Cursor editor
2. Press `⌘ + Shift + P` to open command palette
3. Execute: `Shell Command: Install 'cursor' command in PATH`

Or the plugin will automatically try `open -a Cursor` if Cursor.app is installed.

**Verify:**
```bash
cursor --version
```

### Windows

Install Cursor and check "Add to PATH" during installation.

**Verify:**
```cmd
cursor --version
```

### Linux

```bash
# Create symlink
sudo ln -s /path/to/cursor /usr/local/bin/cursor

# Verify
cursor --version
```

## 🚀 Usage

1. In project view, right-click on your project root
2. Select `Open In` → `Cursor`
3. Your project opens in Cursor editor instantly! 🎉

**No matter if Cursor has opened this project before or not - it just works!**

## 🎯 Compatibility

- **Minimum:** IntelliJ IDEA 2023.2+ / Android Studio 2023.2+ (Build 232+)
- **Maximum:** IntelliJ IDEA 2026.1+ / Android Studio 2026.1+ (Build 261.*)
- **Platforms:** macOS, Windows, Linux
- **Themes:** Light and Dark themes supported

## 📁 Project Structure

```
openincursorPlugin/
├── src/main/
│   ├── kotlin/com/example/openincursor/
│   │   ├── OpenInCursorAction.kt      # Main action implementation
│   │   └── CursorIcons.kt             # Icon loader
│   └── resources/
│       ├── icons/
│       │   ├── cursor.svg              # Light theme icon
│       │   └── cursor_dark.svg         # Dark theme icon
│       └── META-INF/
│           └── plugin.xml              # Plugin configuration
├── build.gradle.kts                    # Gradle build script
├── README.md                           # This file
└── README_CN.md                        # Chinese documentation
```

## 🛠 Development

### Requirements

- JDK 17+
- Gradle 8.5+
- IntelliJ IDEA (recommended)

### Build Commands

```bash
# Build the plugin
./gradlew buildPlugin

# Run in sandbox for testing
./gradlew runIde

# Verify plugin configuration
./gradlew verifyPlugin

# Clean build artifacts
./gradlew clean
```

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- **Cursor** - The AI-powered code editor
- **JetBrains** - For the excellent IntelliJ Platform
- **Vibe Coding** - AI-assisted development methodology

## 💬 Support

If you encounter any issues or have suggestions:

- 🐛 [Report a bug](https://github.com/gamedirty/openincursorPlugin/issues)
- 💡 [Request a feature](https://github.com/gamedirty/openincursorPlugin/issues)
- ⭐ Star this repo if you find it useful!

## 🔗 Links

- [Cursor Editor](https://cursor.sh/)
- [IntelliJ Platform Plugin SDK](https://plugins.jetbrains.com/docs/intellij/)
- [JetBrains Marketplace](https://plugins.jetbrains.com/)

---

**Made with ❤️ using Vibe Coding** - An AI-assisted development approach for rapid, high-quality software creation.

**Star ⭐ this repo if you find it useful!**
