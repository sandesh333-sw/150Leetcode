public class MaxCon {
    public static int maxCount(int[] nums){
        int count = 0;
        int ans = 0;

        for(int i=0; i<nums.length; i++){
            if (nums[i] == 0){
                count = 0;
            } else{
                count++;
            }

            if (count > ans){
                ans = count;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1};
        System.out.println(maxCount(arr));
    }
}
