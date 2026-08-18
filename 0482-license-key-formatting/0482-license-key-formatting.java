class Solution {
    public String licenseKeyFormatting(String str, int k) {
        String temp="",ans="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch!='-')
                temp=temp+Character.toUpperCase(ch);
        }
        int c=k;
        for(int i=0;i<temp.length();i++){
            char ch=temp.charAt(i);
            if(c==0){
                c=k;
                ans='-'+ans;
            }
            ans=ch+ans;
            c--;
        }
        return ans;
    }
}