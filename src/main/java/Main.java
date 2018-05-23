public class Main {

    public static void main(String[] args) {
        Main application = new Main();
        System.out.println(application.factorial(5));
        System.out.println(application.fibonacci(8));
        System.out.println(application.count8(8818));
    }


    private int factorial(int n) {
        if (n < 0)
            return -1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private int fibonacci(int n) {
        if (n < 0)
            return -1;
        else if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private int bunnyEars2(int bunnies) {
        if (bunnies <= 0)
            return 0;
        if (bunnies == 1)
            return 2;
        if (bunnies % 2 == 0)
            return bunnyEars2(bunnies - 1) + 3;
        else
            return bunnyEars2(bunnies - 1) + 2;
    }

    private int triangle(int rows) {
        if (rows <= 0)
            return 0;
        else
            return triangle(rows - 1) + rows;
    }

    private int sumDigits(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            return (n % 10) + sumDigits(n / 10);
        }
    }

    private int count7(int n) {
        if (n == 0)
            return 0;
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies <= 0)
            return 0;
        if (bunnies == 1)
            return 2;
        else
            return bunnyEars2(bunnies - 1) + 2;
    }

    private int count8(int n) {
        if (n == 0)
            return 0;
        if (n % 10 == 8 && ((n / 10) % 10) == 8) {
            return 2 + count8(n / 10);
        }
        if (n % 10 == 8) {
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    private int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        }
        return base * powerN(base, n - 1);
    }

    private int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.substring(str.length() - 1).equals("x")) {
            return 1 + countX(str.substring(0, str.length() - 1));
        }
        return countX(str.substring(0, str.length() - 1));
    }

    public int countHi(String str) {
        if (str.length() >= 2) {
            if (str.substring(str.length() - 1, str.length()).equals("i")
                    &&
                    str.substring(str.length() - 2, str.length()).equals("h")) {
                return 1 + countHi(str.substring(0, str.length() - 2));
            }
            return countHi(str.substring(0, str.length() - 2));
        }
        return countHi(str.substring(0,));
    }

}
