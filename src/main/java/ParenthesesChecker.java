import java.util.Stack;

public class ParenthesesChecker {
    public static boolean checkParentheses(String myString) {
        if (myString.isEmpty()) {
            return true;
        }
// split myString into substrings of 1 character
        String[] splitString = myString.split("");
//        brackets ()
        String bracket1 = "(";
        String bracket2 = ")";
//        braces {}
        String brace1 = "{";
        String brace2 = "}";
//        box []
        String box1 = "[";
        String box2 = "]";
//        angle <>
        String angle1 = "<";
        String angle2 = ">";
        Stack<String> parenStack = new Stack<String>();

// count the number of open brackets and check if it has the same number of closing brackets

        for (String chr : splitString) {
            if (chr.equals(bracket1)) {
                parenStack.add(chr);
            }
            else if (chr.equals(bracket2)) {
                if(parenStack.isEmpty()|| !parenStack.peek().equals(bracket1)){
                    return false;}
                else{
                    parenStack.pop();
                }}
//            braces
            else if (chr.equals(brace1)) {
                parenStack.add(chr);
            }
            else if (chr.equals(brace2)) {
                if(parenStack.isEmpty()|| !parenStack.peek().equals(brace1)){
                    return false;}
                else{
                    parenStack.pop();
                }}
//            box
            else if (chr.equals(box1)) {
                parenStack.add(chr);
            }
            else if (chr.equals(box2)) {
                    if(parenStack.isEmpty()|| !parenStack.peek().equals(box1)){
                        return false;}
                    else{
                        parenStack.pop();
                    }}
//            angle
            else if (chr.equals(angle1)) {
                parenStack.add(chr);
            }
            else if (chr.equals(angle2)) {
                        if(parenStack.isEmpty()|| !parenStack.peek().equals(angle1)){
                            return false;}
                        else{
                            parenStack.pop();
                        }}
        } // loop ends
        return parenStack.isEmpty();
    }
}
