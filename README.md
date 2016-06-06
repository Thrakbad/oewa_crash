# Oewa Crash
Code to reproduce a crash with the Oewa Libraries versions 1.7.3 and 1.7.5.

## Reproduction ##
1. Add the Oewa Library version 1.7.5 to the libs folder.
1. Register your device to always show the Oewa Survey.
1. Open the code with Android Studio.
2. Put a breakpoint on `de.spring.mobile.qsi.QSIClientImpl` line 134.
3. Start the app. The background thread created by the Oewa library communication with it's server will soon wait at the breakpoint.
4. Exit the activity with the device back-button.
5. Resume code execution from the breakpoint.
6. App crashes.
