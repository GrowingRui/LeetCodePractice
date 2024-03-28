public class Palindrome_Number {
    // When you read by left side or right side of a number,
    // they have to be same. 121
    public static boolean isPalindromeNumber(int x){
        boolean resul = false;
        String y = Integer.toString(x);
        for (int i = 0; i < y.length()/2; i++){
            if (y.charAt(i) == y.charAt(y.length()-1-i)){
                resul = true;
            }else {
                resul = false;
            }
        }
        return resul;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome_Number.isPalindromeNumber(101011));
    }
}
