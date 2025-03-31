package seven_chapter;
import java.util.ArrayList;
import java.util.List;

public class Student {
    // Поля класса (инкапсулированы)
    private final String name;  // обязательное поле, неизменяемое после создания
    private final List<Integer> grades;  // список оценок

    // Конструктор с обязательным именем
    public Student(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя студента не может быть пустым");
        }
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Метод для добавления оценки
    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {  // предположим, что оценки от 2 до 5
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
        }
        grades.add(grade);
    }
    // Метод для удаления оценки
    public void removeGrade(int grade) {
        throw new IllegalArgumentException("Нельзя удалить оценку");
    }


    // Метод для получения всех оценок (возвращаем копию для защиты от изменений)
    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    // Метод для расчета средней оценки
    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", average=" + String.format("%.2f", getAverageGrade()) +
                '}';
    }
}