/*In given large string, find the most occurring words in the string.
Hint:-
a. Create a Hashtable which will keep track of <word, frequency>
b. Iterate through the string and keep track of word frequency by inserting
into Hash-Table.
c. When we have a new word, we will insert it into the Hashtable with
frequency 1. For all repetition of the word, we will increase the
frequency.
d. We can keep track of the most occurring words whenever we are
increasing the frequency we can see if this is the most occurring word or
not */

import java.util.HashMap;

public class Q10 {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. " +
                "Sed cursus ante dapibus diam. Sed nisi. Nulla quis sem at nibh elementum imperdiet. Duis sagittis ipsum. " +
                "Praesent mauris. Fusce nec tellus sed augue semper porta. Mauris massa. Vestibulum lacinia arcu eget nulla. " +
                "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. " +
                "Curabitur sodales ligula in libero. Sed dignissim lacinia nunc. Curabitur tortor.";

        printMostOccurringWords(text);
    }

    public static void printMostOccurringWords(String text) {
        String[] words = text.split("\\s+");
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (!wordFrequency.containsKey(word)) {
                wordFrequency.put(word, 1);
            } else {
                int frequency = wordFrequency.get(word);
                wordFrequency.put(word, frequency + 1);
            }
        }

        int maxFrequency = 0;
        for (int frequency : wordFrequency.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        System.out.println("Most occurring words:");
        for (String word : wordFrequency.keySet()) {
            if (wordFrequency.get(word) == maxFrequency) {
                System.out.println(word + " - Frequency: " + maxFrequency);
            }
        }
    }
}
