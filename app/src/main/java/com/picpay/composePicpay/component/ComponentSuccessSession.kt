package com.picpay.composePicpay.component

import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.picpay.composePicpay.viewmodel.ComponentViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

@Composable
fun ComponentSuccessSession(activity: ComponentActivity, modifier: Modifier){

    val viewModel: ComponentViewModel by activity.viewModel()
    val response by remember { viewModel.response }
    val error by remember { viewModel.error }
    val loading by remember { viewModel.isLoading }

    LaunchedEffect(viewModel){
        viewModel.callService()
    }

    if(!error)
        ComponentSuccess(loading = loading, response = response, modifier = modifier)
    else{
        // Caso de erro
    }


}