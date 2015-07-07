class Circle {
    /*@ specification Circle {
    double r, d, S, p;
    const double pi = Math.PI;
    r = d / 2;
    S -> r {rFromArea};
    p -> r {rFromPerimeter};
    r -> p {pFromr};
    r -> S {SFromr};
    }
    @*/
    double roundIt(double x){
        double div = 1;
        while(x<1000){
            x *= 10;
            div *=10;
        }
        return Math.round(x)/div;
    }

    double rFromArea(double area){
        double out =  Math.sqrt(area/Math.PI);
        return roundIt(out);
    }

    double rFromPerimeter(double p){
        double out = p / 2 / Math.PI;
        return roundIt(out);
    }

    double pFromr(double r){
        double out = Math.PI * 2 * r;
        return roundIt(out);
    }

    double SFromr(double r){
        double out = Math.PI * r * r;
        return roundIt(out);
    }
}
