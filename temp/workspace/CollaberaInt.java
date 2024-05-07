package workspace;

import java.util.Arrays;

public class CollaberaInt {

    public static void main(String[] args) {
//        Input array: 1,0,3,0,5,0,2,0
//        Expected OP: 1,3,5,2,0,0,0,0  i.e put all 0 at the end

        int[] arr ={ 0,1,3,0,5,0,2,0};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if(arr[i]==0){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }

            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
