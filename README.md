# CubicPaper - Infinite height simulated

This is a fork of paper that aims to simulate infinite height worlds in vanilla minecraft

The idea is to store chunk sections as individual files and stitch them together as needed in order to simulate infinite height, based on where the player is

This will create an ideally seamless experience for the player, with no need to worry about the world height limit

More implementation details will be documented later

## Plugin (NotSoCubic)

There is also a plugin module (`plugin/NotSoCubic`) that is there to deal with command and other utilities, it will hook into the server API

This decision was to make sure the server is not too bloated with changes, making upgrading easier

*All non-core functionality should be in the plugin*

This is a normal paper plugin configured with gradle, so `./gradlew build` is your goto


## Building

`./gradlew applyPatches` will apply all patches


Make changes to the source code in the cubicpaper-server (or cubicpaper-api) folder

Then, *inside that folder* run `git add .` and `git commit` to commit the changes for a patch

Then, run `./gradlew applyPatches` *in the base directory* to apply the patches

`./gradlew runDev` in the base directory is a great way to test the server

Do `./gradlew createReobfPaperclipJar` to build a production-ready paperclip jar


## Contributing

Talk to `xboxbedrock` or `morpheus3866` on discord if you want to contribute, any help is welcomed!


