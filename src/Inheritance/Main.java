package Inheritance;

public class Main {
    static void main(String[] args) {
        Youtuber y = new Youtuber("John",20000,"Youtube");
        y.subscribers=5000;
        y.showDetails();
        y.createVideo();

        TikToker t = new TikToker("Mark",10000,"Tiktok");
        t.viralVideos=1000;
        t.showDetails();
        t.doTrendyChallenge();
    }
}
