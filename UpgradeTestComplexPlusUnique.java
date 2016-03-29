package Upgrader;

public class UpgradeTestComplex {
    
    private int result = 0;
    
    public UpgradeTestComplex(int odds, int unique) {
        int lcm = findLCM(odds, unique);
        createUpgradePattern(lcm, odds, unique);
    }
    
    /** Find the least common multiple to be used for creating the upgrade pattern.
     * @param odds, the successful upgrade %.
     * @param unique, the successful unique upgrade %.
     * @return least common multiple
     */
    private int findLCM(int odds, int unique) {
        int lcm = 2;
        while(true) {
            if(lcm % unique == 0 && lcm % odds == 0 && lcm % (100 - odds) == 0) {
                break;
            }
            lcm++;
        }
        return lcm;
    }
    
    /** Create a pattern to draw the result from.
     * @param lcm, the least common multiple used to determine when to put the bits into the pattern.
     * @param odds, the successful upgrade %.
     * @param unique, the successful unique upgrade %.
     */
    private void createUpgradePattern(int lcm, int odds, int unique) {
        String pattern = "";
        int patternLength = 0;
        int patternComplete = 100 + unique;
        
        int pass = lcm / odds;
        int fail = lcm / (100 - odds);
        int uniq = lcm / unique;
        
        int builder = 1;
        while(patternLength < patternComplete) {
            if(builder % fail == 0) {
                pattern += "0";
                patternLength++;
            }
            if(builder % pass == 0) {
                pattern += "1";
                patternLength++;
            }
            if(builder % uniq == 0) {
                pattern += "2";
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
        int choice = (int)Math.round(Math.random() * (pattern.length() - 1));
        result = Integer.parseInt("" + pattern.charAt(choice));
    }
    
    /** Get the upgrade result */
    public int getResult() {
        return result;
    }
}