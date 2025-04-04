    public class Main {
    public static void main(String[] args) {
        //Task 1
        byte y = -126;
        short j = 32560;
        int k = 50000;
        long o = 100000L;
        float i = 65.1298465f;
        double g = 85.989435943;
        System.out.println("Значение переменной y с типом byte равно " +y);
        System.out.println("Значение переменной j с типом short равно " +j);
        System.out.println("Значение переменной k с типом int равно " +k);
        System.out.println("Значение переменной o с типом long равно " +o);
        System.out.println("Значение переменной i с типом float равно " +i);
        System.out.println("Значение переменной g с типом double равно " +g);
        System.out.println();
        //Task 2
        float e = 2.786f;
        long a = 987678965549L;
        float q = 2.786f;
        short n = 569;
        short b = -159;
        short u = 27897;
        byte p = 67;
        System.out.println("Значение переменной e с типом float равно " +e);
        System.out.println("Значение переменной a с типом long равно " +a);
        System.out.println("Значение переменной q с типом float равно " +q);
        System.out.println("Значение переменной n с типом short равно " +n);
        System.out.println("Значение переменной b с типом short равно " +b);
        System.out.println("Значение переменной u с типом short равно " +u);
        System.out.println("Значение переменной p с типом byte равно " +p);
        System.out.println();
        //Task 3
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short sheetsOfPaper = 480;
        int sheetsOfPaperPerPerson = sheetsOfPaper / (teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика расчитано "+sheetsOfPaperPerPerson+" листов бумаги.");
        System.out.println();
        //Task 4
        byte machinePerformance = 16;
        int machinePerformance1 = machinePerformance * 10;
        int machinePerformance2 = machinePerformance * 30 * 24;
        int machinePerformance3 = machinePerformance2 * 3;
        int machinePerformance4 = machinePerformance2 * 31;
        System.out.println("За 20 минут машина произвела " +machinePerformance1+ " штук бутылок.");
        System.out.println("За сутки машина произвела " +machinePerformance2+ " штук бутылок.");
        System.out.println("За 3 дня машина произвела " +machinePerformance3+ " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " +machinePerformance4+ " штук бутылок.");
        System.out.println();
        //Task 5
        byte totalCans = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalClasses = totalCans / (whitePaint+brownPaint);
        int totalWhitePaint = totalClasses * whitePaint;
        int totalBrownPaint = totalClasses * brownPaint;
        System.out.println("В школе, где " +totalClasses+ " классов, нужно " +totalWhitePaint+ " банок белой краски и " +totalBrownPaint+ " банок коричневой краски.");
        System.out.println();
        //Task 6
        int bananasGr = 5 * 80;
        int milkGr = 2 * 105;
        int iceCreamGr = 2 * 100;
        int eggsGr = 4 * 70;
        int weightSportBreakfastGr = bananasGr + milkGr + iceCreamGr + eggsGr;
        float weightSportBreakfastKg = weightSportBreakfastGr * 0.001f;
        System.out.println("Вес спортзавтрака в граммах " +weightSportBreakfastGr);
        System.out.println("Вес спортзавтрака в килограммах " +weightSportBreakfastKg);
        System.out.println();
        //Task 7
        int loseWeight = 7;
        float loseWeightInADay1 = 250 * 0.001f;
        float loseWeightInADay2 = 500 * 0.001f;
        float daysFor250 = loseWeight / loseWeightInADay1;
        float daysFor500 = loseWeight / loseWeightInADay2;
        float daysOnAverage = loseWeight / ((loseWeightInADay1+loseWeightInADay2) / 2);
        System.out.println(daysFor250+ " дней потребуется при похудении на 250 грамм.");
        System.out.println(daysFor500+ " дней потребуется при похудении на 500 грамм.");
        System.out.println(daysOnAverage+ " дней потребуется в среднем.");
        System.out.println();
        //Task 8
        int wagesMary = 67760;
        int wagesDenis = 83690;
        int wagesKristina = 76230;
        int wagesPerYearMary = wagesMary * 12;
        int wagesPerYearDenis = wagesDenis * 12;
        int wagesPerYearKristina = wagesKristina * 12;
        float increaseWagesMary = wagesMary + (wagesMary * 0.1f);
        float increaseWagesDenis = wagesDenis + (wagesDenis * 0.1f);
        float increaseWagesKristina = wagesKristina + (wagesKristina * 0.1f);
        float newWagesPerYearMary = increaseWagesMary * 12;
        float newWagesPerYearDenis = increaseWagesDenis * 12;
        float newWagesPerYearKristina = increaseWagesKristina * 12;
        float differenceMary = newWagesPerYearMary - wagesPerYearMary;
        float differenceDenis = newWagesPerYearDenis - wagesPerYearDenis;
        float differenceKristina = newWagesPerYearKristina - wagesPerYearKristina;
        System.out.println("Маша теперь получает " +increaseWagesMary+ " рублей. Годовой доход вырос на " +differenceMary+ " рублей.");
        System.out.println("Денис теперь получает " +increaseWagesDenis+ " рублей. Годовой доход вырос на " +differenceDenis+ " рублей.");
        System.out.println("Кристина теперь получает " +increaseWagesKristina+ " рублей. Годовой доход вырос на " +differenceKristina+ " рублей.");
    }
}