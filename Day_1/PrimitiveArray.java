package Day_1;

public class PrimitiveArray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println(arr);

//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//
//        }
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        System.out.println("Array initialized");

        System.out.println("Array elements are:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
}
