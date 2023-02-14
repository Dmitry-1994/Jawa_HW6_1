package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void allSum(){
        StatsService calculate = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = calculate.allSum(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averSum(){
        StatsService calculate = new StatsService();
        int[] data = {8, 25, 33, 55, 4};
        int expected = 25;
        int actual = calculate.averSum(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSum(){
        StatsService calculate = new StatsService();
        int[] data = {55, 0, 12, 54, 34, 55, 55};
        int expected = 6;
        int actual = calculate.maxSum(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSum(){
        StatsService calculate = new StatsService();
        int[] data = {55, 0, 12, 54, 34, 55, 70, 0};
        int expected = 7;
        int actual = calculate.minSum(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerAver(){
        StatsService calculate = new StatsService();
        int[] data = {5, 0, 12, 14, 134, 55, 700, 0, 25, 38, 25, 0};
        int expected = 10;
        int actual = calculate.lowerAver(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upperAver(){
        StatsService calculate = new StatsService();
        int[] data = {5, 0, 12, 14, 134, 55, 700, 0, 25, 38, 25, 0};
        int expected = 2;
        int actual = calculate.upperAver(data);
        Assertions.assertEquals(expected, actual);
    }
}
