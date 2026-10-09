package Inheritance;

public class TikToker extends Influencer{
    int viralVideos;

    public TikToker (String name, int followers, String platForm) {
        super(name, followers, platForm);
    }

    void doTrendyChallenge(){
        System.out.println(name+" is doing a trendy Challenge");
    }
}
