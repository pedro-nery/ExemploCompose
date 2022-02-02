package com.picpay.composePicpay.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.picpay.composePicpay.R

class LayoutActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutActivityContent()
        }
    }

}

@Composable
private fun LayoutActivityContent(){

    Column(modifier = Modifier.fillMaxSize()) {

        Text(modifier = Modifier
            .align(CenterHorizontally)
            .padding(top = 30.dp),
            text = "Texto 1",
            fontSize = 16.sp)

        Text(modifier = Modifier
            .align(CenterHorizontally)
            .padding(top = 30.dp),
            text = "Texto 2",
            fontSize = 16.sp)

        Row(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(top = 30.dp)
            .background(color = colorResource(id = R.color.teal_200))) {

            Button(modifier = Modifier
                .padding(start = 40.dp)
                .align(CenterVertically),
                onClick = { /*TODO*/ }) {}

            Button(modifier = Modifier
                .padding(start = 40.dp)
                .align(CenterVertically),
                onClick = { /*TODO*/ }) {}
        }
        
        Box(modifier = Modifier
            .size(200.dp)
            .padding(top = 30.dp)
            .align(CenterHorizontally)){

            Image(modifier = Modifier
                .fillMaxSize(),
                painter = painterResource(id = R.drawable.picpay_logo),
                contentDescription = null)

            Image(modifier = Modifier
                .size(50.dp)
                .align(BottomCenter),
                painter = painterResource(id = R.drawable.picpay_logo),
                contentDescription = null)

        }

        ConstraintLayout(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)) {

            val (image1, image2) = createRefs()

            Image(modifier = Modifier
                .size(100.dp)
                .constrainAs(image1) {
                    start.linkTo(parent.start, margin = 100.dp)
                },
                painter = painterResource(id = R.drawable.picpay_logo),
                contentDescription = null)

            Image(modifier = Modifier
                .size(100.dp)
                .constrainAs(image2) {
                    start.linkTo(image1.end)
                    top.linkTo(image1.bottom)
                },
                painter = painterResource(id = R.drawable.picpay_logo),
                contentDescription = null)

        }
    }

}