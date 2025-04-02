    public class Main {
    public static void main(String[] args) {
        int loseWeight = 7;
        float loseWeightInADay1 = 250 * 0.001f;
        float loseWeightInADay2 = 500 * 0.001f;
        float daysFor250 = loseWeight / loseWeightInADay1;
        float daysFor500 = loseWeight / loseWeightInADay2;
        float daysOnAverage = loseWeight / ((loseWeightInADay1+loseWeightInADay2) / 2);
        System.out.println(daysFor250+" дней потребуется при похудении на 250 грамм");
        System.out.println(daysFor500+" дней потребуется при похудении на 500 грамм");
        System.out.println(daysOnAverage+" дней потребуется в среднем");
    }
}