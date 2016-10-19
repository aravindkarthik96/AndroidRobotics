package io.leftshift.androidrobotics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.akexorcist.bluetotohspp.library.BluetoothSPP;

public class MainActivity extends AppCompatActivity implements MainView {
    BluetoothSPP bt;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = new BluetoothSPP(this);
        mainPresenter = new MainPresenter(this);
        mainPresenter.init();
    }

    public void onDestroy() {
        super.onDestroy();
        bt.stopService();
    }

    @Override
    public void checkForBluetooth() {
        if (!bt.isBluetoothAvailable()) {
            //Bluetooth Not Available
            finish();
        }
    }
}
