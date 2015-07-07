class Rectangle {
    /*@ specification Rectangle {
    double a, b, d, S, p;
    a, b -> S{calcS};
    a, b -> p {calcP};
    a, b -> d {calcDiag};
    S, a -> b {sideFromS};
    S, b -> a {sideFromS};
    p, b -> a{sideFromP};
    p, a -> b {sideFromP};
    d, b -> a {calcSide};
    d, a -> b {calcSide};
    }@*/

    double roundIt(double x){
        double div = 1;
        while(x<1000){
            x *= 10;
            div *=10;
        }
        return Math.round(x)/div;
    }

    double calcDiag(double a, double b){
        double out = Math.hypot(a, b);
        return roundIt(out);
    }

    double sideFromS(double S, double a){
        double out = S/a;
        return roundIt(out);
    }

    double sideFromP(double p, double a){
        double out = p / 2 - a;
        return roundIt(out);
    }

    double calcSide(double d, double a){
        double out = Math.sqrt(d * d - a * a);
        return roundIt(out);
    }

    double calcP(double a, double b){
        double out = 2 * a + 2 * b;
        return roundIt(out);
    }

    double calcS(double a, double b){
        return roundIt(out);
    }
}
