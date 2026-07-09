class Solution{
    public void fill(int[][] image, int sr, int sc,int originalcolor,int color){
        if(image[sr][sc]==color) return;
        int m=image.length;
        int n=image[0].length;
        image[sr][sc]=color;
        if(sr-1>=0 && sc<n && originalcolor==image[sr-1][sc]){
            fill(image,sr-1,sc,originalcolor,color);
        }
        if(sr+1<m && sc<n && originalcolor==image[sr+1][sc]){
            fill(image,sr+1,sc,originalcolor,color);
        }
        if(sr<m && sc-1>=0 && originalcolor==image[sr][sc-1]){
            fill(image,sr,sc-1,originalcolor,color);
        }
        if(sr<m && sc+1<n && originalcolor==image[sr][sc+1]){
            fill(image,sr,sc+1,originalcolor,color);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        int originalcolor=image[sr][sc];
        if(originalcolor==color) return image;
        fill(image,sr,sc,originalcolor,color);
        return image;
    }
}