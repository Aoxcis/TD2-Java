public class App {
    public static void main(String[] args) throws Exception {
        Exercice1 ex1 = new Exercice1();
        Exercice2 ex2 = new Exercice2();
        Exercice3 ex3 = new Exercice3();
        System.out.println("Hello, World!");
        System.out.println(ex1.Puissance(2, 4));
        System.out.println(ex1.Puissance2(3, 5));
        System.out.println(ex2.calcuPolynome(new int[]{1, 2, 3}, 2));
        System.out.println(ex2.rechercheZero(new int[]{1, 7, 3}, -100, 100));
        int[] T = new int[]{1, 5, 19, 18, 56, 24, 75, 1, 12};
        ex3.sort(T);
        System.out.println(java.util.Arrays.toString(T));
    }
}
