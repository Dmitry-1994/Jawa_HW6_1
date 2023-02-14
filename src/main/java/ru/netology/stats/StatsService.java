package ru.netology.stats;
public class StatsService {
    public int allSum(int[] sumOfMonth){
        int sum = 0;
        for(int i : sumOfMonth){
            sum = sum + i;
        }
        return sum;
    }

    public int averSum(int[] sumOfMonth){
        return allSum(sumOfMonth) / (sumOfMonth.length);
    }

    public int maxSum(int[] sumOfMonth){
        int maxSumOfMonth = 0;
        for(int i = 0; i < sumOfMonth.length; i++){
            if (sumOfMonth[maxSumOfMonth] <= sumOfMonth[i]){
                maxSumOfMonth = i;
            }
        }
        return maxSumOfMonth;
    }

    public int minSum(int[] sumOfMonth){
        int minSumOfMonth = 0;
        for(int i = 0; i < sumOfMonth.length; i++){
            if (sumOfMonth[minSumOfMonth] >= sumOfMonth[i]){
                minSumOfMonth = i;
            }
        }
        return minSumOfMonth;
    }

    public int lowerAver(int[] sumOfMonth){
        int countLowAver = 0;
        for(int i = 0; i < sumOfMonth.length; i++){
            if (sumOfMonth[i] < averSum(sumOfMonth)) {
                countLowAver = countLowAver + 1;
            }
        }
        return countLowAver;
    }

    public int upperAver(int[] sumOfMonth){
        int countUpAver = 0;
        for(int i = 0; i < sumOfMonth.length; i++){
            if (sumOfMonth[i] > averSum(sumOfMonth)) {
                countUpAver = countUpAver + 1;
            }
        }
        return countUpAver;
    }
}
