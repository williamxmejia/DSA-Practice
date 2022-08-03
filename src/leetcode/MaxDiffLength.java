package leetcode;// 7kyu Maximum Length Difference

class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        // your code

        if(a1.length > 0 && a2.length > 0){
            int count1Min = a1[0].length();
            int count1Max = a1[0].length();
            int count2Min = a2[0].length();
            int count2Max = a2[0].length();
            for (int i = 0; i < a1.length; i++) {
                if (count1Min > a1[i].length()) {
                    count1Min = a1[i].length();
                }

                if (count1Max < a1[i].length()) {
                    count1Max = a1[i].length();
                }
            }

            for (int i = 0; i < a2.length; i++) {
                if (count2Min > a2[i].length()) {
                    count2Min = a2[i].length();
                }

                if (count2Max < a2[i].length()) {
                    count2Max = a2[i].length();
                }
            }
            int maxDiff1 = Math.abs(count1Min - count2Max);
            int maxDiff2 = Math.abs(count2Min - count1Max);

            if (maxDiff1 > maxDiff2) {
                return maxDiff1;
            }
            return maxDiff2;
        }
        return -1;
    }
}
