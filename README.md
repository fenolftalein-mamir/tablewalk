<h1 align="center">tablewalk</h1>

<img src="https://github.com/fenolftalein-mamir/tablewalk/blob/v3_openjdk/app_pojavlauncher/src/main/assets/tablewalk.png" align="left" width="130" height="130" alt="tablewalk logo">

[![Android CI](https://github.com/fenolftalein/tablewalk/workflows/Android%20CI/badge.svg)](https://github.com/fenolftalein-mamir/tablewalk/actions)
[![GitHub commit activity](https://img.shields.io/github/commit-activity/m/fenolftalein-mamir/tablewalk)](https://github.com/fenolftalein-mamir/tablewalk/actions)


*From [Boardwalk](https://github.com/zhuowei/Boardwalk)'s ashes and [PojavLauncher](https://github.com/PojavLauncherTeam/PojavLauncher)'s work, using [Amethyst](https://github.com/AngelAuraMC/Amethyst-Android) as base, presenting tablewalk!*

tablewalk is an app to run the block game on your Android device, built with extra patches.

## things

* [Introduction](#introduction)
* [Getting Amethyst](#getting-amethyst)
* [Building](#building)
    * [Quick Build (Recommended)](#quick-build-recommended)
    * [Detailed Build](#detailed-build)
* [Current Status](#current-status)
* [Known Issues](#known-issues)
* [FAQ](#faq)
* [Contributing](#contributing)
* [Support](#support)
* [License](#license)
* [Credits & Dependencies](#credits--dependencies)
* [Roadmap](#roadmap)

## Introduction

* tablewalk is a launcher for running the block game on Android, based on [Amethyst](https://github.com/AngelAuraMC/Amethyst-Android), which is a fork of [PojavLauncher](https://github.com/PojavLauncherTeam/PojavLauncher) which is a fork of [Boardwalk](https://github.com/zhuowei/Boardwalk).
* This launcher can launch almost all available Minecraft versions ranging from rd-132211 to 1.21 snapshots (including Combat Test versions)
* Mod loaders can be installed, meaning you can utilize Forge, Fabric, Quilt, Neoforge and maybe more mod loaders to load mods.

## Installing tablewalk

Easy method: You can **download the latest prebuilt app** from [nightly.link](https://nightly.link/fenolftalein-mamir/tablewalk/workflows/android/v3_openjdk/app-debug.zip) or **select an older version** from our [automatic builds](https://github.com/fenolftalein-mamir/tablewalk/actions).

Or if you prefer building from source, follow the instructions here: [building instructions](#building) 

## Building

### Quick Build (Recommended)

The easiest way to build tablewalk is to use the pre-built JREs provided by our CI.

1. Clone the repository: `git clone --recursive https://github.com/fenolftalein-mamir/tablewalk.git`
2. Build the launcher: `./gradlew :app_pojavlauncher:assembleDebug` (Use `gradlew.bat` on Windows)

The built APK will be located in `app_pojavlauncher/build/outputs/apk/debug/`.

### Detailed Build

If you need more control over the build process, follow these steps:

1. **Java Runtime Environment (JRE):** Download the `jre8-pojav` artifact from our [CI auto builds](https://github.com/fenolftalein-mamir/openjdk-build-multiarch/actions).  This package contains pre-built JREs for all supported architectures.  If you need to build the JRE yourself, follow the instructions in the [android-openjdk-build-multiarch](https://github.com/fenolftalein-mamir/openjdk-build-multiarch) repository.

2. **LWJGL:** The build instructions for the custom LWJGL are available over the [LWJGL repository](https://github.com/fenolftalein-mamir/lwjgl3).

3. **Language List:** Because languages are auto-added by Crowdin, you need to run the language list generator before building. In the project directory, run:
   * Linux/macOS:
     ```bash
     chmod +x scripts/languagelist_updater.sh
     bash scripts/languagelist_updater.sh
     ```
   * Windows:
     ```batch
     scripts\languagelist_updater.bat
     ```

4. **Build GLFW stub:** `./gradlew :jre_lwjgl3glfw:build`

5. **Build the launcher:** `./gradlew :app_pojavlauncher:assembleDebug` (Replace `gradlew` with `gradlew.bat` on Windows).

## Current Status 

This is the list from [Amethyst](https://github.com/AngelAuraMC/Amethyst-Android).
* [x] OpenJDK 8 Mobile port: ARM32, ARM64, x86, x86_64
* [x] OpenJDK 17 Mobile port: ARM32, ARM64, x86, x86_64
* [x] OpenJDK 21 Mobile port: ARM32, ARM64, x86, x86_64
* [x] Headless mod installer
* [x] Mod installer with GUI
* [x] OpenGL in OpenJDK environment
* [x] OpenAL (works on most devices)
* [x] Support for Minecraft 1.12.2 and below
* [x] Support for Minecraft 1.13 and above
* [x] Support for Minecraft 1.17 (22w13a) and above
* [x] Game surface zooming
* [x] New input pipe rewritten to native code
* [x] Rewritten entire controls system
* [ ] More to come!

At the moment, no status page for tablewalk.
## Known Issues

See the [issue page](https://github.com/fenolftalein-mamir/tablewalk/issues) for a list of known issues and their current status.

## Contributing

You can contribute to the project not only with code, you can also translate.

Any code change or translation should be submitted as a pull request. The description should explain what the code does and give steps to execute it/what language is translated.

## License

This project is licensed under [GNU LGPLv3](https://github.com/fenolftalein-mamir/tablewalk/blob/v3_openjdk/LICENSE).

## Credits & Dependencies

* [Boardwalk](https://github.com/zhuowei/Boardwalk) (JVM Launcher): Unknown License/[Apache License 2.0](https://github.com/zhuowei/Boardwalk/blob/master/LICENSE) or GNU GPLv2.
* [PojavLauncher](https://github.com/PojavLauncherTeam/PojavLauncher): [GLGPL](https://github.com/PojavLauncherTeam/PojavLauncher/blob/v3_openjdk/LICENSE)
* Android Support Libraries: [Apache License 2.0](https://android.googlesource.com/platform/prebuilts/maven_repo/android/+/master/NOTICE.txt).
* [GL4ES](https://github.com/AngelAuraMC/gl4es): [MIT License](https://github.com/ptitSeb/gl4es/blob/master/LICENSE).
* [MobileGlues](https://github.com/MobileGL-Dev/MobileGlues): [LGPL-2.1 License](https://github.com/MobileGL-Dev/MobileGlues/blob/dev-es/LICENSE).
* [ANGLE](https://chromium.googlesource.com/angle/angle): [All Rights Reserved](app_pojavlauncher/src/main/assets/licenses/ANGLE_LICENSE).
* [OpenJDK](https://github.com/AngelAuraMC/openjdk-multiarch-jdk8u): [GNU GPLv2 License](https://openjdk.java.net/legal/gplv2+ce.html).
* [LWJGL3](https://github.com/AngelAuraMC/lwjgl3): [BSD-3 License](https://github.com/LWJGL/lwjgl3/blob/master/LICENSE.md).
* [LWJGLX](https://github.com/AngelAuraMC/lwjglx) (LWJGL2 API compatibility layer for LWJGL3): unknown license.
* [Mesa 3D Graphics Library](https://gitlab.freedesktop.org/mesa/mesa): [MIT License](https://docs.mesa3d.org/license.html).
* [pro-grade](https://github.com/pro-grade/pro-grade) (Java sandboxing security manager): [Apache License 2.0](https://github.com/pro-grade/pro-grade/blob/master/LICENSE.txt).
* [bhook](https://github.com/bytedance/bhook) (Used for exit code trapping): [MIT license](https://github.com/bytedance/bhook/blob/main/LICENSE).
* [libepoxy](https://github.com/anholt/libepoxy): [MIT License](https://github.com/anholt/libepoxy/blob/master/COPYING).
* [virglrenderer](https://github.com/AngelAuraMC/virglrenderer): [MIT License](https://gitlab.freedesktop.org/virgl/virglrenderer/-/blob/master/COPYING).
* [OpenAL-Soft](https://github.com/kcat/openal-soft): [GNU GPLv2](app_pojavlauncher/src/main/assets/licenses/OPENAL-SOFT_GPL2)
  * [oboe](https://github.com/google/oboe): [Apache License 2.0](app_pojavlauncher/src/main/assets/licenses/OBOE_APACHE2).
  * [pfffft](https://bitbucket.org/jpommier/pffft/src/master/): [ARR](app_pojavlauncher/src/main/assets/licenses/PFFFT_LICENSE)
* [SDL3](https://github.com/libsdl-org/SDL): [zlib License](https://github.com/libsdl-org/SDL/blob/main/LICENSE.txt)
* [sdl2-compat](https://github.com/libsdl-org/sdl2-compat): [zlib License](https://github.com/libsdl-org/sdl2-compat/blob/main/LICENSE.txt)
* [MojoLauncher](https://github.com/MojoLauncher/MojoLauncher) (a lot of ely.by code is taken from here): [LGPL-3.0 License](https://github.com/MojoLauncher/MojoLauncher/blob/v3_openjdk/LICENSE)
* [authlib-injector](https://github.com/yushijinhun/authlib-injector) (used for ely.by support): [AGPL-3.0](https://github.com/yushijinhun/authlib-injector/blob/develop/LICENSE).
* Thanks to [MCHeads](https://mc-heads.net) for providing Minecraft avatars.

## Roadmap

We are currently focusing on:

* Exploring new rendering technologies.

Future plans include:

* Improving stability and performance.
* Enhancing the mod installation experience.

We welcome community feedback and suggestions for our roadmap.  Please feel free to open a feature request in our [issue tracker](https://github.com/fenolftalein-mamir/tablewalk/issues).
