class Solution{
    public long totalCost(int[] costs, int k, int candidates){
        PriorityQueue<Integer>pq1=new PriorityQueue<>();
        PriorityQueue<Integer>pq2=new PriorityQueue<>();
        int i=0;
        while(i<candidates){
            pq1.add(costs[i]);
            i++;
        }
        int j=costs.length-1;
        while(j>=costs.length-candidates && j>=i){
            pq2.add(costs[j]);
            j--;
        }
        long cost=0;
        for(int b=0;b<k;b++){
        int left=pq1.isEmpty()?Integer.MAX_VALUE:pq1.peek();
        int right=pq2.isEmpty()?Integer.MAX_VALUE:pq2.peek();
        if(pq2.isEmpty() || (!pq1.isEmpty() && left<=right)){
            cost+=pq1.poll();
            if(i<=j) pq1.add(costs[i++]);
        }
        else{
            cost+=pq2.poll();
            if(j>=i) pq2.add(costs[j--]);
        }
        }
        return cost;
    }
}