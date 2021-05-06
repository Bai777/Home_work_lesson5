public class Persons {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Ivanov Ivan Ivanovich", "Team lead", "ivanov@mail.ru", "89345678121", 250000.0, 45);

        persArray[1] = new Employee("Petrov Fedor Semenovich", "QA Engeener", "petrov@mail.ru", "89150356789", 150000.0, 25);

        persArray[2] = new Employee("Grigoriev Alexandr Vasilievich", "Developer", "grigorie@geekbrains.ru", "89025558890", 150000.0, 31);

        persArray[3] = new Employee("Sledopitova Irina Alexsandrovna", "HR Manager", "sledopitova@yandex.ru", "89148877999", 100000.0, 30);

        persArray[4] = new Employee("Sirius Dmitriy Ivanovich", "Developer", "sirius@gmail.com", "89245678900", 150000.0, 47);


        for (Employee value : persArray) {
            if (value.getAge() > 40)
                System.out.println(value);
        }
    }
}
