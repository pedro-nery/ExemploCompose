package com.picpay.composePicpay.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.picpay.composePicpay.component.ComponentSuccessSession

class ComponentExampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentExampleActivityContent(this)
        }
    }
}

@Composable
private fun ComponentExampleActivityContent(componentActivity: ComponentActivity){
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val (component1, component2) = createRefs()

        ComponentSuccessSession(activity = componentActivity,
            modifier = Modifier
                .padding(top = 10.dp)
                .constrainAs(component1){
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })

        ComponentSuccessSession(activity = componentActivity,
            modifier = Modifier
                .padding(top = 10.dp)
                .constrainAs(component2){
                top.linkTo(component1.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
    }

}