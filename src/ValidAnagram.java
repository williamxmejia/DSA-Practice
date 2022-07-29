public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            int [] arr= new  int[26];

            for(int i = 0; i < s.length(); i++){
                arr[s.charAt(i) - 'a'] ++;
                arr[t.charAt(i) - 'a'] --;
            }

            for(int i :  arr){
                if(i != 0)
                    return false;
            }
//            System.out.println(arr);
            return true;
        }

        return false;
    }
}
