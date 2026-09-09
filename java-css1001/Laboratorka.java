public class Laboratorka {
    public static void main(String[] args) {
        System.out.println("// задание первое - зарплата");
        int salary = 300000; int bonus = 50000; int totalSalary = salary + bonus;
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total salary: " + totalSalary);

        twomain(args);
    }

    static void twomain(String[] args) {
        System.out.println("// задание второе - автомобиль");
        int distance = 300; int fuel = 25; int result = distance / fuel;
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fuel: " + fuel + " liters");
        System.out.println("Result: " + result + " km per liter");


        threemain(args);
    }

    static void threemain(String[] args) {
        System.out.println("// задание третье - интернет-магазин");
        int price1 = 5000; int quantity1 = 2; int total1 = price1 * quantity1;
        int price2 = 3000; int quantity2 = 3; int total2 = price2 * quantity2;
        int total3 = total1 + total2;
        System.out.println("PRODUCT 1");
        System.out.println("Price: " + price1);
        System.out.println("Quantity: " + quantity1);
        System.out.println("Total: " + total1);
        System.out.println("                  ");
        System.out.println("PRODUCT 2");
        System.out.println("Price: " + price2);
        System.out.println("Quantity: " + quantity2);
        System.out.println("Total: " + total2);
        System.out.println("                  ");
        System.out.println("-------------------");
        System.out.println("TOTAL: " + total3);

        fourmain(args);
    }

    static void fourmain(String[] args) {
        System.out.println("// задание четвертое - результаты студента");
        int math = 85; int programming = 95; int english = 80;
        int summa = math + programming + english;
        int average = (math + programming + english) / 3;
        System.out.println("Math: " + math);
        System.out.println("Programming: " + programming);
        System.out.println("English: " + english);
        System.out.println("------------------");
        System.out.println("Sum: " + summa);
        System.out.println("Average: " + average);

        fivemain(args);
    }

    static void fivemain(String[] args) {
        System.out.println("// задание пятое - семейный бюджет");
        int zarplata = 450000; int food = 80000; int transport = 30000; int internet = 15000; int other = 50000;
        System.out.println("SALARY: " + zarplata);
        System.out.println("                    ");
        System.out.println("EXPENSES");
        System.out.println("Food: " + food);
        System.out.println("Transport: " + transport);
        System.out.println("Internet: " + internet);
        System.out.println("Other: " + other);
        System.out.println("------------------");
        int expenses = food + transport + internet + other;
        System.out.println("Total expenses: " + expenses);
        int remaining = zarplata - expenses;
        System.out.println("Remaining: " + remaining);

        sixmain(args);
    }

    static void sixmain(String[] args) {
        System.out.println("// задание шестое - чек в магазине");
        System.out.println("========================");
        System.out.println("        RECEIPT         ");
        System.out.println("========================");
        System.out.println("                    ");
        int laptop = 350000; int notebook = 1; int laptot = laptop * notebook;
        System.out.println("Laptop");
        System.out.println("Price: " + laptop);
        System.out.println("Quantity: " + notebook);
        System.out.println("Total: " + laptot);
        System.out.println("                    ");
        int mouse = 8000; int tushkanchik = 2; int moutot = mouse * tushkanchik;
        System.out.println("Mouse");
        System.out.println("Price: " + laptop);
        System.out.println("Quantity: " + notebook);
        System.out.println("Total: " + moutot);
        System.out.println("                    ");
        int keyboard = 15000; int klaviatura = 1; int razer = keyboard * klaviatura;
        System.out.println("Keyboard");
        System.out.println("Price: " + keyboard);
        System.out.println("Quantity: " + klaviatura);
        System.out.println("Total: " + razer);
        System.out.println("                    ");
        int totalgoyda = razer + moutot + laptot;
        System.out.println("====================");
        System.out.println("TOTAL: " + totalgoyda);
        System.out.println("====================");
    }
}
