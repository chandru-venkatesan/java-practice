package streams_lambda_expressions;

public class Youtube {
    String videoName;
    int views;

    Youtube(String videoName,int views){
        this.videoName=videoName;
        this.views = views;
    }

    String getVideoName(){
        return videoName;
    }
    int getViews(){
        return views;
    }
}
