package JamesKo;

public class JKoLib {
    public static boolean isPalindrome(String str) {
        String word = ""; //sets up a empty string
        int i = str.length() - 1;
        while (i >= 0) {
            word = word + str.substring(i, i + 1);
            i--;
        }
        if (word.equals(str)) { //test to see if
            return true;
        } else {
            return false;
        }
    }

    public static String dateStr(String date) {
        String x = date.substring(3, 5);
        String y = date.substring(0, 2);
        String z = date.substring(6, 10);    //removes the day, month, and year and adds them to a new string
        return (x + "-" + y + "-" + z);
    }


    public static int sumUpTo(int x) {
        int b = 0;
        for (int a = 0; a < x; a++) {
            b = b + a; //adds the previous numbers with the sum up to
        }
        return (b);
    }

    public static String multiplicationTable(int start, int length) {
        String multiply = "";
        for (int i = 0; i <= length; i++) {
            int num = start * i;
            multiply = multiply + start + "*" + i + "=" + num + "__"; //multiples the base with the numbers up to the range
        }
        return multiply;
    }

    public static boolean isFibonacci(int x) {
        int num1 = 1;
        int num2 = 0;
        for (int num3 = 0; num1 < x; num1 = num3) {
            num3 = num1 + num2;
            num2 = num1;
            if (num3 == x)
                return true;

        }
        return false;
    }
}
