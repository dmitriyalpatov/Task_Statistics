public class StatsService {

    //Суммa всех продаж
    public int totalSales(int[] sales) {
        int total = 0;
        for (int sumOfAllSales : sales) {
            total += sumOfAllSales;
        }
        return total;
    }

    //Среднюю сумму продаж в месяц

    public int  averageAmountOfSalesPerMonth(int[] sales) {
        return totalSales(sales) / sales.length;
    }

    //Номер месяца, в котором был пик продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {


            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int underAverageSales(int[] sales) {
        int month = 0;
        int averageSales =  averageAmountOfSalesPerMonth(sales);
        for (int sale : sales) {
            if (sale < averageSales) {
                month++;
            }
        }
        return month;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int overAverageSales(int[] sales) {
        int month = 0;
        int averageSales =  averageAmountOfSalesPerMonth(sales);
        for (int sale : sales) {
            if (sale > averageSales) {
                month++;
            }
        }
        return month;}
}
