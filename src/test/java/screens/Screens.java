package screens;

import screens.androidScreen.ApiDemosScreen;
import screens.androidScreen.MainScreen;
import screens.androidScreen.PreferenceDependenciesScreen;
import screens.androidScreen.PreferenceScreen;

public class Screens {
    public Screens() {
    }
    private ApiDemosScreen apiDemosScreen;
    private MainScreen mainScreen;
    private PreferenceScreen preferenceScreen;
    private PreferenceDependenciesScreen preferenceDependenciesScreen;

    public ApiDemosScreen apiDemosScreen() {
        if (apiDemosScreen == null) {
            apiDemosScreen = new ApiDemosScreen();
        }
        return apiDemosScreen;
    }

    public MainScreen mainScreen(){
        if (mainScreen == null) {
            mainScreen= new MainScreen();
        }
        return mainScreen;
    }

    public PreferenceScreen preferenceScreen(){
        if (preferenceScreen == null) {
            preferenceScreen =  new PreferenceScreen();
        }
        return preferenceScreen;
    }

    public PreferenceDependenciesScreen preferenceDependenciesScreen() {
        if (preferenceDependenciesScreen == null){
            preferenceDependenciesScreen = new PreferenceDependenciesScreen();
        }
        return preferenceDependenciesScreen;
    }

}
