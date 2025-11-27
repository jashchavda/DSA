
public class nonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "ppooiiuuyyyyajonjk";

        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;

            // Check current char against all others
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = true; // found a duplicate
                    break;       // no need to check further
                }
            }

            // if flag is still false → first non-repeating character
            if (!flag) {
                System.out.println("First non-repeating char: " + str.charAt(i));
                break; // stop after finding the first one
            }
        }
    }
}
