import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            FileReader i = new FileReader("input.txt");
            FileWriter o = new FileWriter("output.txt");

            BufferedReader reader= new BufferedReader(i);
            BufferedWriter writer = new BufferedWriter(o);

            int n = Integer.parseInt(reader.readLine());

            String[] scrittura= reader.readLine().split(" ");
            int somma = 0;

            for (int j=0;j< scrittura.length;j++){
                somma = somma + Integer.parseInt(scrittura[j]);
            }

            float media=0;
            media= (float)somma/n;
            writer.write(somma + " " + media);
            writer.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}

