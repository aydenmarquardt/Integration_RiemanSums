/******************************************
 * Project: Final Project
 * Author: Ayden Marquardt
 * Company: N/A
 * File: Integeral.java
 * Created: 2/30/23 
 * Purpose: This is the Integeral class
 *          This will hold methods for use
 ******************************************/

import java.lang.Math;

/* 
 * This will return the output from a single input like a mathmatical funcation
 * Will be used for many of the other Math funcatiots that will be included 
 * Has the role of the super class for any funcation based math. 
 */
public class Function {
    public static double funcOutput(double input){
        double output = 0.0;

        output = Math.pow(input, 3.0);

        return output;
    }
}
