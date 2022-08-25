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
        int countBracket1 = 0;
        int countBracket2 = 0;
//        braces {}
        String brace1 = "{";
        String brace2 = "}";
        int countBrace1 = 0;
        int countBrace2 = 0;

//        box []
        String box1 = "[";
        String box2 = "]";
        int countBox1 = 0;
        int countBox2 = 0;
//        angle <>
        String angle1 = "<";
        String angle2 = ">";
        int countAngle1 = 0;
        int countAngle2 = 0;

// count the number of open brackets and check if it has the same number of closing brackets

        for (String chr : splitString) {
            if (chr.equals(bracket1)) {
                countBracket1 = countBracket1 + 1;
            }
            else if (chr.equals(bracket2)) {
                countBracket2 = countBracket2 + 1;
            }
//            braces
            else if (chr.equals(brace1)) {
                countBrace1 = countBrace1 + 1;
            }
            else if (chr.equals(brace2)) {
                countBrace2 = countBrace2 + 1;
            }
//            box
            else if (chr.equals(box1)) {
                countBox1 = countBox1 + 1;
            }
            else if (chr.equals(box2)) {
                countBox2 = countBox2 + 1;
            }
//            angle
            else if (chr.equals(angle1)) {
                countAngle1 = countAngle1 + 1;
            }
            else if (chr.equals(angle2)) {
                countAngle2 = countAngle2 + 1;
            }

        } // loop ends

        return countBracket1 == countBracket2 && countBrace1==countBrace2
        && countBox1==countBox2 && countAngle1==countAngle2;

    }
}
