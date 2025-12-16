class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        for(int i = 0; i < n; i++) {
            int ans = -1;
            
            for(int j = 1; j < n; j++) {
                int index = (i + j)%n;
                if(nums[index] > nums[i]) {
                    ans = nums[index];
                    break;
                }

            } res[i] = ans;
        } return res;

        
    }
}