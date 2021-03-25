package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void averageAmount() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageAmount(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatsService service = new StatsService();
        int expected = 20;
        int actual = service.findMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatsService service = new StatsService();
        int expected = 7;
        int actual = service.findMin(purchases);
        assertEquals(expected, actual);
    }
}



