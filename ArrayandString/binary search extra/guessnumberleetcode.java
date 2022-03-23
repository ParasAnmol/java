public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int st = 1;
        int end = n;
        while (st <= end){
            int mid = st +(end-st)/2;
            int ans = guess(mid);
            if(ans == 1){
                st = mid + 1;
            }
            else if(ans == -1){
                end = mid - 1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
}