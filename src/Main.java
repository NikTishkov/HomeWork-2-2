    public class Main {
    public static void main(String[] args) {
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short sheetsOfPaper = 480;
        int sheetsOfPaperPerPerson = sheetsOfPaper / (teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика расчитано "+sheetsOfPaperPerPerson+" листов бумаги.");
    }
}