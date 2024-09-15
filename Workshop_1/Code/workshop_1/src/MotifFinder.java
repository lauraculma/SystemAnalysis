
//I import HashMap and map to create the data structures
import java.util.HashMap;
import java.util.Map;

//found the motif
public class MotifFinder {
    //static method who recieves an array of DNA squences and an int for the size of the motif
    public static String findMotif(String[] sequences, int s) {
        // inicialize  the map for put inside the motifs and the occurrence
        Map<String, Integer> motifCounts = new HashMap<>();
        //loop for each sequence
        for (String sequence : sequences) {
            for (int i = 0; i <= sequence.length() - s; i++) {
              //extract all de "subsequences" the size s using substring
                String motif = sequence.substring(i, i + s);
                //each motif is added  to the map with a count of 1
                motifCounts.put(motif, motifCounts.getOrDefault(motif, 0) + 1);
            }
        }

        //two variables to de occurence motif and the times
        String maxMotif = null;
        int maxCount = 0;
        //loking for the occurence motif and if found other,  update the maxMotif and maxCount

        for (Map.Entry<String, Integer> entry : motifCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxMotif = entry.getKey();
            }
        }
        System.out.println("The occurrences of the motif is:  "+ maxCount);
        return maxMotif;
    }
}