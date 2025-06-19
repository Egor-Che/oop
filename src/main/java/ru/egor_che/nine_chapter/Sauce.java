package ru.egor_che.nine_chapter;

public class Sauce {
    private final String name;
    private final Spiciness spiciness;

    // Перечисление для остроты
    public enum Spiciness {
        VERY_SPICY("очень острый"),
        SPICY("острый"),
        NOT_SPICY("не острый");

        private final String description;

        Spiciness(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    // Конструктор
    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    // Текстовое представление
    @Override
    public String toString() {
        return String.format("Соус %s: %s", name, spiciness.getDescription());
    }
}
