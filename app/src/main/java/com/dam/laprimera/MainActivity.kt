package com.dam.laprimera

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dam.laprimera.ui.theme.LaPrimeraTheme

class MainActivity : ComponentActivity() {

    val TAG : String = "estado"
    var name : String = "Android"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaPrimeraTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting(name)
                }
            }
        }
        Log.d(TAG,"estoy en onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"He llegado al OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"He llegado al OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"He llegado al OnPause")
    }


    override fun onStop() {
        super.onStop()
        Log.d(TAG,"He llegado al OnStop")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"He llegado al OnDestroy")
    }

    /*fun cambioString(){

    }*/
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var miColor = Color.Magenta

    Row {//para ponerlo en distintas filas
        Text(
            text = "Hello $name!",
            fontSize = 40.sp,
            color = Color.Green,
            modifier = modifier
        )

        Text(
            text = "Hello $name!",
            fontSize = 25.sp,
            color = miColor,
            modifier = modifier
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LaPrimeraTheme {
        Greeting("Android")
    }
}