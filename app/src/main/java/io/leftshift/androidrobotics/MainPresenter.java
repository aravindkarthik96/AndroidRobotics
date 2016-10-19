package io.leftshift.androidrobotics;

public class MainPresenter {
    MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void init() {
        mainView.checkForBluetooth();
    }
}
