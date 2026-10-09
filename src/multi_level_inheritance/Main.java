package multi_level_inheritance;

public class Main {
    static void main(String[] args) {
        VIPSubsription vip = new VIPSubsription();
        vip.userName ="Joe";
        vip.subscriptionType = "VIP";
        vip.showSubscription();
        vip.downloadcontent();
        vip.accessExclusiveShows();



    }
}
