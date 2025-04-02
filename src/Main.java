    public class Main {
    public static void main(String[] args) {
        int bananasGr = 5 * 80;
        int milkGr = 2 * 105;
        int iceCreamGr = 2 * 100;
        int eggsGr = 4 * 70;
        int weightSportBreakfastGr = bananasGr + milkGr + iceCreamGr + eggsGr;
        float weightSportBreakfastKg = weightSportBreakfastGr * 0.001f;
        System.out.println("Вес спортзавтрака в граммах "+weightSportBreakfastGr);
        System.out.println("Вес спортзавтрака в килограммах "+weightSportBreakfastKg);
    }
}