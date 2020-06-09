class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen == 0) {
            return true;
        }
        if(tLen ==0) {
            return false;
        }
        
        Map<Integer,Character> map = new HashMap<>();
        int count=1;
        for(int i=0;i<sLen;i++) {
            map.put(count,s.charAt(i));
            count++;
        }
        int x=1;
        for(int i=0;i<tLen;i++) {
            Character ch = map.get(x);
            if(ch != null && t.charAt(i) == ch) {
                x++;
            }
        }
        x--;
        if(x == map.size()) {
            return true;
        }
        return false;
        
    }
}