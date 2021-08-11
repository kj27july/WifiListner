package com.example.wifiwithbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.WifiManager
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class WifiDetails: EventBasedFeature() {

    companion object {
        lateinit var wifiManager: WifiManager
        lateinit var wifiStateReceiver: BroadcastReceiver
        fun sendContext(context: Context) {
            wifiManager =
                context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

             wifiStateReceiver = object : BroadcastReceiver() {
                override fun onReceive(context: Context, intent: Intent) {
                    val wifiStateExtra = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE,
                        WifiManager.WIFI_STATE_UNKNOWN)
                    when (wifiStateExtra) {
                        WifiManager.WIFI_STATE_ENABLED -> {
                            Log.d("akshay", "Wifi is on: ")
                        }
                        WifiManager.WIFI_STATE_DISABLED -> {
                            Log.d("akshay", "Wifi is 0ff: ")
                        }
                    }
                }
            }

            val intentFilter = IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION)
            context.getApplicationContext().registerReceiver(wifiStateReceiver, intentFilter)
//            context.getApplicationContext().unregisterReceiver(wifiStateReceiver)
        }

    }

    override fun start() {

//        val intentFilter = IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION)
//        context.getApplicationContext().registerReceiver(wifiStateReceiver, intentFilter)
    }

    override fun stop() {
//        unregisterReceiver(wifiStateReceiver)
    }
}