package ru.netology.stats;

public class StatsService {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int averageAmount(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
        sum +=purchase;
        }
        return sum/purchases.length;
    }

    public int findMax(int[] purchases) {
        int currentMax = purchases[0];
        for (int purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
        }
        public int findMin(int[] purchases) {
        int currentMin = purchases[0];
        for (int purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
            }
        }
