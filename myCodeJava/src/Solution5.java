class Question5{
    public String replaceSpace(StringBuffer str) {
        /*
        StringBuffer newstr = new StringBuffer("");
        int len = str.length();
        for(int i=0; i<len; i++) {
            if(str.charAt(i) == ' ')
                newstr.append("%20");
            else
                newstr.append(str.charAt(i));
        }
        return newstr.toString();
        */

        // 直接替换法
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                str.replace(i, i+1, "%20");
            }
        }
        return str.toString();
    }
}

public class Solution5 {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("mouweng ok fine");
        Question5 q5 = new Question5();
        String str = q5.replaceSpace(strBuffer);
        System.out.println(str);
    }
}
