package codingExercise2;

public class T2 {
    public static void main(String[] args) {
        String str="I love Java";
        String reverse="";
        char ch;
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println(reverse);
    }
}
