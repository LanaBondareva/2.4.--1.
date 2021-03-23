package ru.netology.stats;

public class StatsService {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        System.out.println("Сумма всех продаж: " + sum);
        return sum;
    }

    public int findMax(int[] purchases) {
        int currentMax = purchases[0];
        for (int purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        System.out.println("Средняя сумма всех продаж: " + currentMax);
        return currentMax;
    }
        public int findPeak(int[] month){
            int index = 0;
            for (int i = 1; i <= purchases.length; i++) {
                if (purchases[index] < purchases[i])
                    index = i;
                System.out.println("Номер месяца с пиком продаж: " + month[index]);
            }
            return month[index];
        }
    }
