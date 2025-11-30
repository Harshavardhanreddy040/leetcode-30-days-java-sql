class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int lastDigit = 0;
        while(x>0){
            int rem = x%10;
            lastDigit = (lastDigit*10)+rem;
            x = x/10;
        }
        if(lastDigit == temp){
            return true;
        }else{
            return false;
        }
    }
}
