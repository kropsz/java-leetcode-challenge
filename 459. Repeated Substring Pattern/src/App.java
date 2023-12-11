class Solution {
    public static boolean repeatedSubstringPattern(String s) {

        String concat = s + s;
        String res = concat.substring(1, concat.length() -1);
        return res.contains(s);
        
    }



    public static void main(String[] args) {
        var s = "abab";
        boolean a = repeatedSubstringPattern(s);
        System.out.println(a);
    }
    }

