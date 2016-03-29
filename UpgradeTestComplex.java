// Complete code: For production, O(1), for upgrade(int, int) > i perform the arithmetic and output a result
// UpgradeTestComplex(int) pass in success rate 1 to 99%
package Upgrader;

public class UpgradeTestComplex {
    
    private char result = 0;
    
    public UpgradeTestComplex(int odds) {
        createUpgradePattern(odds);
    }

    /** Create a pattern to draw the result from
     * @param odds, the successful upgrade %.
     */
    private void createUpgradePattern(int odds) {
        String pattern = "";
        int patternLength = 0;
        int patternComplete = 100;
        
        int builder = 1;
        while(patternLength < patternComplete) {
            if(builder % odds == 0) {
                pattern += "0";
                patternLength++;
            }
            if(builder % (100 - odds) == 0) {
                pattern += "1";
                patternLength++;
            }
            builder++;
        }
        chooseUpgradeResult(pattern);
    } 
    
    /** Determine the upgrade result
     * @param pattern, the combination of pass / fail bits.
     */
    private void chooseUpgradeResult(String pattern) {
        int choice = (int)Math.round(Math.random() * 99);
        result = pattern.charAt(choice);
    }
    
    /** Get the upgrade result */
    public char getResult() {
        return result;
    }
}
