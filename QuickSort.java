public class QuickSort {
    public static void main(String[] args) {
        int vetor[] = {5,4,3,2,1};
        quickSort(vetor, 0, vetor.length-1);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+", ");
        }
    }
    public static void quickSort(int a [], int init, int end){
        int i = partition(a, init, end);
        if (init < i-1) {
            quickSort(a, init, i-1);
        }
        if (i<end){ 
            quickSort(a, i, end);
        }
    }
    public static int partition(int a[], int init,  int end){
        int i = init;
        int j = end;
        
        int pivot = a [(init+end)/2];//MEIO
        while(i<=j){
            while (a[i] < pivot){
                i++;
            }
            while(a[j] < pivot){
                j--;
            }
            if (i<=j) {
                int aux = a[i];
                a[i++] = a[j];
                a[j--] = aux;
            }
        }
        return i;   
    }
    
}// fim classe
