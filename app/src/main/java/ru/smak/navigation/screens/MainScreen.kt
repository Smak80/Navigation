package ru.smak.navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import ru.smak.navigation.R
import ru.smak.navigation.navigation.Screen

@Composable
fun MainScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Button(onClick = { navController.navigate(Screen.DETAIL_SCREEN.route) }) {
                Text(stringResource(R.string.detail_screen))
            }
            Button(onClick = { navController.navigate(Screen.SETTINGS_SCREEN.route) }) {
                Text(stringResource(R.string.settings))
            }
        }
    }
}

//@Preview
//@Composable
//fun MainScreenPreview(){
//
//    MainScreen(
//        modifier = Modifier.fillMaxSize()
//    )
//}