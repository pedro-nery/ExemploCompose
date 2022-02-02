package com.picpay.composePicpay.di

import com.picpay.composePicpay.viewmodel.ComponentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val componentModule = module {

    viewModel { ComponentViewModel() }

}