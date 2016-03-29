// Complete generic test: 0% complex, not production, O(1)

package Upgrader;

public class UpgradeTestSimple {
    /** Perform the upgrade test
     * @param: odds, the successful upgrade %.
     * @param: unique, the successful unique %.
     * @return 0:fail, 1:pass 2:unique 
     */
    public int UpgradeTestSimple(int odds, int unique) {
        if(getUpgradeResult(odds)) {
            if(unique > 0 && getUpgradeResult(unique)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }
    
    /** Get the upgrade result
     @param odds, the successful upgrade %. 
     @return true:pass or false:fail.
     */
    private boolean getUpgradeResult(int odds) {
        int qualifier = (int)Math.round(Math.random() * 99 + 1);
        if(qualifier <= odds) {
            return true;
        }
        return false;
    }
}
