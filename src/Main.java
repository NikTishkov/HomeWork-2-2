    public class Main {
    public static void main(String[] args) {
        byte totalCans = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalClasses = totalCans / (whitePaint+brownPaint);
        int totalWhitePaint = totalClasses * whitePaint;
        int totalBrownPaint = totalClasses * brownPaint;
        System.out.println("В школе, где "+totalClasses+" классов, нужно "+totalWhitePaint+" банок белой краски и "+totalBrownPaint+" банок коричневой краски.");
    }
}