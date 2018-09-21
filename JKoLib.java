package JamesKo;

public class JKoLib {
    public static boolean isPalindrome(String str) {
        String word = "";
        int i = str.length() - 1;
        while (i >= 0) {
            word = word + str.substring(i, i + 1);
            i--;
        }
        if (word.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static String dateStr(String date) {
        String a = date.substring(3, 5);
        String b = date.substring(0, 2);
        String c = date.substring(6, 10);
        return (a + "-" + b + "-" + c);
    }


    public static int sumUpTo (int x)
    {
        int y = (x*(x+1)/2);
        return (y);
    } 
}