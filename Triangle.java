class Triangle {
    /*@ specification Triangle {
    double a, b, c, h, S, p, alpha, beta, gamma, delta;
    double icr, ocr;
    a, b, gamma -> S {calcAreaSin};
    b, c, alpha -> S {calcAreaSin};
    a, c, beta -> S {calcAreaSin};
    a, b, c -> S {heron};
    a, b, gamma -> c {calcSide};
    a, c, beta -> b {calcSide};
    b, c, alpha -> a {calcSide};
    S, a -> h {calcHeightS};
    b, gamma -> h {calcHeight};
    c, beta -> h {calcHeight};
    b, h -> gamma {calcAngle};
    c, h -> beta {calcAngle};
    a, b, alpha -> beta {calcAngleSin};
    a, c, alpha -> gamma {calcAngleSin};
    b, c, beta -> gamma {calcAngleSin};
    b, a, beta -> alpha {calcAngleSin};
    c, a, gamma -> alpha{calcAngleSin};
    c, b, gamma -> beta {calcAngleSin};
    a, alpha, beta -> b{sinCalcSide};
    a, alpha, gamma -> c{sinCalcSide};
    b, beta, gamma -> c{sinCalcSide};
    b, beta, alpha -> a{sinCalcSide};
    c, gamma, alpha -> a{sinCalcSide};
    c, gamma, beta -> b{sinCalcSide};
    alpha, beta -> gamma {calcLastAngle};
    alpha, gamma -> beta {calcLastAngle};
    beta, gamma -> alpha {calcLastAngle};
    S, a, b, c -> ocr {calcOcr};
    S, p -> icr {calcIcr};
    a, b, c -> p {perimeter};
    }@*/

    double perimeter(double a, double b, double c){
        double out = a + b + c;
        return Math.round(out * 1000) / (double)1000;
    }

    double calcIcr(double S, double p){
        double out = S / (p / 2);
        return Math.round(out * 1000) / (double)1000;
    }

    double calcHeightS(double S, double a){
        double out = 2*S/a;
        return Math.round(out * 1000) / (double)1000;
    }

    double calcHeight(double b, double gamma){
        double out = b*Math.cos(gamma);
        return Math.round(out * 1000) / (double)1000;
    }

    double calcAngle(double a, double h){
        double out = Math.asin(h / b);
        return Math.round(out * 100000) / (double)100000;
    }
    double calcAngleSin(double a, double b, double alpha){
        double out = Math.asin(Math.sin(alpha) * b/ a);
        return Math.round(out * 100000) / (double)100000;
    }

    double calcAreaSin(double a, double b, double gamma){
        double out = a * b * Math.sin(gamma) / 2;
        return Math.round(out * 1000) / (double)1000;
    }

    double heron(double a, double b, double c){
        double p = (a + b + c)/2;
        double out = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return Math.round(out * 1000) / (double)1000;
    }

    double calcOcr(double S, double a, double b, double c){
        double out = a * b * c / (4 * S);
        return Math.round(out * 1000) / (double)1000;
    }

    double calcSide(double a, double b, double gamma){
        double out = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(gamma));
        return Math.round(out * 1000) / (double)1000;
    }

    double sinCalcSide(double a, double alpha, double beta){
        double out = a/Math.sin(alpha)*Math.sin(beta);
        return Math.round(out * 1000) / (double)1000;
    }

    double calcLastAngle(double alpha, double beta){
        double out = Math.PI - alpha - beta;
        return Math.round(out * 100000) / (double)100000;
}
}
