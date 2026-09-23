public class SecondLab {
    public static void main(String[] args) {
        // Переменные разных типов — простой уровень
        String name = "Ruslan"; System.out.println("Name: " + name);
        int age = 18; System.out.println("Age: " + age);
        double averageScore = 2.67; System.out.println("Average: " + averageScore);
        char Grade = 67; System.out.println("Grade: " + Grade);
        boolean passed = false; System.out.println("Passed: " + passed);
        System.out.println("   ");

        secondex(args);
    }
    public static void secondex(String[] args) {
        // простые вычисления целых чисел
        int a = 25; int b = 4;
        int summa = a + b; System.out.println("Summa: " + summa);
        int difference = a - b; System.out.println("Difference: " + difference);
        int product = a * b; System.out.println("Product: " + product);
        int division = a / b; System.out.println("Div: " + division);
        int ostatok = a % b; System.out.println("Ostatok: " + ostatok);
        System.out.println("   ");

        thirdex(args);
    }

    public static void thirdex(String[] args) {
        // магазин
        double price = 2499.90; int quantity = 3;
        double total = price * quantity; System.out.println("Total: " + total);
        quantity = 5; total = price * quantity;
        System.out.println("New total: " + total);
        System.out.println("   ");

        fourthex(args);
    }

    public static void fourthex(String[] args) {
        // целочисленное деление и остаток от деления
        int a = 17; int b = 5;
        System.out.println("A / B: " + a / b); System.out.println("A % B: " + a % b);
        double x = 17.0; System.out.println(x / b);
        System.out.println("   ");
        // Почему 3.4, а не 3? Отличие заключается в том, что 17.0 и 17 принадлежат к разным типам данных - double и int соответственно.
        // При целочисленном делении на экран выводится лишь целая часть

        fifthex(args);
    }

    public static void fifthex(String[] args) {
        // сокращённые операторы
        int score = 50; System.out.println("Начальное значение: " + score);
        score += 10; System.out.println("Второе значение: " + score);
        score *= 2; System.out.println("Третье значение: " + score);
        score -= 15; System.out.println("Четвертое значение: " + score);
        score /= 3; System.out.println("Финальное значение: " + score);
        System.out.println("   ");
        // score -> score + 10 -> score * 2 -> score - 15 -> score / 3

        sixthex(args);
    }

    public static void sixthex(String[] args) {
        // ++ и --
        int count = 10; System.out.println("First count: " + count);
        count++; System.out.println("Second count: " + count);
        count++; System.out.println("Third count: " + count);
        count--; System.out.println("Final count: " + count);
        int copies = 3; copies++; copies++; System.out.println("Copies: " + copies);
        System.out.println("     ");

        seventhex(args);
    }

    public static void seventhex(String[] args) {
        // преобразование типов данных
        int number = 25; double price = 19.99;
        double doubleNumber = number; System.out.println("Double number: " + doubleNumber);
        int MyPrice = (int) price; System.out.println("Integer price: " + MyPrice);
        double x = 7.8; int y = (int) x; System.out.println("Integer x: " + y); // была отброшена дробная часть, поэтому у равен 7
        System.out.println("     ");

        eightex(args);
    }

    public static void eightex(String[] args) {
        // комбинирование типов данных и вычислений
        String product = "Notebook"; double price = 1999.90; int quantity = 4; double discount = 500.0;
        System.out.println("Product: " + product); System.out.println("Discount: " + discount);
        double total = price * quantity; System.out.println("Total: " + total);
        double finalTotal = total - discount; System.out.println("Final total: " + finalTotal);
        double average = finalTotal / quantity; System.out.println("AVG: " + average);
        System.out.println("     ");

        nineex(args);
    }

    public static void nineex(String[] args) {
        // налоговая приехала
        final int DAYS_IN_WEEK = 7; final double TAX = 0.12; int salary = 350000;
        double tax = salary * TAX; System.out.println("Tax: " + tax);
        double zarplata = salary - tax; System.out.println("Zarplata: " + zarplata);
        double doxod = zarplata * 4; System.out.println("Doxod: " + doxod);
        System.out.println("     ");

        // DAYS_IN_WEEK = 8; TAX = 0.50; - значение постоянных переменных невозможно изменить!

        finalex(args);
    }

    public static void finalex(String[] args) {
        // финансовая грамотность студента, привет
        String name = "Ayan"; double scholarship = 150000.0; double rent = 50000.0;
        double food = 35000.0; double transport = 15000.0; double internet = 5000.0; double other = 12000.0;
        final int MONTHS = 3;

        System.out.println("--- расчет за 1 месяц ---");
        System.out.println("Студент: " + name);
        double rasxody = rent + food + transport + internet + other; System.out.println("Общие расходы: " + rasxody);
        double remaining = scholarship - rasxody; System.out.println("Остаток: " + remaining);

        System.out.println("--- расчет за 3 месяца ---");
        double doxod3 = scholarship * 3; System.out.println("Доход за три месяца: " + doxod3);
        double rasxod3 = rasxody * 3; System.out.println("Расходы за три месяца: " + rasxod3);
        double remaining3 = remaining * 3; System.out.println("Остаток за три месяца: " + remaining3);

        System.out.println("--- расчет после увеличения затрат на еду ---");
        food += 5000; rasxody = rent + food + transport + internet + other; System.out.println("Новые расходы: " + rasxody);
        remaining = scholarship - rasxody; System.out.println("Новый остаток: " + remaining);

        double shkola = scholarship % MONTHS; System.out.println("--- int и double ---");
        System.out.println("Остаток от деления стипендии на 3: " + shkola);

        int months = 3; double monthlyExpense = 45000.0;
        double calculation  = months * monthlyExpense; System.out.println("Произведение: " + calculation);
    }
}
