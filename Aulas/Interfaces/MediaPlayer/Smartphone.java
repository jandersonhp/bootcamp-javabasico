package Aulas.Interfaces.MediaPlayer;

public class Smartphone implements VideoPlayer, MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("Cel tocando música.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Cel pausando música.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Cel parando música.");
    }

    @Override
    public void playVideo() {
        System.out.println("Cel tocando vídeo.");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Cel pausando vídeo.");
    }

    @Override
    public void stopVideo() {
        System.out.println("Cel parando vídeo.");
    }

}
