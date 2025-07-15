package Aulas.Interfaces.MediaPlayer;

public class Computer implements VideoPlayer, MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("PC tocando música.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("PC pausando música.");
    }

    @Override
    public void stopMusic() {
        System.out.println("PC parando música.");
    }

    @Override
    public void playVideo() {
        System.out.println("PC tocando vídeo.");
    }

    @Override
    public void pauseVideo() {
        System.out.println("PC pausando vídeo.");
    }

    @Override
    public void stopVideo() {
        System.out.println("PC parando vídeo.");
    }

}
