public class Exercice1 {
    public double Puissance(double x, int n) {
        if(n == 0){
            return 1;
        }
        else {
            return x * Puissance(x, n-1);
        }
    }

    public double Puissance2(double x, double n){
        if(n == 0){
            return 1;
        }
        else if(n%2 == 0){
            return Puissance2(x, n/2) * Puissance2(x, n/2);
        }
        else {
            return x * Puissance2(x, (n-1)/2) * Puissance2(x, (n-1)/2);
        }
    }
}