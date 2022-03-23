class Solution {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        int st = 2; 
        int end = x/2;
        while(st  <= end){
            int mid = st+(end-st)/2;
            long sq = (long)mid*mid;
            if(sq < x){
                st = mid + 1;
            }
            else if(sq > x){
                end  = mid - 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}