import java.util.Arrays;

public class ArraySelf {

    public static int[] arraySelf(int[] nums){
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        left[0] = 1;
        right[n-1] = 1;

        for(int i=1; i<n; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        for(int i=n-2; i>=0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        for(int j=0; j<n; j++){
            ans[j] = left[j] * right[j];
        }

        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arraySelf(arr)));
    }
}
