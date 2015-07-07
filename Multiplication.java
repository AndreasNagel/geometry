class Multiplication {
    /*@ specification Multiplication {
        double in1;
        double in2;
        double out;
        in1, in2 -> out {gOut};
    }@*/

    double roundIt(double x){
        double div = 1;
        while(x<1000){
            x *= 10;
            div *=10;
        }
        return Math.round(x)/div;
    }

double gOut(double in1, double in2){
        out = in1 * in2;
        return roundIt(out);
    }
}
