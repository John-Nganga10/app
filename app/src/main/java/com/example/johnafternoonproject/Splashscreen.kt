package com.example.johnafternoonproject

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.johnafternoonproject.ui.theme.JohnAfternoonProjectTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Splashscreen : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Splash()
            val mContext = LocalContext.current
            val coroutine = rememberCoroutineScope()
            coroutine.launch{
                delay(5000)
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
                finish()
            }

        }
    }
}

@Composable
fun Splash(){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.controller))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )
        //End Of Lottie
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Itsa Mario",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 20.dp)
        )

    }
}
@Preview(showBackground = true)
@Composable
fun SplashPreview(){
    Splash()
}