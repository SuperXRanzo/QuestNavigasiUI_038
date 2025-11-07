package com.example.questnavigasiui_038.view

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<R.string> = listOf("Laki-Laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
