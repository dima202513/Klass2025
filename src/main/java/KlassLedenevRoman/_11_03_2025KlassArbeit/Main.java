package KlassLedenevRoman._11_03_2025KlassArbeit;


public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season);
        System.out.println(Season.SPRING);
        System.out.println(Season.FALL);
        System.out.println(Season.SUMMER);
        System.out.println(SeasonConstats.WINTER);
        System.out.println(SeasonConstats.SPRING);
        System.out.println(SeasonConstats.SUMMER);
        System.out.println(SeasonConstats.FALL);

        String[] seasonConstats = {SeasonConstats.FALL, SeasonConstats.WINTER, SeasonConstats.SUMMER, SeasonConstats.SPRING,};

        Season[] seasons = Season.values();
        for (Season s : Season.values()) {
            System.out.println(s);
        }

        Season season1 = Season.valueOf("WINTER");
        Season season2 = Enum.valueOf(Season.class, "WINTER");
        System.out.println(season1);

        System.out.println(Season.WINTER.name());
        System.out.println(Season.WINTER.ordinal());

        BadYear badYear = new BadYear();
        badYear.addSeason((SeasonConstats.WINTER));
        badYear.addSeason((SeasonConstats.SPRING));
        badYear.addSeason((SeasonConstats.SUMMER));
        badYear.addSeason((SeasonConstats.FALL));
//
//        GoodYear goodYear = new GoodYear();
//        goodYear.addSeason((SeasonConstats.WINTER));
//        goodYear.addSeason((SeasonConstats.SPRING));
//        goodYear.addSeason((SeasonConstats.SUMMER));
//        goodYear.addSeason((SeasonConstats.FALL));

//
//        System.out.println(badYear);
//        System.out.println(goodYear);
////
//        for (Country country : Country.values())
//            System.out.println(country.name() + "this is country currency");
//        System.out.println(country.getCurrency() + "this is country currency");
//        if (country.getCurrency() == null) {
//            country.setCurrency()
//        }

    }

}
