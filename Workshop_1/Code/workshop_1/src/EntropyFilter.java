import java.util.ArrayList;
import java.util.List;

public class EntropyFilter {
    public static double calculateEntropy(String sequence) {
        int[] counts = new int[4]; // counts for A, C, G, T
        for (char c : sequence.toCharArray()) {
            switch (c) {
                case 'A':
                    counts[0]++;
                    break;
                case 'C':
                    counts[1]++;
                    break;
                case 'G':
                    counts[2]++;
                    break;
                case 'T':
                    counts[3]++;
                    break;
            }
        }

        double entropy = 0;
        for (int count : counts) {
            double p = (double) count / sequence.length();
            entropy -= p * Math.log(p) / Math.log(2);
        }

        return entropy;
    }

    public static String[] filterSequences(String[] sequences, double minEntropy) {
        List<String> filteredSequences = new ArrayList<>();
        for (String sequence : sequences) {
            if (calculateEntropy(sequence) >= minEntropy) {
                filteredSequences.add(sequence);
            }
        }
        return filteredSequences.toArray(new String[0]);
    }
}