class Rect {
    /*@ specification Rect {
        double a, d, S, p,f;
        a -> S {area};
        a -> p {perimeter};
        S -> a {sqrt};
        p -> a {FromP};
        d -> a {FromD};
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

    double sqrt(double a){
        double out = Math.sqrt(a);
        return roundIt(out);
    }

    double FromD(double d){
        double out = d * Math.sqrt(2);
        return roundIt(out);
    }

    double FromP(double p){
        double out = p / 4;
        return roundIt(out);
    }

    double area(double a){
        double out = a * a;
        return roundIt(out);
    }

    double perimeter(double a){
        double out = 4 * a;
        return roundIt(out);
    }
}



