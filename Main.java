import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,1,5};
        int target = 3;
        int start=0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==target){
                for(int j=start;j<((i-start+1)+start);j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
                sum=0;
                start=i+1;
            } else if(sum>target){
                start++;
                i=start-1;
                sum=0;
            }
        }
    }
}
