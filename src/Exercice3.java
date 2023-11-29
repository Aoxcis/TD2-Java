public class Exercice3{
    public void sort(int[] T){
        if(T.length < 2) {
            return;
        }
        int mid = T.length/2;
        int[] left = new int[mid];
        int[] right = new int[T.length-mid];

        for(int i = 0; i < mid; i++){
            left[i] = T[i];
        }

        for(int i = mid; i < T.length; i++){
            right[i-mid] = T[i];
        }

        sort(left);
        sort(right);

        merge(left, right, T);
    }
    public int[] merge(int[] left, int[] right, int[] T){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                T[k] = left[i];
                i++;
            }
            else{
                T[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            T[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            T[k] = right[j];
            j++;
            k++;
        }
        return T;
    }
}