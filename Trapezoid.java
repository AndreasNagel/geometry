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

    double roundIt(double x){
        double div = 1;
        while(x<1000){
            x *= 10;
            div *=10;
        }
        return Math.round(x)/div;
    }

    double bFromA(double a, double x, double y){
        double out = a + x + y;
        return roundIt(out);
    }

    double calcAXY(double a, double b, double c){
        double out = a - b - c;
        return roundIt(out);
    }

    double calcHeightbySides(double a, double b, double c, double d){
        double helper = (a - b + c - d) * (a - b - c + d) * (a - b + c + d) * (b - a + c + d);
        helper = Math.sqrt(helper);
        double out = helper / (2 * (b - a));
        return roundIt(out);
    }

    double calcCosAngle(double c, double b){
        double out = Math.acos(b/c);
        return roundIt(out);
    }

    double calcAngle(double c, double a){
        double out = Math.asin(a/c);
        return roundIt(out);
    }

    double calcArea(double a, double b, double h){
        double out = (a + b) / 2 * h;
        return roundIt(out);
    }
    double calcHeight(double c, double b){
        double out = Math.sqrt(c*c - b*b);
        return roundIt(out);
    }

    double calcSide(double a, double b){
        double out = Math.hypot(a, b);
        return roundIt(out);
    }

    double perimeter(double a, double b, double c, double d){
        double out = a + b + c + d;
        return roundIt(out);
    }
}
