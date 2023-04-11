public class Practice {
    public static void main(String[] args) {

        int arr[]= new  int[5];
        int counter=0;
        while(true) {
        if(counter!=arr.length){
            arr[counter]=counter+1;
            counter++;
        }
        else {
            System.out.println("Array is full");
            int tempArray[]= new int[arr.length];
            tempArray=arr;
            arr= new int[arr.length*2];

            for(int i=0; i<tempArray.length;i++) {


                arr[i] = tempArray[i];
            }
            arr[counter]= counter+1;
            counter++;

            for(int i=0; i<tempArray.length;i++){
                System.out.println(arr[i]);
            }
        }

        if(counter==100){
            break;
        }
        }

    }
}
