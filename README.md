# projectZFighters
Game Development

UPGRADE

if(!object.flag max) {

// if available upgrades are in my queue || if the player level is within capable unique upgrade range
// true: call upgradeModifier(object) {	to prep the object with odds 
if(object.unique.length() > 0 || object.nextUniqueLevel <= object.level) {
// pre-condition: nextUniqueLevel is not in the unique queue. 
// Once a unique upgrade takes place, a check determines if this upgrade == nextUniqueLevel.
// If equal, a call to upgradeCheckUniqueCapable(object) is made, and the queue object.unique is populated.
// The last item will be stored as object.nextUniqueLevel
* upgradeCheckUniqueCapable(object) { // i determine all of the possible unique upgrades at the next target level

* upgradeModifier(object) {				    // i prep the object with odds, etc.
* upgrade(int, int) {							    // i perform the arithmetic and output a result
* upgradeSuccess(object) {				    // i determine the new details
* upgradeSuccessDisplay(object) {	    // i present the new details to the UI
