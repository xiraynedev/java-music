package com.xiraynedev.app;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.startPlayer();
    }
}
