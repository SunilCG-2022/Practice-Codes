package BingeWatch;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> topSeries = new ArrayList<>();
        topSeries.add("Series1");
        topSeries.add("Series2");
        topSeries.add("Series3");

        ArrayList<String> watchedSeries = new ArrayList<>();
        watchedSeries.add("Series1");
        watchedSeries.add("Series4");
        watchedSeries.add("Series2");

        BingeWatch bingeWatch = new BingeWatch("Platform", 100, topSeries, watchedSeries);

        int watchingTime = bingeWatch.calculateWatchingTime();
        System.out.println("Total Watching Time: " + watchingTime);

        int subscriptionCost = bingeWatch.calculateSubscriptionCost(3);
        System.out.println("Subscription Cost: " + subscriptionCost);
    }
}