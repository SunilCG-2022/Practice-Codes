package BingeWatch;
import java.util.ArrayList;

class Subscription {
    private String platformName;
    private int totalCharges;

    public Subscription(String platformName, int totalCharges) {
        this.platformName = platformName;
        this.totalCharges = totalCharges;
    }

    public int calculateSubscriptionCost(int months) {
        if (months == 1) {
            return totalCharges;
        } else if (months <= 3) {
            return totalCharges * months - 100;
        } else if (months <= 6) {
            return totalCharges * months - 200;
        } else {
            return totalCharges * months - 300;
        }
    }
}

class BingeWatch extends Subscription {
    private ArrayList<String> topSeries;
    private ArrayList<String> watchedSeries;

    public BingeWatch(String platformName, int totalCharges, ArrayList<String> topSeries, ArrayList<String> watchedSeries) {
        super(platformName, totalCharges);
        this.topSeries = topSeries;
        this.watchedSeries = watchedSeries;
    }

    public int calculateWatchingTime() {
        int totalWatchingTime = 0;

        for (String series : watchedSeries) {
            if (topSeries.contains(series)) {
                totalWatchingTime += 1;
            } else {
                totalWatchingTime += 2;
            }
        }
        return totalWatchingTime;
    }
}