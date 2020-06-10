class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0) {
            return 0;
        }
        if(target>nums[nums.length-1]) {
            return nums.length;
        }
        if(target<nums[0]){
            return 0;
        }
        return searchIndex(nums,0,nums.length-1,target);
    }
    
    public int searchIndex(int[] nums, int low, int high, int target) {
        if(low<high) {
            int mid = low + ((high-low)/2) ;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                return searchIndex(nums,mid+1,high,target);
            } else {
                return searchIndex(nums,low,mid,target);
            }
        }
        return low;
    }
    
}