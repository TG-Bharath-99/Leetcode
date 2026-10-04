class Solution{
    public double angleClock(int hour, int minutes){
        double h1=(hour*30)%360;
        double m1=minutes*6;
        h1+=(double)minutes/2;
        double angle=Math.abs(h1-m1);
        if(angle<360-angle) return angle;
        return 360-angle;
    }
}