package JamesKo;

public class JKoLib {
    public static boolean isPalindrome(String str) {
        String word = "";
        int i = str.length() - 1;
        while (i >= 0) {
            word = word + str.substring(i, i + 1);
            i--;
        }
        if (word.equals(str)) { //test to see if it is the same word
            return true;
        }
            return false;
        }

    public static String dateStr(String date) {
        String x = date.substring(3, 5);
        // creates a string for the birth day
        String y = date.substring(0, 2);
        // creates a string for the birth month
        String z = date.substring(6, 10);
        // creates a string for the birth year
        return (x + "-" + y + "-" + z);
        //returns the new format with the dashes included
    }


    public static int sumUpTo(int x) {
        int b = x; //b goes up to the number that x goes up to and adds them together
        for (int a = 0; a < x; a++) {
            b = b + a; //adds the previous numbers with the sum up to
        }
        return (b);
    }

    public static String multiplicationTable(int start, int length) {
        String multiply = "";
        for (int x = 0; x <= length; x++) {
            int num = start * x;
            multiply = multiply + start + "*" + x + "=" + num + "  "; //multiples the base with the numbers up to the length
        }
        return multiply;
    }

    public static boolean isFibonacci(int number) {
        int x = 0;
        int y = 1;
        for (int z = 0; y < number; y = z) {
            z = y + x; //adds the preceding number with the current number
            x = y;
            if (z == number) //tests to see if the number belongs there
                return true;

        }
        return false;
    }
}
