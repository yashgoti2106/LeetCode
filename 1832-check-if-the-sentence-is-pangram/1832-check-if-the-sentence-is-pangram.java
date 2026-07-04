class Solution {
    public boolean checkIfPangram(String sentence) {
        // for(int i = 0; i <sentence.length(); i++ ) {
        //     for(int j = 'a' )
        // }
        for(char c = 'a'; c <= 'z' ;c++) {
            if(sentence.indexOf(c) < 0) {
                return false;
            }
        } return true;
    }
}