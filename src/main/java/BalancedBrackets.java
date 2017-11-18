import java.util.Stack;

public class BalancedBrackets {

    private static char charArr[][] = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    public static void main(String[] args) {
        System.out.println(isBalancedBrackets("{[]}"));
    }

    public static Boolean isBalancedBrackets(String input) {
        Stack<Character> characterStack = new Stack<>();
        char[] charInputArray = input.toCharArray();

        for (char aCharInputArray : charInputArray) {
            if (itsOpenBracket(aCharInputArray)) {
                characterStack.push(aCharInputArray);
            } else {
                if (itsClosingBracket(aCharInputArray, characterStack.peek())) {
                    characterStack.pop();
                } else {
                    return false;
                }
            }
        }


        return characterStack.isEmpty();
    }

    private static boolean itsClosingBracket(char closingBracket, char openBracket) {
        for (char[] aCharArr : charArr) {
            if (aCharArr[1] == closingBracket &&  aCharArr[0] == openBracket) {
                return true;
            }
        }
        return false;
    }

    private static boolean itsOpenBracket(char c) {
        for (char[] aCharArr : charArr) {
            if (aCharArr[0] == c) {
                return true;
            }
        }
        return false;
    }

}
