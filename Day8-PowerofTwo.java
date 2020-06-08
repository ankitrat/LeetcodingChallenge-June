class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) {
            return true;
        }
        for(int i=0;i<=Math.sqrt(n)+1;i++) {
            int x = 1<<i;
            if(x>n) {
                return false;
            }
            if (x == n) {
                return true;
            }
        }
        return false;
    }   
}