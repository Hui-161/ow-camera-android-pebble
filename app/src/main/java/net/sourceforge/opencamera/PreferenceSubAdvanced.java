package net.sourceforge.opencamera;

import android.os.Bundle;
import android.util.Log;

// Pebble Changes Start
/** Groups the Open Camera sub-screens that don't matter for taking photos from the watch, so
 *  the main settings screen stays short. The sub-screens themselves are unchanged and open
 *  through MainActivity.onPreferenceStartFragment() like any other.
 */
public class PreferenceSubAdvanced extends PreferenceSubScreen {
    private static final String TAG = "PreferenceSubAdvanced";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        if( MyDebug.LOG )
            Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences_sub_advanced);
        if( MyDebug.LOG )
            Log.d(TAG, "onCreate done");
    }
}
// Pebble Changes End
