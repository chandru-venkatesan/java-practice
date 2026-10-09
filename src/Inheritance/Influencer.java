package Inheritance;

public class Influencer {
    String name;
    int followers;
    String platForm ;
    Influencer(String name,int followers,String platForm){
        this.name = name;
        this.followers = followers;
        this.platForm = platForm;
    }

    public Influencer() {

    }

    void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Followers: "+followers);
        System.out.println("Platform: "+platForm);
    }

}
