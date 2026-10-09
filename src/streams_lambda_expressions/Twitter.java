package streams_lambda_expressions;

import java.util.Arrays;
import java.util.List;

public class Twitter {
    static void main(String[] args) {
        List<String> tweets = Arrays.asList("Just Watched the Latest Tech Review! #GenZ #Tech",
                "Morning vibes with Coffe #Aesthetic #GenZ",
                "Best gaming setup Ever! #GenZ #Gaming",
                "Throwback to my Travel advendures");

        long t = tweets.stream().filter(tweet-> tweet.contains("#GenZ")).count();
        System.out.println(t);
    }
}
