class MusicStylesys {
    public void playMusic(){
        System.out.println("Play music.");
    }
}
class PopMusic extends MusicStylesys {
    @Override
    public void playMusic() {
        System.out.println("Playing pop music..");
    }
}
class RockMusic extends MusicStylesys{
    @Override
    public void playMusic() {
        System.out.println("Playing rock music..");
    }
}
class ClassicMusic extends MusicStylesys{
    @Override
    public void playMusic() {
        System.out.println("Playing classic music..");
    }
}

public class MusicStyles  {
    public static void main(String[] args) {
        MusicStylesys popBand = new PopMusic();
        MusicStylesys rockBand = new RockMusic();
        MusicStylesys classicBand = new ClassicMusic();

        MusicStylesys[] musicBands = {popBand, rockBand, classicBand};
        for (MusicStylesys band:musicBands) {
            band.playMusic();
        }
    }
}
