package com.example.johnafternoonproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.johnafternoonproject.ui.theme.JohnAfternoonProjectTheme

class LottieActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mlottie()

        }
    }
}

@Composable
fun Mlottie(){
Column (modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
) {    //Lottie Animation
    //Lottie Animation
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.contact))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(composition, progress,
        modifier = Modifier.size(300.dp)
    )
    //End Of Lottie
    Spacer(modifier = Modifier.height(10.dp))
    Text(
        text = "Plan your next vacation",
        fontWeight = FontWeight.ExtraBold,
        fontSize = 30.sp
    )

    Spacer(modifier = Modifier.height(10.dp))




}
}

@Preview(showBackground = true)
@Composable
fun MlottiePreview(){
    Mlottie()
}