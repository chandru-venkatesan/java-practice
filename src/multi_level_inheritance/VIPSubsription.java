package multi_level_inheritance;

public class VIPSubsription extends  PremiumSubscription{
    void accessExclusiveShows(){
        System.out.println(userName+" , VIP Subscriber has an access to Exclusive Shows");
    }
}
