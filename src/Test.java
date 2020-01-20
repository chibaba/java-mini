public class Test {

    public static void main(String[] args) {
        int [] intArray = new int[7];

        intArray[0] = 39;
        intArray[1] = -12;
        intArray[2] = 3;
        intArray[3]  = 34;
        intArray[4] = -34;
        intArray[5] = 24;
        intArray[6] = 53;
//         for (int i = 0; i < intArray.length; i++) {
//             System.out.println(intArray[i]);
//         }
         // assuming the previous dosent exist we want to get the no 7 from the array
           int index = -1;
        for ( int i = 0; i  < intArray.length; i++) {
            if (intArray[i] == 24)  {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);

    }
}
