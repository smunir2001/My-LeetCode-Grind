public class Main {
    public static void main(String[] args) {
        System.out.println("20. Valid Parentheses(solution1)");
        Solution1 slt1 = new Solution1();
        String s1 = "()";
        System.out.println("s1 = " + s1);
        System.out.println("isValid(): " + slt1.isValid(s1));

        Solution1 slt2 = new Solution1();
        String s2 = "([)]";
        System.out.println("\ns2 = " + s2);
        System.out.println("isValid(): " + slt2.isValid(s2));

        Solution1 slt3 = new Solution1();
        String s3 = "]";
        System.out.println("\ns3 = " + s3);
        System.out.println("isValid(): " + slt3.isValid(s3));

        Solution1 slt4 = new Solution1();
        String s4 = "{[]}";
        System.out.println("\ns4 = " + s4);
        System.out.println("isValid(): " + slt4.isValid(s4));

        Solution1 slt5 = new Solution1();
        String s5 = "){";
        System.out.println("\ns5 = " + s5);
        System.out.println("isValid(): " + slt5.isValid(s5));

        Solution1 slt6 = new Solution1();
        String s6 = "([}}])";
        System.out.println("\ns6 = " + s6);
        System.out.println("isValid(): " + slt6.isValid(s6));

    }
}
