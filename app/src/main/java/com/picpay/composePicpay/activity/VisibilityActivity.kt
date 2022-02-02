package com.picpay.composePicpay.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class VisibilityActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisibilityActivityContent()
        }
    }
}

@Composable
fun VisibilityActivityContent() {

    var textVisible : Boolean by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxWidth()) {

        Button(modifier = Modifier
            .padding(top = 40.dp)
            .align(CenterHorizontally)
            .testTag("visibilityButton"),
            onClick = {
            textVisible = !textVisible
        }) {
            Text(text = "Clique aqui")
        }

        if(textVisible)
            Text(modifier = Modifier
                .padding(top = 40.dp)
                .align(CenterHorizontally)
                .testTag("visibilityText"),
                text = "Deu certo",
                fontSize = 24.sp)

    }
    
}
