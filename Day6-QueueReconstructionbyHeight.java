class Solution {
    public int[][] reconstructQueue(int[][] people) {
        //sort in decresing order of height
        Arrays.sort(people, (x,y) -> {
            if(x[0]==y[0]) {
                return x[1]-y[1];
            }
            return y[0]-x[0];
        });
        
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<people.length;i++) {
            list.add(people[i][1],people[i]);
        }

        return list.toArray(people);
    }
}