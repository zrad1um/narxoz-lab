public class FirstExercise {
    public static void main(String[] args) {
        int a = 15; int b = 7;
        int narxozik = a + b; int goyda = a - b; int goyev = a * b;
        System.out.println(narxozik);
        System.out.println(goyda);
        System.out.println(goyev);

        matan(args);
    }

    static void matan(String[] args) {
        int freeze = 25; int cold = 15; int result = freeze + cold;
        System.out.println(result);
        int c = 100; int d = 35; int e = c - d;
        System.out.println(e);
        int f = 12; int g = 8; int h = f * g;
        System.out.println(h);

        english(args);
    }

    static void english(String[] args) {
        int quantity = 4; int price = 5000; int cost = price * quantity;
        System.out.println(cost);
    }
}
