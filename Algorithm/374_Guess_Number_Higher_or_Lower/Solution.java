/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int begin = 0;
        int end = n;
        while(begin < end) {
            int middle = begin + (end - begin) / 2;
            int ret = guess(middle);
            if (ret == 0) {
                return middle;
            } else if (ret < 0) {
                end = middle - 1;
            } else if (ret > 0) {
                begin = middle + 1;
            }
        }
        
        return begin;
    }
}
