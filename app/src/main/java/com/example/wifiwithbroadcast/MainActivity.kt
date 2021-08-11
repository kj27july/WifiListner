package com.example.wifiwithbroadcast


import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.WifiManager
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
//    lateinit var wifiSwitch: Switch
    lateinit var wifiManager: WifiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WifiDetails.sendContext(this)

//        wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
    }

//    override fun onStart() {
//        super.onStart()
//        val intentFilter = IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION)
//        registerReceiver(wifiStateReceiver, intentFilter)
//    }
//
//    override fun onStop() {
//        super.onStop()
////        unregisterReceiver(wifiStateReceiver)
//    }

//    private val wifiStateReceiver: BroadcastReceiver = object : BroadcastReceiver() {
//        override fun onReceive(context: Context, intent: Intent) {
//            val wifiStateExtra = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE,
//                    WifiManager.WIFI_STATE_UNKNOWN)
//            when (wifiStateExtra) {
//                WifiManager.WIFI_STATE_ENABLED -> {
//                    Log.d("akshay", "Wifi is on: ")
//                }
//                WifiManager.WIFI_STATE_DISABLED -> {
//                    Log.d("akshay", "Wifi is 0ff: ")
//                }
//            }
//        }
//    }
}