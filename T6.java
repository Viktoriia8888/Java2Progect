package codingExercise2;

public class T6 {
    public static void main(String[] args) {
        /*Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
*/
        String str = "abracadabra";
        for (int i = 0; i < str.length(); i++) {
            boolean character = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    character = false;
                    break;
                }
            }
            if (character) {
                System.out.println("First Non-Repeating Character in a String: " + str.charAt(i));
 break;
            }
        }

    }
}