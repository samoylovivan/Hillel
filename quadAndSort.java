package ivan.samoylov;

public class Main {

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        quadAndSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void quadAndSort(int [] array){
        for(int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
        // Реализация метода "Гномьей сортировки"
        int i = 1;
        while(i < array.length) {
            if(i == 0 || array[i - 1] <= array[i])
                i++;
            else {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }
        }
    }
}
