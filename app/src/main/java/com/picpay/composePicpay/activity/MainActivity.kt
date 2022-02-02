package com.picpay.composePicpay.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.picpay.composePicpay.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainActivityContent(activity = this)
        }
    }
}

@Composable
fun MainActivityContent(activity: MainActivity) {

    Column(modifier = Modifier.fillMaxSize()) {

        MainActivityButton(mainActivity = activity,
            activity = LayoutActivity(),
            text = "LayoutActivity")

        MainActivityButton(mainActivity = activity,
            activity = CounterActivity(),
            text = "CounterActivity")

        MainActivityButton(mainActivity = activity,
            activity = VisibilityActivity(),
            text = "VisibilityActivity")

        MainActivityButton(mainActivity = activity,
            activity = ComponentExampleActivity(),
            text = "ComponentExampleActivity")

    }

}

@Composable
fun MainActivityButton(mainActivity: MainActivity,
    activity: ComponentActivity,
    text: String){

    Button(modifier = Modifier
        .height(80.dp)
        .fillMaxWidth()
        .padding(top = 30.dp, start = 30.dp, end = 30.dp)
        .clip(RoundedCornerShape(20.dp)),
        onClick = {
        mainActivity.startActivity(Intent(mainActivity, activity::class.java))
        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colorResource(id = R.color.teal_700),
            contentColor = colorResource(id = R.color.white))) {
        Text(text = text)
    }

}