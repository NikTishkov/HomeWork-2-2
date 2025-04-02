    public class Main {
    public static void main(String[] args) {
        byte machinePerformance = 16;
        int machinePerformance1 = machinePerformance * 10;
        int machinePerformance2 = machinePerformance * 30 * 24;
        int machinePerformance3 = machinePerformance2 * 3;
        int machinePerformance4 = machinePerformance2 * 31;
        System.out.println("За 20 минут машина произвела "+machinePerformance1+" штук бутылок.");
        System.out.println("За сутки машина произвела "+machinePerformance2+" штук бутылок.");
        System.out.println("За 3 дня машина произвела "+machinePerformance3+" штук бутылок.");
        System.out.println("За 1 месяц машина произвела "+machinePerformance4+" штук бутылок.");
    }
}