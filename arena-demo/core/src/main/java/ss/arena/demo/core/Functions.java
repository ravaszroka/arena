package ss.arena.demo.core;

public final class Functions {
    public static double linear(double x, double a, double b) {
        return a*x + b;
    }
    
    public static double parabola(double x, double a, double b, double c) {
        return a*x*x + b*x +c;
    }
    
    public static double sqr(double x) {
        return parabola(x, 1, 0 ,0);
    }
}
