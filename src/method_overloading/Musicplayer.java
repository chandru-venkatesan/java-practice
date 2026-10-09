package method_overloading;

public class Musicplayer {
    void playSong(String songName){
        System.out.println("Name of the song : "+songName);
    }
    void playSong(String songName,String artistName){
        System.out.println("Song Name: "+songName+ " and Artist name: "+artistName);
    }
    void playSong(int durationInSeconds){
        System.out.println("Song Duration : "+durationInSeconds+ " seconds");
    }
}
