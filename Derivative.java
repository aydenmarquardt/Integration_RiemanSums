/******************************************
 * Project: Final Project
 * Author: Ayden Marquardt
 * Company: N/A
 * File: Derivative.java
 * Created: 2/30/23 
 * Purpose: This is the Derivative class
 *          This will hold methods for use
 ******************************************/

import java.util.ArrayList;
import java.io.*;

public class Derivative extends Function {
    
    public static void derativeDefGraph(int n, double a, double b){
        double lims[] = {a, b};
        double point = (lims[1] - lims[0]) / n;
        
        double valueHold = 0.0;

        
            ArrayList<Double> derPoints = new ArrayList<Double>();

            for (int i = 0; i <= n; i++){
                valueHold = ((double) funcOutput(i) - funcOutput(point)) / (i - point);
                derPoints.add((double) i);
                derPoints.add(valueHold);


            }

        try{
            FileWriter outFile = new FileWriter("output.txt", true);
            PrintWriter output = new PrintWriter(outFile);

            for (int i = 0; i < derPoints.size(); i++){
                output.println(i);
            }

            outFile.close();
            output.close();            
        

        } catch(IOException e){
            System.out.println("ERROR");
        }

    }
}
