//imports to generate random numbers and vectors
import java.io.*;
import java.util.Random;
import java.util.Vector;

public class Motif {
     
    //atributes of the motif
    private double[] weights; 
    private Vector<String> dataset;
    private int dataset_size;
    private int min_lenght;
    private int max_lenght;

    //constructor who inicialize the atributes
public Motif (int dataset_size, int min_lenght, int max_lenght,
                double weight_a, double weight_c, double weight_g,double weight_t ){
    
    this.min_lenght = min_lenght;
    this.max_lenght = max_lenght;
    this.dataset_size = dataset_size;
    this.weights = new double[4];
    this.weights[0] = weight_a;
    this.weights[1] = weight_c;
    this.weights[2] = weight_g;
    this.weights[3] = weight_t;
    
}

//generates each sequence based in the weghts
public String generate_sequence(int size){
    Random r = new Random();
    double value = r.nextDouble();
    String sequence = "";
    
    if(value < weights [0]){
        sequence += "A";
    }
    else if(value < weights [1]){
        sequence += "C";
    }
    else if(value < weights [2]){
        sequence += "G";
    }
    else if(value < weights [3]){
        sequence += "T";
    }
    return sequence;
}

//generate database with the parameters and saving in a file
public void generateDatabase(int n, int m, double weight_a, double weight_c, double weight_g, double weight_t) throws IOException {
    Random r = new Random();
    FileWriter writer = new FileWriter("database.txt");

    for (int i = 0; i < n; i++) {
        String sequence = "";
        for (int j = 0; j < m; j++) {
            double value = r.nextDouble();
            if (value < weight_a) {
                sequence += "A";
            } else if (value < weight_a + weight_c) {
                sequence += "C";
            } else if (value < weight_a + weight_c + weight_g) {
                sequence += "G";
            } else {
                sequence += "T";
            }
        }
        writer.write(sequence + "\n");
    }
    writer.close();
}
}