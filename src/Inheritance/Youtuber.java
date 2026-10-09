package Inheritance;

public class Youtuber extends Influencer{
    int subscribers;

    Youtuber(String name, int followers, String platForm) {
        super(name, followers, platForm);
    }

    void createVideo(){
        System.out.println(name+" is creating a Video");
    }
}
