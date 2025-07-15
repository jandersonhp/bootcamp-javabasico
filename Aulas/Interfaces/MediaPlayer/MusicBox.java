package Aulas.Interfaces.MediaPlayer;

public class MusicBox implements MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("Caixinha tocando música.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Caixinha pausando música.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Caixinha parando música.");
    }

}
