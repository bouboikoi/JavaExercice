import java.util.Arrays;
import java.util.Collections;

class dico {
  public static void main(final String[] args) {

    // Déclaration
    String[] words = {"Football", "Rugby", "Tennis", "Football", "Baseball"};
    String[] newList = new String[words.length];

    // Inverser l'odre du tableau
    Arrays.sort(words, Collections.reverseOrder());

    // Main code
    for (int i = 0; i < words.length; i++) {
        int indexAtWord = -1;
        String word = words[i];

        for (int j = 0; j < newList.length; j++) {
            if (newList[j] == null || newList[j].equals(word)) {
                indexAtWord = j;
            }
        }

        if (indexAtWord >= 0) {
            newList[indexAtWord] = word;
        }
    }

    // Final Code
    System.out.println(Arrays.toString(newList));
  }
}