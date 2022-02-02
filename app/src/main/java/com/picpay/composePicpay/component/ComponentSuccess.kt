package com.picpay.composePicpay.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.google.accompanist.placeholder.PlaceholderDefaults
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.material.color
import com.google.accompanist.placeholder.material.shimmer
import com.google.accompanist.placeholder.placeholder
import com.picpay.composePicpay.R
import com.picpay.composePicpay.commom.Title1

@Composable
fun ComponentSuccess(loading: Boolean, response: String, modifier: Modifier){

        Card(modifier = modifier
            .padding(top = 40.dp)
            .fillMaxWidth(0.8f)
            .height(200.dp)
            .placeholder(
                visible = loading,
                highlight = PlaceholderHighlight.shimmer(),
                color = PlaceholderDefaults.color(),
                shape = RoundedCornerShape(10.dp)
            ),
            elevation = 10.dp,
            shape = RoundedCornerShape(10.dp)
        ) {
            ConstraintLayout(modifier = Modifier.fillMaxSize()) {

                val (image, name) = createRefs()

                Box(modifier = Modifier
                    .width(120.dp)
                    .fillMaxHeight()
                    .constrainAs(image) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                    }
                    .background(colorResource(id = R.color.green)))

                Title1(modifier = Modifier
                    .padding(top = 15.dp, start = 25.dp, end = 25.dp)
                    .constrainAs(name){
                        start.linkTo(image.end)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                },
                    text = "Bem vindo $response")
            }
        }

}