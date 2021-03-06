package com.example.bluetoothchatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private BluetoothAdapter bluetoothAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
    }
  private void initBluetooth(){
        bluetoothAdapter =BluetoothAdapter.getDefaultAdapter();
        if(bluetoothAdapter == null){
            Toast.makeText(context,"No Bluetooth found",Toast.LENGTH_SHORT).show();
        }
  }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_search_devices:
                Toast.makeText(context,"Clicked search devices",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_enable_bluetooth:
                enableBluetooth();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void enableBluetooth(){
        if(bluetoothAdapter.isEnabled()){
            bluetoothAdapter.disable();
        }
        else{
            bluetoothAdapter.enable();
        }
    }
}