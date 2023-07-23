package com.java4rohit.LeetCode.EasyLevel;

public class NumberStringPair {


    public static int maximumNumberOfStringPairs(String[] words) {
           int count = 0;
        for (int i = 0; i < words.length; i++) {
            String wrd = words[i];
            for (int j = i+1; j < words.length; j++) {
                String str = words[j];
                StringBuffer sbfr = new StringBuffer(str);
                sbfr.reverse();
                System.out.println(sbfr);
                if(wrd.equalsIgnoreCase(sbfr.toString())){
                    count++;
                }
            }
        }

        return count;
    }

        public static void main(String[] args) {

        String words[] = {"ab","ba","cc"};
        int count = maximumNumberOfStringPairs(words);
        System.out.println("Number of String Pair Is :"+count);

    }
}
