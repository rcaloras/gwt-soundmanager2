/*
 * Firstly, define SM2_DEFER and set it to true *before* we load soundmanager2.js.
 * This prevents the SoundManager() constructor from being called immediately.
 * SM2_DEFER should be assigned within the global scope.
*/

window.SM2_DEFER = true;