public class Exercice2 {
    Exercice1 exo1 = new Exercice1();
    public float calcuPolynome(int[] a, float x){
        float resultat = 0;
        for(int i = 0; i < a.length; i++){
            resultat += a[i] * exo1.Puissance2(x, i);
        }
        return resultat;
    }
    
    public float rechercheZero(int[] a, float x0, float x1){
        float part1 = calcuPolynome(a, x0);
        float part2 = calcuPolynome(a, x1);
        float mid = (x0+x1)/2;
        if(Math.abs(x0-x1) < 0.0001){
            return mid;
        }

        else if(Math.abs(part1)<Math.abs(part2)){
            return rechercheZero(a, x0, mid);
        }
        else if(Math.abs(part1)>Math.abs(part2)){
            return rechercheZero(a, mid, x1);
        }
        return mid;
    }
}