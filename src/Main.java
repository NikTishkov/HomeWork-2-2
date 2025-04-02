    public class Main {
    public static void main(String[] args) {
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
        System.out.println("Маша теперь получает "+increaseWagesMary+" рублей. Годовой доход вырос на "+differenceMary+" рублей.");
        System.out.println("Маша теперь получает "+increaseWagesDenis+" рублей. Годовой доход вырос на "+differenceDenis+" рублей.");
        System.out.println("Маша теперь получает "+increaseWagesKristina+" рублей. Годовой доход вырос на "+differenceKristina+" рублей.");
    }
}