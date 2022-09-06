![openjdk](https://img.shields.io/badge/openjdk-11.0.16-informational)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-3.6.3-red)

# java-music-player

The Java Music player is equipped with options to play, stop, reset, change, and quit songs.

![project screenshot](images/project-screenshot.png)

Installation

1. Clone the repo:

```sh
git clone https://github.com/xiraynedev/java-music-player.git
```

2. Run:

```sh
mvn package
```

3. Start the project by running:

```sh
java -cp target/java-music-player-1.0-SNAPSHOT.jar com.xiraynedev.app.App
```

If this error occurs in Linux,

`java.lang.IllegalArgumentException: No line matching interface Clip supporting format PCM_SIGNED 22000.0 Hz, 16 bit, mono, 2 bytes/frame, little-endian, and buffers of 4610 to 4610 bytes is supported`,

be sure to install PulseAudio with `sudo apt install pulseaudio`
