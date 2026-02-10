// Leetcode 53
// Kadanes Algorithms

public class MaxSubarray{
    public static int Subarray(int[] arr){
        int maxSoFar = arr[0];
        int currentSum = arr[0];

        for(int i=1; i<arr.length; i++){
            if(currentSum < 0){
                currentSum = 0;
            }

            currentSum = currentSum + arr[i];

            if(currentSum > maxSoFar){
                maxSoFar = currentSum;
            }
        }

        return maxSoFar;
    }
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Subarray(arr));
    }
}