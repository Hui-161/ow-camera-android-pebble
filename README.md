# OW Camera 2 for Pebble

👉⌚️ [Pebble Watch App Project](https://github.com/jamsinclair/ow-camera-remote)

OW Camera 2 for Pebble is a fork of the Open Camera app, which specfically adds support for remote shutter control via Pebble smartwatches. This the successor to my previous OW Camera for Pebble app, which is no longer available on the Google Play Store. It is using the latest Pebblekit SDK that is still a work-in-progress, [pebble-dev/PebbleKitAndroid2](https://github.com/pebble-dev/PebbleKitAndroid2).

The rest of the app is mostly unchanged from Open Camera, with additional background logic for sending preview images and some minor tweaks to the user interface and strings.

There are three branches I am maintaining:
- [master](https://github.com/jamsinclair/ow-camera-android/tree/master): Unchanged and will be kept in sync with Open Camera releases.
- [development](https://github.com/jamsinclair/ow-camera-android/tree/development): Adds support for Pebble remote shutter control without modifying the original namespace.
- [release](https://github.com/jamsinclair/ow-camera-android/tree/release): Renames the namespace to `com.github.jamsinclair.owcamera2` and should be used for any builds intended for release.

## Changes in this fork

On top of upstream `development`:

- **Back from the settings works on Android 16.** The app targets API 36, where predictive back no longer calls `onBackPressed()`; back from a settings screen used to send the whole app to the background. Every settings screen also starts with a "Back to camera" entry.
- **Shorter settings.** The main screen starts with a "Pebble watch" section holding the options that matter when the watch takes the photo (keep display on, show when locked, pause after photo, timer beep and voice). Camera preview, on-screen GUI, video, location and processing moved into "Advanced…". Preference keys are unchanged, so existing settings carry over.
- **Save location toast.** After a photo taken from the watch the app shows where it was saved (by default `DCIM/OpenCamera`, not the system camera's `DCIM/Camera`).

## Installation

[<img src="https://github.com/machiav3lli/oandbackupx/blob/034b226cea5c1b30eb4f6a6f313e4dadcbb0ece4/badge_github.png" alt="Get it on GitHub" height="80">](https://github.com/jamsinclair/ow-camera-android/releases/latest)
[<img src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" alt="Get it on Google Playstore" height="80">](https://play.google.com/store/apps/details?id=com.github.jamsinclair.owcamera2)
[<img src="./docs/badge_obtainium.png" alt="Get it on Obtainium" height="80">](https://apps.obtainium.imranr.dev/redirect?r=obtainium://add/https://github.com/jamsinclair/ow-camera-android)

Verification for non-playstore builds:
- Package ID: com.github.jamsinclair.owcamera2
- SHA-256 hash of signing certificate: 661c7a9c391759c3c218b0f0aa9aa00067869c18c4d9c9ab6d82bc1563962ad8

## License

This project is licensed under the GNU General Public License v3.0 as per the original Open Camera project. See [gpl-3.0.txt](gpl-3.0.txt) for details.

## References
- [Open Camera Website and Source](https://opencamera.org.uk/)
- [Pebble Smartwatch Developer Resources](https://developer.repebble.com/)
