package streams_lambda_expressions;

import java.util.Arrays;
import java.util.List;

public class YoutubeMain {
    static void main(String[] args) {
        List<Youtube> videos = Arrays.asList(new Youtube("AI Revolution",2000000),
                new Youtube("Java Tutorial",900000),
                new Youtube("Tech News",1500000),
                new Youtube("Gaming Highlights",800000));

        System.out.println("Trending Videos with 1M+ Views: ");

        videos.stream().filter(y -> y.getViews() > 1000000).map(Youtube::getVideoName).forEach(System.out::println);
    }
}
