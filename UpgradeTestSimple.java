// Complete generic code: Not for production, O(1)

package Upgrader;

public class UpgradeTestSimple {
    
    /** Get upgrade result
     @param odds, success rate %
     @return true:pass or false:fail 
    */
    public boolean UpgradeTestSimple(int odds) {
        int qualifier = (int)Math.round(Math.random() * 99 + 1);
        if(qualifier <= odds) {
            return true;
        }
        return false;
    }   
}
