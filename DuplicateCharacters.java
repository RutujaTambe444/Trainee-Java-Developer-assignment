import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello, My name is Rutuja";

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { 
                c = Character.toLowerCase(c); 
                if (charCountMap.containsKey(c)) {    
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {    
                    charCountMap.put(c, 1);
                }
            }
        }
        System.out.println("Duplicate characters in the string:");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c + ": " + charCountMap.get(c) + " times");
            }
        }
    }
}
