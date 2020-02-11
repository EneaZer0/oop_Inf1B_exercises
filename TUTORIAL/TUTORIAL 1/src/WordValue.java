public class WordValue {
    public static void main(String[] args) {
        int[] values = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        String word = args[0];
        char[] letters = word.toCharArray();
        int valueOfWord = 0;
        for (char letter: letters) {
            valueOfWord += values[letter - 97];
        }
        System.out.println(valueOfWord);
    }
}
