package Exercise;

public class Interview01 {

    public static void secondlargest(){
        //find second largest

        int [] arr={100,14,46,47,94,94,100,52,86,36,94,89};
        int largest=0;
        int largest2=0;
        //Arrays.stream()

        for(int i=0; i<arr.length;i++){
            int num=arr[i];
            if(num>largest){
                largest2=largest;
                largest=num;
            }
            else if(num>largest2 && num!=largest){
                largest2=num;
            }

        }

        System.out.println("largest second "+largest2);

    }

    public static void main(String[] args) {
        secondlargest();
    }



}
