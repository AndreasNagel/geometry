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
    double sqrt(double a){
        double out = Math.sqrt(a);
        return Math.round(out*1000) / (double)1000;
    }

    double FromD(double d){
        double out = d * Math.sqrt(2);
        return Math.round(out*1000) / (double)1000;
    }

    double FromP(double p){
        double out = p / 4;
        return Math.round(out * 1000) / (double)1000;
    }

    double area(double a){
        double out = a * a;
        return Math.round(out * 1000) / (double)1000;
    }

    double perimeter(double a){
        double out = 4 * a;
        return Math.round(out * 1000) / (double)1000;
    }
}



