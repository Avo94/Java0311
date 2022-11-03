public class China {
    public static void main(String[] args) {

        // First level
        long chinesePopulation = 1_411_778_724;
        int countriesAmount = 197;
        long earthPopulation = chinesePopulation * countriesAmount;

        System.out.println(earthPopulation);

        // Second level
        long felixLifeSeconds = 3_011_456_567L;
        int minute = 60;
        int hour = 60;
        double day = 24;
        int year = 365;
        double felixLifeYears = felixLifeSeconds / (minute * hour * day * year);

        System.out.println(felixLifeYears);
    }
}
