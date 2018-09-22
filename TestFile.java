package JamesKo;

public class TestFile {

    public static void main(String[] args) {
        // write your code here
        System.out.println("reverse of \'rip\' is "+JKoLib.isPalindrome( "rip"));
        System.out.println("reverse of \'racecar\' is "+JKoLib.isPalindrome( "racecar"));
        System.out.println(JKoLib.dateStr("01/16/2001"));
        System.out.println(JKoLib.sumUpTo(5));
        System.out.println(JKoLib.multiplicationTable(2,15));
        System.out.println(JKoLib.isFibonacci(8));

}
}
