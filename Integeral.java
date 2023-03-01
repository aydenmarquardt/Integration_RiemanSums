/******************************************
 * Project: Final Project
 * Author: Ayden Marquardt
 * Company: N/A
 * File: Integeral.java
 * Created: 2/30/23 
 * Purpose: This is the Integeral class
 *          This will hold methods for use
 ******************************************/

import java.io.*;
/*
 * This class extends the funcation class, to get the input and output of a base funcation easily. Makes 
 * it easier to spread the function values throlughout without having to remake.
 * 
 * This is based on the idea of Rieman Sums integeral approimation.
 * The Right Hand Sums, Left Hand Sum, and Middle Sums are all very closly related
 * Trapaziod and Middle has very close output/answers
 * Simpsons method is approximation without the drawing of boxes or traps on funcation
 * 
 * 
 * All methods for integration approximation will generate an output file with points to plot integeral points,
 * 
 * Each funcation also returns the approx answer (as n increases, the answer gets closer and closer to the true value)
 *
 * Futher info for indivual methods will be found in Docs (not written yeet)
 */

class Integeral extends Function{

    public static double riemanRHS(int n, double a, double b){
        double areaUnderGraph = 0.0;
        double lims[] = {a, b};
        double deltaX = (lims[1] - lims[0])/n;
        double xOfI = 0.0;
        double foX = 0.0;

        for (int i = 1; i < n; i++){
            xOfI = lims[0] + (i * deltaX);

            foX = funcOutput(xOfI);

            areaUnderGraph += (deltaX)*(foX);
        }

        try{
            FileWriter outFile = new FileWriter("output.txt", false);
            PrintWriter output = new PrintWriter(outFile);

            output.println(xOfI);
            output.println(foX);
            
            outFile.close();
            output.close();


        } catch(IOException e){

            System.out.println("ERROR");
        }

        return areaUnderGraph;
    }

    public static double riemanLHS(int n, double a, double b){
        double areaUnderGraph = 0.0;
        double lims[] = {a, b};
        double deltaX = (lims[1] - lims[0])/n;
        double xOfI = 0.0;
        double foX = 0.0;

        for (int i = 1; i < n; i++){
            xOfI = lims[0] + ((i - 1) * deltaX);

            foX = funcOutput(xOfI);

            areaUnderGraph += (deltaX)*(foX);
        }

        try{
            FileWriter outFile = new FileWriter("output.txt", false);
            PrintWriter output = new PrintWriter(outFile);

            output.println(xOfI);
            output.println(foX);
            
            outFile.close();
            output.close();


        } catch(IOException e){

            System.out.println("ERROR");
        }

        return areaUnderGraph;
    }

    public static double riemanMS(int n, double a, double b){
        double areaUnderGraph = 0.0;
        double lims[] = {a, b};
        double deltaX = (lims[1] - lims[0])/n;
        double xOfI = 0.0;
        double foX = 0.0;

        for (int i = 1; i < n; i++){
            xOfI = lims[0] + (0.5 * ((i - 1) + i) * deltaX);

            foX = funcOutput(xOfI);

            areaUnderGraph += (deltaX)*(foX);
        }

        try{
            FileWriter outFile = new FileWriter("output.txt", false);
            PrintWriter output = new PrintWriter(outFile);

            output.println(xOfI);
            output.println(foX);
            
            outFile.close();
            output.close();


        } catch(IOException e){

            System.out.println("ERROR");
        }

        return areaUnderGraph;
    }

    public static double riemanTS(int n, double a, double b){
        double areaUnderGraph = 0.0;
        double lims[] = {a,b};
        double deltaX = (lims[1] - lims[0])/n;
        double xOfI = 0.0;
        double foX = 0.0;
        
        for (int i = 0; i < n; i++){
            xOfI = lims[0] + (i * deltaX);

            if (i != 0 && i != n-1){
                foX = 2.0 * funcOutput(xOfI);
            }
            else{
                foX = funcOutput(xOfI);
            }

            areaUnderGraph += (0.5 * deltaX)*(foX);
        }

        try{
            FileWriter outFile = new FileWriter("output.txt", false);
            PrintWriter output = new PrintWriter(outFile);

            output.println(xOfI);
            output.println(foX);

            outFile.close();
            output.close();

        } catch(IOException e){
            System.out.println("ERROR");
        }
        
        return areaUnderGraph;
    }

public static double riemanSimpson(int n, double a, double b){
    double areaUnderGraph = 0.0;
        double lims[] = {a,b};
        double deltaX = (lims[1] - lims[0])/n;
        double xOfI = 0.0;
        double foX = 0.0;
        
        for (int i = 0; i < n; i++){
            xOfI = lims[0] + (i * deltaX);

            if (i == 0 || i == n-1){
                foX = funcOutput(xOfI);
            }
            else if (i % 2 != 0){
                foX =  4 * funcOutput(xOfI);
            }
            else{
                foX = 2 * funcOutput(xOfI);
            }

            areaUnderGraph += (((double) 1/3) * deltaX)*(foX);
        }

        try{
            FileWriter outFile = new FileWriter("output.txt", false);
            PrintWriter output = new PrintWriter(outFile);

            output.println(xOfI);
            output.println(foX);

            outFile.close();
            output.close();

        } catch(IOException e){
            System.out.println("ERROR");
        }
        
        return areaUnderGraph;
    }
}