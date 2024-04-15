package com.example.johnafternoonproject

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.johnafternoonproject.ui.theme.JohnAfternoonProjectTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class AssignmentActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment()
            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {
                delay(1000)
                mContext.startActivity(Intent(mContext, AssignmentActivity2::class.java))
                finish()

            }
        }
    }
}

@Composable
fun Assignment(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    )
    {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.pin),
                contentDescription = "instagram",
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop

            )
        }

        Text(
            text = "Choose Your product",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "By know checking the products you will be able to make a choice on what you want.",
            fontSize = 10.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {},
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Next")

        }
    }
}
@Preview(showBackground = true)
@Composable
fun AssignmentPreview(){
    Assignment()
}