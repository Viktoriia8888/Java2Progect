package codingExercise2;

public class T4 {
    public static void main(String[] args) {
        /*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
*/
        String str="Hello. How are you?";
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        count++;
        System.out.println(count);
    }
}
