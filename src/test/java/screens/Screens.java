package screens;

import screens.androidScreen.*;
import screens.iosScreen.AlertViewScreen;
import screens.iosScreen.PickerViewScreen;
import screens.iosScreen.SwitchesiOSScreen;

public class Screens {
    public Screens() {
    }
    private ApiDemosScreen apiDemosScreen;
    private MainScreen mainScreen;
    private PreferenceScreen preferenceScreen;
    private PreferenceDependenciesScreen preferenceDependenciesScreen;
    private SwitchScreen switchScreen;
    private ViewsScreen viewsScreen;
    private DragAndDropScreen dragAndDropScreen;
    private DateWidgetsScreen dateWidgetsScreen;
    private PopupMenuScreen popupMenuScreen;
    private AlertViewScreen alertViewScreen;
    private PickerViewScreen pickerViewScreen;
    private SwitchesiOSScreen switchesiOSScreen;

    public SwitchesiOSScreen switchesiOSScreen() {
        if (switchesiOSScreen == null) {
            switchesiOSScreen = new SwitchesiOSScreen();
        }
        return switchesiOSScreen;
    }

    public PickerViewScreen pickerViewScreen() {
        if (pickerViewScreen == null) {
            pickerViewScreen = new PickerViewScreen();
        }
        return pickerViewScreen;
    }

    public AlertViewScreen alertViewScreen() {
        if (alertViewScreen == null){
            alertViewScreen = new AlertViewScreen();
        }
        return alertViewScreen;
    }

    public PopupMenuScreen popupMenuScreen() {
        if (popupMenuScreen == null) {
            popupMenuScreen = new PopupMenuScreen();
        }
        return popupMenuScreen;
    }

    public DateWidgetsScreen dateWidgetsScreen(){
        if (dateWidgetsScreen == null){
            dateWidgetsScreen = new DateWidgetsScreen();
        }
        return dateWidgetsScreen;
    }

    public DragAndDropScreen dragAndDropScreen(){
        if (dragAndDropScreen == null){
            dragAndDropScreen = new DragAndDropScreen();
        }
        return dragAndDropScreen;
    }

    public ViewsScreen viewsScreen(){
        if (viewsScreen == null) {
            viewsScreen = new ViewsScreen();
        }
        return viewsScreen;
    }

    public SwitchScreen switchScreen(){
        if (switchScreen == null){
            switchScreen = new SwitchScreen();
        }
        return switchScreen;
    }


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
