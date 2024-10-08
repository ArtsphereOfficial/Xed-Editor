package com.rk.xededitor.Settings

object Keys {
    //try to avoid using spacial characters in keys except _
    const val PIN_LINE_NUMBER = "pinline"
    const val WORD_WRAP_ENABLED = "wordwrap"
    const val TAB_SIZE = "tabsize"
    const val CURSOR_ANIMATION_ENABLED = "CursorAnimation"
    const val TEXT_SIZE = "textsize"
    const val USE_SPACE_INTABS = "useSpaces"
    const val SHOW_ARROW_KEYS = "show_arrows"
    const val OLED = "isOled"
    const val MONET = "isMonet"
    const val DEFAULT_NIGHT_MODE = "default_night_mode"
    const val ENABLE_PLUGINS = "enablePlugin"
    const val SELECTED_THEME = "selected_theme"
    const val THEMES = "Themes"
    const val KEEP_DRAWER_LOCKED = "keepdrawerlocked"
    const val DIAGONAL_SCROLL = "diagnolScroll"
    const val SHOW_LINE_NUMBERS = "showlinenumbers"
    const val AUTO_SAVE = "auto_save"
    const val AUTO_SAVE_TIME = "auto_save_time"
    const val AUTO_SAVE_TIME_VALUE = "auto_save_time_value"
    const val VERSION_CODE = "version_code"
    const val PROJECTS = "opened_projects"
    const val START_SHELL_PREF = "start_shell"
    const val SHELL = "shell"
    const val FAIL_SAFE = "failsafe"
    const val LINK2SYMLINK = "link2symlink"
    const val ASHMEM_MEMFD = "ashmem_memfd"
    const val SYSVIPC = "sysvipc"
    const val KILL_ON_EXIT = "kill-on_exit"
    const val MANAGE_PLUGINS="manage_plugins"
    const val FORCE_CHAR="force_char_in_terminal"
    const val CTRL_WORKAROUND="ctrlworkaround"
    //todo encrypt git keys
    const val GIT_CREDENTIALS = "git_credentials"
    const val GIT_CRED = "git_cred"
    const val GIT_USER = "git_user"
    const val GIT_USER_DATA = "git_user_data"
    const val GIT_DIR = "git_dir"
    const val GIT_REPO_DIR = "git_repo_dir"
    const val TERMINAL_TEXT_SIZE_PREF = "terminal_text_size_pref"
    const val TERMINAL_TEXT_SIZE = "terminal_text_size"
    const val VIEWPAGER_SMOOTH_SCROLL = "viewpager_smooth_scroll"

    //used in SettingsMainActivity and these are not real settings
    const val APPLICATION = "app_"
    const val EDITOR = "editor_"
    const val PLUGINS = "plugins_"
    const val TERMINAL = "terminal_"
    const val GIT = "git_"
}