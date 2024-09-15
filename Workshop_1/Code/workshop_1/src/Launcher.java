import java.io.*;

public class Launcher {
    //main method
    public static void main(String[] args) throws IOException {
        //take the time to define the duration of the ejecution
        long  startTime = System.nanoTime();

        //define the values
        int n = 450000; 
        int m = 50; 
        double weight_a = 0.25;
        double weight_c = 0.25;
        double weight_g = 0.25;
        double weight_t = 0.25;
        int s = 10;

        Motif motif = new Motif(0, 0, 0, weight_a, weight_c, weight_g, weight_t);
        motif.generateDatabase(n, m, weight_a, weight_c, weight_g, weight_t) ;

        String[] sequences = FileReaderUtil.readDatabase("database.txt");
        String motifSequence = MotifFinder.findMotif(sequences, s);
        //print the motif
        System.out.println("The motif found is: " + motifSequence);
        long  endTime = System.nanoTime() - startTime;

        //print the time
        System.out.println("The time that spend to found the motif is: " + endTime);
        
    }
} 

