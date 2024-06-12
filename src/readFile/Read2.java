package readFile;

import netscape.javascript.JSObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Read2 {
    public static void main(String[] args) {
        String path = "src/testData/csvfile2.csv";
        String line = "";

        try {
            BufferedReader buff = new BufferedReader(new FileReader(path));


            while ((line = buff.readLine()) != null){
                String[] values = line.split(",");

                //System.out.println("Name : " + values[0] + ", Surname : " + values[1] + ", age : " + values[2]);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
