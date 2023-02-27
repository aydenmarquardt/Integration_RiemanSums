import java.lang.Math;


public class integrate{
   
   private static double functionValue(double inputValue){
        double outputValue = Math.pow(inputValue,4);

        return outputValue;
   }
   
    private static void integration(){
        double lims[] = {0.0,3.0};
        
        double dx = 0.0;
        double sum = 0.0;

        for (int i = 0; i < 10000; i++){ // Lim n->10000: x^2*dx; = integration of 
            
            dx = ((lims[1] - lims[0])/10000);
            double ddx = (i*dx);
            double answer = functionValue(ddx);

            sum += answer * dx;

            sum = sum * dx;
            
            System.out.println(answer);
            System.out.println(i);
            System.out.println(ddx);
            System.out.println(sum);
            System.out.println("\n");

        }
   }
   
   
   
   
    public static void main(String[] args){
        integration();
    }
}