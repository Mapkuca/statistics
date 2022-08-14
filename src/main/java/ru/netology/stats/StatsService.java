package ru.netology.stats;

// 1. Сумма всех продаж
public class StatsService {
    public int allSalesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // 2. Средняя сумма продаж в месяц
    public int monthAverageSum(int[] sales) {
        return allSalesSum(sales) / sales.length;

    }

    // 3. Номер месяца, в котором был пик продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // 4. Номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего
    public int monthCountBelowAverage(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale < monthAverageSum(sales)) {
                month++;
            }

        }
        return month;
    }

    // 6. Кол-во месяцев, в коорых продажи были выше среднего
    public int monthCountAboveAverage(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale >= monthAverageSum(sales)) {
                month++;
            }
        }
        return month;
    }
}