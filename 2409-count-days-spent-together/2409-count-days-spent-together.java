class Solution{
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob){
        int []days={31,28,31,30,31,30,31,31,30,31,30,31};
        int m1 = Integer.parseInt(arriveAlice.split("-")[0]);
        int d1 = Integer.parseInt(arriveAlice.split("-")[1]);
        int m2 = Integer.parseInt(leaveAlice.split("-")[0]);
        int d2 = Integer.parseInt(leaveAlice.split("-")[1]);
        int m3 = Integer.parseInt(arriveBob.split("-")[0]);
        int d3 = Integer.parseInt(arriveBob.split("-")[1]);
        int m4 = Integer.parseInt(leaveBob.split("-")[0]);
        int d4 = Integer.parseInt(leaveBob.split("-")[1]);
        int i1=0;
        for(int x=0;x<m1-1;x++){
            i1+=days[x];
        }
        i1+=d1;
        int i2=0;
        for(int x=0;x<m2-1;x++){
            i2+=days[x];
        }
        i2+=d2;
        int i3=0;
        for(int x=0;x<m3-1;x++){
            i3+=days[x];
        }
        i3+=d3;
        int i4=0;
        for(int x=0;x<m4-1;x++){
            i4+=days[x];
        }
        i4+=d4;
        int start=Math.max(i1,i3);
        int end=Math.min(i2,i4);
        return Math.max(0,end-start+1);
    }
}