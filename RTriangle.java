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

    double roundIt(double x){
        double div = 1;
        while(x<1000){
            x *= 10;
            div *=10;
        }
        return Math.round(x)/div;
    }

    double area(double a, double b){
        double out = a * b / 2;
        return roundIt(out);
    }

    double perimeter(double a, double b, double c){
        double out = a + b + c;
        return roundIt(out);
    }

    double calcAngle(double a, double c){
        double out = Math.asin(a/c);
        return roundIt(out);
    }

    double calcaCos(double a, double c){
        double out = Math.acos(a/c);
        return roundIt(out);
    }

    double calcC(double a, double b){
        double out = Math.hypot(a, b);
        return roundIt(out);
    }

    double calcSide(double a, double b){
        double out = Math.sqrt(a*a - b*b);
        return roundIt(out);
    }

    double sinCalcSide(double a, double alpha, double beta)
    {
        double out = a/Math.sin(alpha)*Math.sin(beta);
        return roundIt(out);
    }

    double cosCalcHyp(double a, double alpha)
    {
        double out = a/Math.cos(alpha);
        return roundIt(out);
    }

    double cosCalcSide(double a, double alpha)
    {
        double out = a * Math.cos(alpha);
        return roundIt(out);
    }
}
