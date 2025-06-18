package ru.egor_che.six_chapter;

public class City {
    private CityName cityName;

    public City(CityName cityName) {
        this.cityName = cityName;
    }

    public CityName getCityName() {
        return cityName;
    }

    public void setCityName(CityName cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName=" + cityName +
                '}';
    }
}
/*
A - Химки
B - Владимир
C - Рязань
D - Сочи
E - Калуга
F - Москва
*/