#include <iostream>
#include <cmath>
#include <fstream>

double output(double input);// get function base value for each x valu input
double riemanLHS(int n, double a, double b);

int main(){
    double lims[] = {1,3};
    double sum = 0.0;

    sum = riemanLHS(1000, lims[0], lims[1]);

    std::cout<<sum<<std::endl;

    return 0;
}

double fOfValue(double input){
    double x = input;

    double out = exp(x);

    return out;
}

double riemanLHS(int n, double a, double b){
    std::ofstream outFile;
    outFile.open("output.txt");

    double sum = 0.0;
    double lims[] = {a, b};
    double deltaX = (lims[1] - lims[0])/n;
    double xOfI = 0.0;
    double foX = 0.0;

    for (int i = 1; i < n; i++){
       xOfI = lims[0] +(i * deltaX);
        //
        foX = fOfValue(xOfI);

        sum += (deltaX)*(foX);

        outFile<<xOfI<<","<<foX<<std::endl;
    }

    outFile.close();
    return sum;
}