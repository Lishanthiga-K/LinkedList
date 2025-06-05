class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0,count=0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pos++] = nums[i];
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(count!=0){
                nums[i] = 0;
                count--;
            }
            else{
                break;
            }
        }
    }
}
