package HW.HW4.task3;

public class task3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 2, 3, 6, 1};
        selectionSort(arr);
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Character[] arr1 = {'b', 'a', 'f', 'd', 'c', 'a'};
        selectionSort(arr1);
        for(int i = 0; i < arr1.length; ++i) {
            System.out.print(arr1[i] + " ");
        }
    }   
    
    public static <E extends Comparable<E>> void selectionSort(E[] list) {
        for (int i = 0; i < list.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < list.length; j++){  
                if (list[j].compareTo(list[index]) < 1){  
                    index = j;
                }  
            }  
            E smallerNumber = list[index];   
            list[index] = list[i];  
            list[i] = smallerNumber;  
        }  
    }
}
