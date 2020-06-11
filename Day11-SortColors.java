class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=0;
        
        while(k<=j) {
            if(nums[k] == 0) {
                swap(i,k,nums);
                i++;
                k++;
            }
            else if(nums[k]==1) {
                k++;
            }
            else if(nums[k]==2) {
                swap(j,k,nums);
                j--;
            }
        }
            
    }
    private void swap(int x, int y,int[] arr) {
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}