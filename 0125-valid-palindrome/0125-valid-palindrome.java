class Solution {
    public boolean isPalindrome(String s) {
       s = s.toLowerCase();
        StringBuilder result = new StringBuilder();
      //  boolean alphabet = false;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                result.append(ch);
               
            }
        } 
        int l = 0;
        int r = result.length() - 1;

        while(l < r) {
            if(result.charAt(l) != result.charAt(r)) {
                return false;
            }
            l++;
            r--;
        } return true;
    }
}