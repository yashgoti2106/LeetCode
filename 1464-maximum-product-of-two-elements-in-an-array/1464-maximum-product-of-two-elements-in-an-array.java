class Solution {
    public int maxProduct(int[] nums) {
        int n  =  nums.length;
        int a = 0;
        int b = 0;
        for(int i = 0; i< n; i++) {
            if(nums[i] >a ){
                b = a;
                a = nums[i];
            } else if (nums[i] > b){
                b = nums[i];

            }
        } return (a-1) * (b-1);
        
    }
}