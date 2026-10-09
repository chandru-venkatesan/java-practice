package streams_lambda_expressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SubscriptionPlanMain {
    static void main(String[] args) {
        List<SubscriptionPlan> sp = Arrays.asList(new SubscriptionPlan("Basic Plan",59),
                new SubscriptionPlan("Standard Plan",199),
                new SubscriptionPlan("Premium Plan",299));

        Optional<SubscriptionPlan> ep = sp.stream().max(Comparator.comparing(SubscriptionPlan::getPrice));
        ep.ifPresent(p-> System.out.println("Most expensive Subcsription Plan: "+ p.getPlanName()+" Rs. "+ p.getPrice()));
    }
}
