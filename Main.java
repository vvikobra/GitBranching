class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        System.out.println(addition(1, 2));
        System.out.println(subtract(1, 2));
        System.out.println(multiply(1, 2));
        System.out.println(divide(2, 1));

    }

    public static int addition(int first, int second) {
        return first + second;
    }

    public static int subtract(int first, int second) {
        return first - second;
    }

    public static int multiply(int first, int second) {
        return first * second;
    }

    public static int divide(int first, int second) {
        return first / second;
    }
}