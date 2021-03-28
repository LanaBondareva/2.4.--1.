package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldReturnSum() {
        assertEquals(180, service.sum(purchases));
    }

    @Test
    void shouldReturnAverage() {
        assertEquals(15, service.average(purchases));
    }

    @Test
    void shouldReturnMonthWithMax() {
        assertEquals(8, service.lastNumberWithMax(purchases));
    }

    @Test
    void shouldReturnMonthWithMin() {
        assertEquals(9, service.lastNumberWithMin(purchases));
    }

    @Test
    void shouldCountMoreThanAverage() {
        assertEquals(5, service.moreThanAverage(purchases));
    }

    @Test
    void shouldCountLessThanAverage() {
        assertEquals(5, service.lessThanAverage(purchases));
    }
}
