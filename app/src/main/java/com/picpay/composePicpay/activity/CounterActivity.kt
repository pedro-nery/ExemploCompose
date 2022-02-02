package com.picpay.composePicpay.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CounterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterActivityContent2(this)
        }
    }
}

/*@Composable
private fun CounterActivityContent() {
    var text : Int by remember { mutableStateOf(0) }
    var text2 : Int by remember { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxSize()) {

        Text(modifier = Modifier
            .padding(top = 120.dp)
            .align(CenterHorizontally),
            text = text.toString(),
            fontSize = 100.sp)

        Button(modifier = Modifier
            .padding(top = 30.dp)
            .align(CenterHorizontally),
            onClick = {
            text += 1
        }) {
            Text(text = "Adicionar")
        }

        Text(modifier = Modifier
            .padding(top = 120.dp)
            .align(CenterHorizontally),
            text = text2.toString(),
            fontSize = 100.sp)

        Button(modifier = Modifier
            .padding(top = 30.dp)
            .align(CenterHorizontally),
            onClick = {
                text2 += 1
            }) {
            Text(text = "Adicionar")
        }

    }

}*/

@Composable
fun CounterActivityContent2(activity: ComponentActivity) {
    Column(modifier = Modifier.fillMaxSize()) {
        val modifier = Modifier.align(CenterHorizontally)

        CounterComponent(modifier = modifier)

        CounterComponent(modifier = modifier)

        Button(modifier = Modifier
            .align(CenterHorizontally)
            .padding(top = 50.dp)
            .fillMaxWidth(0.7f),
            onClick = {
                activity.startActivity(Intent(activity, RecomposeActivity::class.java))
            }) {
            Text(text = "Trocar de tela")
        }

    }
}

@Composable
fun CounterComponent(modifier : Modifier){
    var text : Int by remember { mutableStateOf(0) }

    Text(modifier = modifier
        .padding(top = 120.dp),
        text = text.toString(),
        fontSize = 100.sp)

    Button(modifier = modifier
        .padding(top = 30.dp),
        onClick = {
            text += 1
        }) {
        Text(text = "Adicionar")
    }
}

