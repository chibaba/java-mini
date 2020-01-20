public class BubbleSort {
    public static void main(String[] args) {
        int [] intArray = {12, 1, 87, 98, 9, 89, 34};

        for (int lastUnsortedIndex =intArray.length -1; lastUnsortedIndex > 0;
              lastUnsortedIndex--) {
            for (int i =0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i +1);
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }

    }
    public static void swap(int [] array, int i, int j) {
        if ( i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
