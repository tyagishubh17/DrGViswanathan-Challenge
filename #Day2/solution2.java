class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        String clean = s.replaceAll("[[^a-zA-Z0-9]]","").toLowerCase();
        int len = clean.length();
        for(int i = len-1;i>=0;i--){
            str.append(clean.charAt(i));
        }
        return clean.equals(str.toString());
    }
}