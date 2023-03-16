package Homeworks_Java;

public class L7HW_FindLongestWord {
        public static void main(String[] args) {
            String sentence = "The quick brown fox jumps over the lazy dog";
            String[] words = sentence.split(" ");
            String longestWord = "";
            int maxLength = 0;

            for (String word : words) {
                int length = word.length();
                if (length > maxLength) {
                    maxLength = length;
                    longestWord = word;
                }
            }

            System.out.println("The longest word is: " + longestWord);
        }

}
