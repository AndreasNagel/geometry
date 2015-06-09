class Trapezoid {
    /*@ specification Trapezoid {
    double a, b, c, h, S, p, alpha, beta, d, x, y;
    const double rightAngle = Math.PI/2;

    p = a + b + c + d;
    b, a, y -> x {calcAXY};
    b, a, x -> y {calcAXY};
    b, x, y -> a {calcAXY};
    a, x, y -> b {bFromA};
    a, b, c, d -> h{calcHeightbySides};
    c, x -> h {calcHeight};
    c, h -> x {calcHeight};
    d, h -> y {calcHeight};
    d, y -> h {calcHeight};
    x, h -> c {calcSide};
    y, h -> d {calcSide};
    c, h -> alpha{calcAngle};
    c, x -> alpha{calcCosAngle};
    d, h -> beta {calcAngle};
    d, x -> beta{calcCosAngle};

    a, b, c, d -> p {perimeter};
    a, b, h -> S {calcArea};
    }@*/

    double bFromA(double a, double x, double y){
        double out = a + x + y;
        return Math.round(out * 1000) / (double)1000;
    }

    double calcAXY(double a, double b, double c){
        double out = a - b - x;
        return Math.round(out * 1000) / (double)1000;
    }

    double calcHeightbySides(double a, double b, double c, double d){
        double helper = (a - b + c - d) * (a - b - c + d) * (a - b + c + d) * (b - a + c + d);
        helper = Math.sqrt(helper);
        double out = helper / (2 * (b - a));
        return Math.round(out * 1000) / (double)1000;
    }

    double calcCosAngle(double c, double b){
        double out = Math.acos(b/c);
        return Math.round(out * 100000) / (double)100000;
    }

    double calcAngle(double c, double a){
        double out = Math.asin(a/c);
        return Math.round(out * 1000) / (double)1000;
    }

    double calcArea(double a, double b, double h){
        double out = (a + b) / 2 * h;
        return Math.round(out * 1000) / (double)1000;
    }
    double calcHeight(double c, double b){
        double out = Math.sqrt(c*c - b*b);
        return Math.round(out * 1000) / (double)1000;
    }

    double calcSide(double a, double b){
        double out = Math.hypot(a, b);
        return Math.round(out * 1000) / (double)1000;
    }

    double perimeter(double a, double b, double c, double d){
        double out = a + b + c + d;
        return Math.round(out * 1000) / (double)1000;
    }
}
