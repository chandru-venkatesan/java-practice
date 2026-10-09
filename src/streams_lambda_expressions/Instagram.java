package streams_lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Instagram {
    static void main(String[] args) {
        List<String> userNames = Arrays.asList("john_doe","genz_gamer","tech_wizard","foodie_queen");
       List <String> capitalNames =  userNames.stream().map(name->name.substring(0,1).toUpperCase()+name.substring(1)).collect(Collectors.toList());

        System.out.println("User Names: "+ capitalNames);
    }
}
