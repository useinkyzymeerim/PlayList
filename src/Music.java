import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Music {
    private static ArrayList<PopularSongs> list = new ArrayList<>();
    private static ArrayList<Integer> print = new ArrayList<>();

    public static void main(String[] args) {

        list.add(new PopularSongs("Standing next to you", "Jong kook ", "3:47"));
        list.add(new PopularSongs("Seven", "Jong kook ", "3:25"));
        list.add(new PopularSongs("3D", "Jong kook ", "3:51"));

        int num = 0;
        int choice = 0;
        while (choice != 5) {
            System.out.println("Ввберете действие:");
            System.out.println("1 - Добавить песню");
            System.out.println("2 - Ваш плейлист");
            System.out.println("3 - Удалить песню");
            System.out.println("4 - Рекамендации");
            System.out.println("5 - Выход");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Введите название песни, автора, длительность песни");
                    int nameSong = scanner.nextInt();
                    print.add(nameSong);
                    break;
                case 2:
                    if (print.isEmpty()) {
                        System.out.println("Ваш плей-лист пуст");
                    } else {
                        for (Integer i : print) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 4:
                    while (num != 2) {
                        System.out.println("Ввберите жанор песен:");
                        System.out.println("1 - Pop");
                        System.out.println("2 - Выход ");
                        Scanner s = new Scanner(System.in);
                        num = scanner.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println("Топ 10 рекамендуеших Pop - Песен");
                                for (int i = 0; i < list.size(); i++) {
                                    System.out.println((i + 1)  + " - " + list.get(i));
                                }
                                System.out.println("Ввыберети номер песни который хотите добавить");
                                int index = scanner.nextInt() - 1;
                                if (index >= 0 && index < list.size()) {

                                    System.out.println("Песня добавлина ваш плей-лист");
                                    num = 2;
                                } else {
                                    System.out.println("Ошибка: Неверный номер задачи");
                                }
                            case 2:
                                System.out.println("Вы вышли");
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Вы вышли");
                    break;
                default:
                    System.out.println("ошибка");
                    break;


            }






        }
    }
}
