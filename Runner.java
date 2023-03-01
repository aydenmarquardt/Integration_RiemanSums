/******************************************
 * Project: Final Project
 * Author: Ayden Marquardt
 * Company: N/A
 * File: Runner.java
 * Created: 2/30/23 
 * Purpose: This is the Runner class
 *          This will run methods for testing
 *********************************************/

public class Runner {
    public static void main(String[] args){
        double lims[] = {0.0, 5.0};
        int n = 10000;
        double sum = 0.0;



/* 
        sum = Integeral.riemanSimpson(n, lims[0], lims[1]);
        System.out.println(sum);

        sum = Integeral.riemanLHS(n, lims[0], lims[1]);
        System.out.println(sum);

        sum = Integeral.riemanRHS(n, lims[0], lims[1]);
        System.out.println(sum);

        sum = Integeral.riemanMS(n, lims[0], lims[1]);
        System.out.println(sum);

        sum = Integeral.riemanTS(n, lims[0], lims[1]);
        System.out.println(sum);
*/
        Derivative.derativeDefGraph(n, lims[0], lims[1]);

    }
}