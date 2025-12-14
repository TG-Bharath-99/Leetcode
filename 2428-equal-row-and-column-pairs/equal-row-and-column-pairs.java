class Solution {
    public int equalPairs(int[][] grid) {
        int count=0,n=grid.length;
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(grid[i][j]).append(",");
            }
            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
        }
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(grid[j][i]).append(",");
            }
            count+=map.getOrDefault(sb.toString(),0);
        }
        return count;
    }
}