package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        //Task2
        //Фильтрация по возрасту больше чем 20, сортировка
        // по последней букве имени, увеличение возраста каждого на 3,
        // вычисление среднего возраста всех элементов

        System.out.println("Number of humans: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("age:");
            int age = scanner.nextInt();
            System.out.println("first name:");
            String firstName = scanner.next();
            System.out.println("last name:");
            String lastName = scanner.next();
            System.out.println("birth date:");
            String birthDate = scanner.next();
            LocalDate date = LocalDate.parse(birthDate);
            //2007-12-03
            System.out.println("weight:");
            int weight = scanner.nextInt();
            humans.add(new Human(age, firstName, lastName, date, weight));

        }
        System.out.println("Humans:");
        for (Human human : humans) {
            human.print();
        }
        Stream<Human> humanStream = humans.stream();


        System.out.println("Humans with age > 20:");
        humanStream.filter(human -> human.getAge() > 20).forEach(Human::print);


        System.out.println("Humans with age > 20 and age increased by 3:");
        humanStream = humans.stream();
        humanStream.filter(human -> human.getAge() > 20).forEach(human -> { human.setAge(human.getAge() + 3);
            human.print();});

        System.out.println("Average age origin list:");
        humanStream = humans.stream();
        double averageAge = humanStream.mapToInt(Human::getAge).average().getAsDouble();
        System.out.println(averageAge);


    }
}
