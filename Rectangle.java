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
    
    double calcDiag(double a, double b){
        double out = Math.hypot(a, b);
        return Math.round(out * 1000) / (double)1000;
    }

    double sideFromS(double S, double a){
        double out = S/a;
        return Math.round(out * 1000) / (double)1000;
    }

    double sideFromP(double p, double a){
        double out = p / 2 - a;
        return Math.round(out * 1000) / (double)1000;
    }

    double calcSide(double d, double a){
        double out = Math.sqrt(d * d - a * a);
        return Math.round(out * 1000) / (double)1000;
    }

    double calcP(double a, double b){
        double out = 2 * a + 2 * b;
        return Math.round(out * 1000) / (double)1000;
    }

    double calcS(double a, double b){
        return Math.round(a * b * 1000) / (double)1000;
    }
}
