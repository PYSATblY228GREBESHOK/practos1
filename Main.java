package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Создание объекта Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Используем блок try-with-resources для автоматического закрытия FileWriter
        try(FileWriter writer = new FileWriter("Student.txt"))
        {
            // Ввод количества студентов
            System.out.println("Введите количество студентов: ");
            int numOfStudents = scanner.nextInt();
            scanner.nextLine(); // Переход на новую строку для считывания следующей строки

            // Цикл для ввода данных о каждом студенте
            for (int n = 0; n < numOfStudents; n++){
                System.out.print("Имя студента: ");
                String name = scanner.nextLine();

                System.out.print("Возраст студента: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Переход на новую строку для считывания следующей строки

                System.out.print("Средний балл: ");
                double avg = scanner.nextDouble();
                scanner.nextLine(); // Переход на новую строку для считывания следующей строки

                // Запись данных о студенте в файл
                writer.write("Имя: " + name + "\n"+ "Возраст: " + age + "\n" + "Средний балл: " + avg + "\n" + "--------------------------------------"+ "\n");
            }

            // Вывод сообщения об успешной записи данных в файл
            System.out.println("Данные о студентах записаны в файл <Student.txt>");
            System.out.println("<<-------------------------------------------->>");

        } catch (IOException e)
        {
            // Обработка исключения в случае ошибки при работе с файлом
            System.out.println("Ошибка");
            System.out.println("<<----------------->>");
        }
    }
}
