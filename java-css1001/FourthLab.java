import java.util.Scanner;

public class FourthLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int dostavka = 1500;
        if (price >= 12000) {
            System.out.println("Стоимость заказа" + price);
        } else {
            int total = price + dostavka; System.out.println("Стоимость заказа: " + total);
        }

        first(args);
    }
    public static void first(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Ноль");
        } else if (number >= 1 && number % 2 == 0) {
            System.out.println("Четное число");
        } else if (number >= 1 && number % 2 != 0) {
            System.out.println("Нечетное число");
        }

        second(args);
    }

    public static void second(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        if (hours <= 0) {
            System.out.println();
        } else if (hours <= 2) {
            int cost = hours * 1000; System.out.println("Стоимость парковки: " + cost);
        } else {
            int cost = 2 * 1000 + (hours - 2) * 700; System.out.println("Стоимость парковки: " + cost);
        }

        third(args);
    }

    public static void third(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt(); int secondNumber = scanner.nextInt(); int thirdNumber = scanner.nextInt();
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            System.out.println("Минимальное число: " + firstNumber);
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            System.out.println("Минимальное число: " + secondNumber);
        } else {
            System.out.println("Минимальное число: " + thirdNumber);
        }

        fourth(args);
    }

    public static void fourth(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kwh = scanner.nextDouble();
        if (kwh < 0) {
            System.out.println("Некорректные данные");
        } else {
            double total = 0;

            if (kwh <= 100) {
                total = kwh * 20;
            } else if (kwh <= 300) {
                total = (100 * 20) + ((kwh - 100) * 27);
            } else {
                total = (100 * 20) + (200 * 27) + ((kwh - 300) * 35);
            }
            System.out.println("Оплата за" + kwh + "квт/ч:" + total + "тг");
        }
        fifth(args);
    }

    public static void fifth(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt(); int attendance = scanner.nextInt();
        if (score < 0 && attendance < 0) {
            System.out.println("Некорректные данные");
        } else {
            if (score >= 50 && attendance >= 75) {
                if (score >= 90) {
                    System.out.println("Отлично");
                } else if (score >= 75) {
                    System.out.println("Хорошо");
                } else if (score >= 50) {
                    System.out.println("Удовлетворительно");
                }
            } else {
              System.out.println("Не сдано");
            }
        }
        sixth(args);
    }

    public static void sixth(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Введите возраст: "); int age = scanner.nextInt();
       System.out.print("Введите сумму покупки: "); double amount = scanner.nextDouble();
       System.out.print("Являетесь ли вы студентом: "); boolean student = scanner.nextBoolean();
       if (amount >= 10000 && ((age >= 18 && age <= 25) || student)) {
           double discount = amount * 0.10;
           double total = amount - discount;
           System.out.println("Скидка: " + discount);
           System.out.println("К оплате: " + total);
       } else {
           System.out.println("Скидки нет. К оплате: " + amount);
       }

       seventh(args);
    }

    public static void seventh(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("PIN: ");
        int pin = sc.nextInt();
        System.out.print("Неудачных попыток: ");
        int attempts = sc.nextInt();

        if (pin == 4321 && attempts < 3) {
            System.out.println("Вход выполнен");
        } else if (pin != 4321 && attempts >= 3) {
            System.out.println("Аккаунт заблокирован");
        } else {
            System.out.println("Неверный PIN");
        }

        eighth(args);
    }

    public static void eighth(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Возраст: ");
        int age = sc.nextInt();
        System.out.print("Есть билет (true/false): ");
        boolean hasTicket = sc.nextBoolean();
        System.out.print("Есть сопровождающий (true/false): ");
        boolean hasGuardian = sc.nextBoolean();

        if (age >= 16 || (age >= 12 && age <= 15 && hasGuardian)) {
            if (hasTicket) {
                System.out.println("Вход разрешён");
            } else {
                System.out.println("Нет билета");
            }
        } else {
            System.out.println("Возраст не подходит");
        }

        nineth(args);
    }

    public static void nineth(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ежемесячный доход: ");
        double income = sc.nextDouble();
        System.out.print("Платёж по долгам: ");
        double debtPayment = sc.nextDouble();
        System.out.print("Кредитный балл: ");
        int score = sc.nextInt();
        System.out.print("Стабильная работа (true/false): ");
        boolean hasStableJob = sc.nextBoolean();

        if (income < 250000) {
            System.out.println("Доход недостаточен");
        } else if (debtPayment <= income * 0.4 && (score >= 700 || hasStableJob)) {
            System.out.println("Заявка проходит");
        } else {
            System.out.println("Требуются дополнительные условия");
        }
    }
}
