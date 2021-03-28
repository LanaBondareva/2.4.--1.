package ru.netology.stats;

public class StatsService {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public int sum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int average(int[] purchases) {
        int sum = sum(purchases);
        return sum / purchases.length;
    }


    public int lastNumberWithMax(int[] purchases) {
        int max = getMax(purchases);

        int monthCount = 0;
        int resultMonth = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == max) {
                resultMonth = monthCount;
            }
        }
        return resultMonth;
    }

    public int lastNumberWithMin(int[] purchases) {
        int min = getMin(purchases);

        int monthCount = 0;
        int resultMonth = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == min) {
                resultMonth = monthCount;
            }
        }
        return resultMonth;
    }

    public int moreThanAverage(int[] purchases) {
        int monthCount = 0;
        int average = average(purchases);
        for (int purchase : purchases) {
            if (purchase > average(purchases)) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int lessThanAverage(int[] purchases) {
        int monthCount = 0;
        int average = average(purchases);
        for (int purchase : purchases) {
            if (purchase < average(purchases)) {
                monthCount++;
            }
        }
        return monthCount;
    }

    private int getMax(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        return max;
    }

    private int getMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }
}
