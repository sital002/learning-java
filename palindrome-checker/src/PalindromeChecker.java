public class PalindromeChecker {
    public boolean check(String str) {
        for(int i = 0;i<str.length() / 2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public  boolean check(int number){
        int reverse = 0;
        int temp = number;
        while(number!=0){
        int remainder = number % 10;
        reverse = reverse * 10 + remainder;
        number = number / 10;
        }
        return reverse == temp;
    }
}
