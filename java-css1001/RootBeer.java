public class RootBeer {
    public static void main(String[] args) {
        String product = "Pivo";
        double price = 499.50;
        int quantity = 12;
        double total = price * quantity;
        System.out.println(total);

        goyda(args);
    }

    public static void goyda(String[] args) {
        String name = "";
        int age = 18;
        double price = 100000.00;
        boolean paid = true;
        int quantity = 4; double total = price * quantity;
        System.out.println(name);
        System.out.println(age);
        System.out.println(paid);
        System.out.println(total);
        quantity = 9; total = price * quantity;
        System.out.println(total);
        // проверка
        int proverka1 = 17 / 5; int proverka2 = 17 % 5;
        System.out.println("Pervoe chislo" +proverka1);
        System.out.println("Vtoroe chislo" + proverka2);
        // константа
        final int daysinweek = 7;
        System.out.println(daysinweek);
        // преобразования типов
        double myMoon = 14.88;
        int mydog = (int) myMoon;
        System.out.println(mydog);
        int a = 2147483647;
        float b = a;
        System.out.println(b);
    }
}
