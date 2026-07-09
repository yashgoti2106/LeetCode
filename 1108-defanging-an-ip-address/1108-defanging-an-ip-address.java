class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < address.length(); i++) {
            char current = address.charAt(i);
            if (current == '.') {
                sb.append("[.]");
            } else {
                sb.append(current);
            }
        }
        
        return sb.toString();
    }
}