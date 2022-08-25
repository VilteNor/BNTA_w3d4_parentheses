public class ParenthesesChecker {
    public static boolean checkParentheses(String myString) {
        if (myString.isEmpty()) {
            return true;
        }
// count the number of open brackets and check if it has the same no of closing
//         find ( and count the number of them
//         then find ) and count
//         compare number of ( to no of )
        String[] splitString = myString.split("");
        String target1 = "(";
        String target2 = ")";
        int countTarget1 = 0;
        int countTarget2 = 0;

//        check if there are any brackets at all
        for (String chr : splitString) {
            if (chr.equals(target1)) {
                countTarget1 = countTarget1 + 1;
            }
            if (chr.equals(target2)) {
                countTarget2 = countTarget2 + 1;
            }
        } // loop ends
        return countTarget1 == countTarget2;
    }
}
