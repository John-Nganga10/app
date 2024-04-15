package com.example.johnafternoonproject

import android.content.Intent
import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.johnafternoonproject.ui.theme.JohnAfternoonProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Demo() 
                
            
        }
    }
}

@Composable
fun Demo(){
    Column (modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.back4),
            contentScale = ContentScale.FillBounds
        )

    ){

        val mContext = LocalContext.current

        Text(text = "Welcome to Android",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic)

        Text(text= "Types of cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .height(30.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center)

        Text(text = "1.Subaru")
        Text(text = "2.Rolls Roice")
        Text(text = "3.Mercedes")
        Text(text = "4.Audi")
        //Centered button
       Box(modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center) {
           Button(onClick = {mContext.startActivity(Intent(mContext,DestinationActivity::class.java)) },
               shape = RoundedCornerShape(5.dp),
               colors = ButtonDefaults.buttonColors(Color.Blue)){
               Text(text = "Destinations")
           }
           }
       
        
        
        Spacer(modifier = Modifier.height(10.dp))
        Divider()
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "eMobilis Mobile Training Institute",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        //Lottie Animation
        
        //End Of Lottie
        Spacer(modifier = Modifier.height(10.dp))
        //Centering an image
       Box (modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center) {
           Image(painter =
           painterResource(id = R.drawable.car4), contentDescription = "car",
               modifier = Modifier
                   .size(200.dp)
                   .clip(shape = CircleShape),
           contentScale = ContentScale.Crop)
           
       }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Android was developed by the Open Handset Alliance, led by Google, and other companies. ")
        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Gaming franchies that flopped",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(30.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline)
        Text(text = "1.Call of duty Mordern Warfare 3")
        Text(text = "2.Cyberpunk 2077(until the phantom liberty dlc")
        Text(text = "3.Suicide squad kill the justice league")
        
        Button(onClick = {
             mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "CONTINUE")
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}