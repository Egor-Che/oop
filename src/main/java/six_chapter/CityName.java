package six_chapter;

public class CityName {
    private static String cityName = new String("Khimki");
    public CityName() {
        this.cityName = String.valueOf(getCityName());
    }
    public static String getCityName() {
        return cityName;
    }
    public static Object setCityName(String cityName) {
        CityName.cityName = cityName;
        return cityName;
    }

    @Override
    public String toString() {
        return "CityName{}";
    }
}

