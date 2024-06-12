package readFile;

import java.io.BufferedReader;
import java.io.FileReader;

public class Read1 {
    public static void main(String[] args) {
        String file  = "src/testData/csvfile.csv";
        BufferedReader reader = null;
        String line = "";

        try{
            reader= new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");

                for(String index : row){
                    System.out.printf("%-10s",index);
                }
                System.out.println();
            }

        }
        catch (Exception e){

        }

    }
}
