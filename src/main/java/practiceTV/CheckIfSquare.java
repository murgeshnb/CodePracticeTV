package practiceTV;

public class CheckIfSquare {
    public static void main(String[] args) {
        int[] x= {20, 10, 20, 10};
        int[] y= {10, 20, 20, 10};
        double AB=0;
        double BC=0;
        double CD=0;
        double DA=0;

        for (int i=0; i<x.length-1; i++){
            double a = (x[i+1] - x[i])*(x[i+1] - x[i]);
            double b = (y[i+1] - y[i])*(y[i+1] - y[i]);
            double temp = distanceCalculate(a,b);
            if(AB ==0){
                AB=temp;
            } else if (BC ==0) {
                BC=temp;
            } else if (CD ==0) {
                BC=temp;
            } else {
                DA=temp;
            }
        }
        System.out.println(AB+" "+ BC+" "+CD+" "+DA);

        if(AB == BC && BC == CD && CD == DA){
            System.out.println("it is square");
        }
    }

    private static double distanceCalculate(double a, double b) {
        double sqrt = Math.sqrt(a)+Math.sqrt(b);
        return sqrt;
    }
}
