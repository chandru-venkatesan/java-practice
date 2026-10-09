package method_overloading;

public class Main {
    static void main(String[] args) {
        Musicplayer m = new Musicplayer();
        m.playSong("SkyFall");
        m.playSong("SkyFall","Adele");
        m.playSong(400);
    }
}
