public class Main {
    public static void main(String[] args) {
        System.out.println("13. Roman to Integer (solution1)");
        Solution1 slt1 = new Solution1();
        String s = "III";
        System.out.println("s (Roman) = " + s);
        System.out.println("s (Integer) = " + slt1.romanToInt(s));
        s = "LVIII";
        System.out.println("\ns (Roman) = " + s);
        System.out.println("s (Integer) = " + slt1.romanToInt(s));
        s = "MCMXCIV";
        System.out.println("\ns (Roman) = " + s);
        System.out.println("s (Integer) = " + slt1.romanToInt(s));
    }
}
