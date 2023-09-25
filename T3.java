package codingExercise2;

public class T3 {
    public static void main(String[] args) {
        /*
        Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
         */
        String str="madam";
        String reverse="";
        for(int i=str.length()-1;i>=0;--i){
            reverse=reverse+str.charAt(i);
        }
            if (str.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println(str+ " is a palindrome");
        }else {
            System.out.println(str+" is not a palindrome");
        }
    }
}
