import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BackspacesInString {
    public String cleanString(String s) {
        // your code here
        Stack<String> output = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            if(character == '#'){
                if(output.size() >= 1){
                    output.pop();
                }
            }else {
                output.push(String.valueOf(character));
            }
        }
        String a = String.join("", output);

        return a;
    }
}