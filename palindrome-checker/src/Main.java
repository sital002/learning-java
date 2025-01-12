//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        PalindromeChecker pl = new PalindromeChecker();

        System.out.println(pl.check("abfffffjkljkSba"));
        System.out.println(pl.check("abba"));
        System.out.println(pl.check("test"));
        System.out.println(pl.check("niin"));
        System.out.println(pl.check(5000));
        System.out.println(pl.check(55455));
    }
}