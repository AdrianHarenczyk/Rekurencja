public class Main {

    public static void main(String[] args) {
        Main application = new Main();
        System.out.println(application.strDist("catcowcat", "cat"));
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

    private int countHi(String str) {
        if (str == null || str.length() < 2)
            return 0;
        if (str.substring(str.length() - 2, str.length()).equals("hi")) {
            return 1 + countHi(str.substring(0, str.length() - 2));
        }
        return countHi(str.substring(0, str.length() - 1));
    }

    private String changeXY(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        if (!str.contains("x")) {
            return str;
        }
        return changeXY(str.replaceFirst("x", "y"));
    }

    private String changePi(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        if (!str.contains("pi")) {
            return str;
        }
        return changePi(str.replaceFirst("pi", "3.14"));
    }

    private String noX(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        if (!str.contains("x")) {
            return str;
        }
        return noX(str.replaceFirst("x", ""));
    }

    private boolean array6(int[] nums, int index) {
        if (nums == null || nums.length == 0 || index >= nums.length)
            return false;
        if (nums[index] == 6)
            return true;
        return array6(nums, index + 1);
    }

    private int array11(int[] nums, int index) {
        if (nums == null || nums.length == 0)
            return 0;
        if (index == nums.length - 1 && nums[index] == 11)
            return 1;
        if (index == nums.length - 1 && nums[index] != 11)
            return 0;
        if (index < nums.length && nums[index] == 11)
            return 1 + array11(nums, index + 1);
        return array11(nums, index + 1);
    }

    private boolean array220(int[] nums, int index) {
        if (nums == null || nums.length == 0 || index + 1 >= nums.length)
            return false;
        if (nums[index] * 10 == nums[index + 1])
            return true;
        return array220(nums, index + 1);
    }

    private String allStar(String str) {
        if (str == null || str.isEmpty())
            return "";
        if (str.length() == 1)
            return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    private String pairStar(String str) {
        if (str == null || str.isEmpty())
            return "";
        if (str.length() == 1)
            return str;
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }

    private String endX(String str) {
        if (str == null || str.isEmpty())
            return "";
        if (str.length() == 1)
            return str;
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + str.charAt(0);
        }
        return str.charAt(0) + endX(str.substring(1));
    }

    private int countPairs(String str) {
        if (str == null || str.isEmpty() || str.length() < 3)
            return 0;
        if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        }
        return countPairs(str.substring(1));
    }

    private int countAbc(String str) {
        if (str == null || str.isEmpty() || str.length() < 3)
            return 0;
        if (str.substring(0, 3).equals("abc") ||
                str.substring(0, 3).equals("aba")) {
            return 1 + countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }

    private int count11(String str) {
        if (str == null || str.isEmpty() || str.length() < 2)
            return 0;
        if (str.substring(0, 2).equals("11")) {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }

    private String stringClean(String str) {
        if (str == null || str.isEmpty() || str.length() < 2)
            return str;
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }

    private int countHi2(String str) {
        if (str == null || str.length() < 2)
            return 0;
        if (str.length() >= 3) {
            if (str.substring(0, 3).equals("xhi")) {
                return countHi2(str.substring(3, str.length()));
            }
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2, str.length()));
        }
        return countHi2(str.substring(1, str.length()));
    }

    private String parenBit(String str) {
        if (str == null || str.length() < 2)
            return "";
        if (str.charAt(0) == '(' && str.contains(")")) {
            return str.charAt(0) + str.substring(1, str.lastIndexOf(')') + 1);
        }
        return parenBit(str.substring(1));
    }

    private boolean nestParen(String str) {
        if (str == null || str.isEmpty())
            return true;
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            if (str.length() == 2) {
                return true;
            }
            return nestParen(str.substring(1, str.length() - 1));
        }
        return false;
    }

    private int strCount(String str, String sub) {
        if (str == null || str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length()).contains(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }

    private boolean strCopies(String str, String sub, int n) {
        if (n == 0 || str == null || sub == null) {
            return true;
        }
        if (str.length() < sub.length()) {
            return false;
        }
        if (str.equals(sub) && n == 1) {
            return true;
        }
        if (str.substring(0, sub.length()).contains(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        }
        return strCopies(str.substring(1), sub, n);
    }

//    private int strDist(String str, String sub) {
//        if (str == null || sub == null || str.isEmpty()) {
//            return 0;
//        }
//        if (str.startsWith(sub) && !str.substring(sub.length()).contains(sub)) {
//            return sub.length();
//        }
//        if (str.length() == sub.length() && !str.equals(sub)) {
//            return 0;
//        }
//        if (str.startsWith(sub) && str.substring(sub.length()).contains(sub)) {
//            return (2 * sub.length()) + str.substring(sub.length(),str.lastIndexOf(sub)).length();
//        }
//        return strDist(str.substring(1),sub);
//    }
    private int strDist(String str, String sub) {
        if (str == null || sub == null || str.isEmpty() || !str.contains(sub)) {
            return 0;
        }
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }
        if (!str.startsWith(sub)) {
            return strDist(str.substring(str.indexOf(sub)), sub);
        }
        if (!str.endsWith(sub)) {
            return strDist(str.substring(0, str.lastIndexOf(sub) + sub.length()), sub);
        }
        return 0;
//        if (str.length() == sub.length() && !str.equals(sub)) {
//            return 0;
//        }
//        if (str.startsWith(sub) && str.endsWith(sub)) {
//            return str.length();
//        }
//        return strDist(str.substring(1,str.length()-2),sub);
    }


}
