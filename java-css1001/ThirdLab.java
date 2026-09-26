import java.util.Scanner;

public class ThirdLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println();
        }

        int buy = scanner.nextInt();
        if (buy >= 50000) {
            System.out.println("Скидка предоставлена");
        } else {
            System.out.println("Скидки нет");
        }

        secondex(args);
    }

    public static void secondex(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }

        int a = scanner.nextInt(); int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Большее число: " + a);
        } else if (b == a) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Большее число: " + b);
        }

        thirdex(args);
    }

    public static void thirdex(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("Отлично");
        } else if (score >= 75) {
            System.out.println("Хорошо");
        } else if (score >= 50) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }

        int temperature = scanner.nextInt();
        if (temperature > 25) {
            System.out.println("Жарко");
        } else if (temperature > 15) {
            System.out.println("Тепло");
        } else {
            System.out.println("Прохладно");
        }

        fourthex(args);
    }

    public static void fourthex(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean student = scanner.nextBoolean();
        if (age >= 18 && student == true) {
            System.out.println("Скидка предоставлена");
        } else {
            System.out.println("Скидки нет");
        }

        boolean admin = scanner.nextBoolean();
        boolean teacher = scanner.nextBoolean();
        if (admin == true || teacher == true) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        fifthex(args);
    }

    public static void fifthex(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean hasTicket = scanner.nextBoolean();
        if (age >= 18) {
            if (hasTicket) {
                System.out.println("Вход разрешен");
            } else {
                System.out.println("Нет билета");
            }
        } else {
            System.out.println("Возраст не подходит");
        }

        int score1 = scanner.nextInt(); int score2 = scanner.nextInt();
        if (score1 > score2) {
            System.out.println(score1);
            if (score1 >= 90) {
                System.out.println("Высокий балл");
            }
        } else if (score1 == score2) {
            System.out.println("Одинаковый результат");
        } else if (score2 > score1) {
            System.out.println(score2);
            if (score2 >= 90) {
                System.out.println("Высокий балл");
            }
        }
    }
}
