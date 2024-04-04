import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello world, this is a test string. Hello world!";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Split the string into words using regex
        String[] words = str.split("[\\s,.!?]+");

        // Count the frequency of each word
        for (String word : words) {
            word = word.toLowerCase(); 
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Display the word count map
        System.out.println("Word count in the string:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
