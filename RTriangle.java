class RTriangle {
    /*@ specification RTriangle {
    double a, b, c, h, S, p, alpha, beta, gamma;
    const double gamma = Math.PI/2;
    a, b -> c {calcC};
    a, alpha, gamma -> c {sinCalcSide};
    a, beta -> c {cosCalcHyp};
    b, alpha -> c {cosCalcHyp};
    c, alpha -> a {cosCalcSide};
    c, beta -> b {cosCalcSide};
    b, beta, gamma -> c{sinCalcSide};
    c, gamma, alpha -> a{sinCalcSide};
    c, gamma, beta -> b{sinCalcSide};
    a, c -> alpha {calcAngle};
    b, c -> alpha {calcaCos};
    a, c -> beta {calcaCos};
    b, c -> beta {calcAngle};
    c, b -> a {calcSide};
    c, a -> b {calcSide};
    a, b -> S {area};
    a, b, c -> p {perimeter};
  
    }@*/
    double area(double a, double b){
        double out = a * b / 2;
        return Math.round(out * 1000) / (double)1000;
    }

    double perimeter(double a, double b, double c){
        double out = a + b + c;
        return Math.round(out * 1000) / (double)1000;
    }

    double calcAngle(double a, double c){
        double out = Math.asin(a/c);
        return Math.round(out*100000) / (double)100000;
    }

    double calcaCos(double a, double c){
        double out = Math.acos(a/c);
        return Math.round(out*100000) / (double)100000;
    }

    double calcC(double a, double b){
        double out = Math.hypot(a, b);
        return Math.round(out*1000) / (double)1000;
    }

    double calcSide(double a, double b){
        double out = Math.sqrt(a*a - b*b);
        return Math.round(out*1000) / (double)1000;
    }

    double sinCalcSide(double a, double alpha, double beta)
    {
        double out = a/Math.sin(alpha)*Math.sin(beta);
        return Math.round(out*1000) / (double)1000;
    }

    double cosCalcHyp(double a, double alpha)
    {
        double out = a/Math.cos(alpha);
        return Math.round(out*1000) / (double)1000;
    }

    double cosCalcSide(double a, double alpha)
    {
        double out = a * Math.cos(alpha);
        return Math.round(out*1000) / (double)1000;
    }
}
