class Division {
    /*@ specification Division {
        double in1;
        double in2;
        double out;
        in1, in2 -> out {gOut};
    }@*/

    double gOut(double in1, double in2){
        return Math.round(in1/in2*100000) / (double)100000;
    }
}
