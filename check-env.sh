#!/bin/bash

# Open in Cursor 插件 - 环境检查脚本
# 用于验证 Cursor 是否已正确安装和配置

echo "🔍 Open in Cursor 插件 - 环境检查"
echo "=================================="
echo ""

# 检测操作系统
OS="$(uname -s)"
echo "📍 操作系统: $OS"
echo ""

# 检查 Cursor 命令行工具
echo "🔧 检查 Cursor 命令行工具..."
echo ""

if command -v cursor &> /dev/null; then
    echo "✅ cursor 命令已找到"
    echo "   路径: $(which cursor)"
    if cursor --version &> /dev/null; then
        echo "   版本: $(cursor --version 2>&1 | head -1)"
    fi
    echo ""
    echo "🎉 环境配置正确！插件可以正常使用。"
else
    echo "❌ 未找到 cursor 命令"
    echo ""
    echo "📝 配置建议："
    echo ""
    
    case "$OS" in
        Darwin*)
            echo "macOS 系统："
            echo "1. 打开 Cursor 应用"
            echo "2. 按 Cmd+Shift+P 打开命令面板"
            echo "3. 输入并执行: Shell Command: Install 'cursor' command in PATH"
            echo ""
            echo "或者插件会自动尝试使用 'open -a Cursor' 命令"
            
            # 检查 Cursor 应用是否存在
            if [ -d "/Applications/Cursor.app" ]; then
                echo ""
                echo "✅ 已检测到 Cursor.app，插件应该可以工作"
                echo "   （即使没有命令行工具）"
            fi
            ;;
        Linux*)
            echo "Linux 系统："
            echo "1. 创建符号链接："
            echo "   sudo ln -s /path/to/cursor /usr/local/bin/cursor"
            echo ""
            echo "2. 或者将 Cursor 添加到 PATH："
            echo "   export PATH=\"\$PATH:/path/to/cursor/bin\""
            ;;
        MINGW*|MSYS*|CYGWIN*)
            echo "Windows 系统："
            echo "1. 重新安装 Cursor，勾选 'Add to PATH' 选项"
            echo "2. 或手动添加到系统环境变量 PATH"
            ;;
        *)
            echo "未知系统，请手动配置 Cursor 命令行工具"
            ;;
    esac
fi

echo ""
echo "=================================="
echo "💡 提示："
echo "   - 配置完成后，重新运行此脚本验证"
echo "   - 详细安装指南: INSTALLATION.md"
echo "   - 快速开始: QUICKSTART.md"
echo "=================================="

