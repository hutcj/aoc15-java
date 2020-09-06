/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package advent;

public class Day01 {
    public Day01() {}
    
    public String part1(String input) {
        return String.valueOf(this.parseInstructions(input));
    }

    private int parseInstructions(String s) {
        int count = 0;
        
        if (s.length() < 1) {
            return count;
        }
        
        do {
            if (s.charAt(0) == '(') {
                count++;
            } else if (s.charAt(0) == ')') {
                count--;
            } else {
                System.err.println("Invalid character '" + s.charAt(0) + "' in input! Cannot proceed.");
                System.exit(1);
            }
            s = s.substring(1, s.length());
        } while (s.length() >= 1);
        
        return count;
    }
}
