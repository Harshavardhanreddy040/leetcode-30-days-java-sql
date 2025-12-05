class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0)return false;
        while(true){
        int orgLen = s.length();
        s = s.replace("()","");
        s = s.replace("{}", "");
        s = s.replace("[]", "");
        int newLen = s.length();
        if(orgLen == newLen) break;
        }
        return s.length()==0;
    }
}
