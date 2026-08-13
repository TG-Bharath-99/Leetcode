class Solution{
    void fill(int [][]image,int sr,int sc,int originalcolor,int color,boolean [][]visited){
        if(visited[sr][sc]) return;
        image[sr][sc]=color;
        visited[sr][sc]=true;
        int m=image.length;
        int n=image[0].length;
        if(sr-1>=0 && sc<n && image[sr-1][sc]==originalcolor){
            fill(image,sr-1,sc,originalcolor,color,visited);
        }
        if(sr+1<m && sc<n && image[sr+1][sc]==originalcolor){
            fill(image,sr+1,sc,originalcolor,color,visited);
        }
        if(sc-1>=0 && sr<m && image[sr][sc-1]==originalcolor){
            fill(image,sr,sc-1,originalcolor,color,visited);
        }
        if(sc+1<n && sr<m && image[sr][sc+1]==originalcolor){
            fill(image,sr,sc+1,originalcolor,color,visited);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        int originalcolor=image[sr][sc];
        if(image[sr][sc]==color) return image;
        boolean [][]visited=new boolean[image.length][image[0].length];
        fill(image,sr,sc,originalcolor,color,visited);
        return image;
    }
}