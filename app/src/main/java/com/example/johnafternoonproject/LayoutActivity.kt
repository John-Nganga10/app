package com.example.johnafternoonproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.johnafternoonproject.ui.theme.JohnAfternoonProjectTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout() {
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Cities", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Green),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrowback",
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "Menu",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Menu",
                        tint = Color.White
                    )
                }
            }
        )
        //End TopApp Bar
        Text(
            text = "Destnations",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Cursive
        )
        //First Row
        Row {
            Image(
                painter = painterResource(id = R.drawable.dubs),
                contentDescription = "Dubs",
                modifier = Modifier.size(width = 150.dp, height = 100.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "Dudai", fontWeight = FontWeight.Bold)
                Text(text = "Dubai is the most populous city in the United Arab Emirates (UAE) and the capital of the Emirate of Dubai, the most populated of the country's seven manmade islands.")
            }

        }

        //End of row

        //First Row
        Row {
            Image(
                painter = painterResource(id = R.drawable.wonder),
                contentDescription = "Wonder",
                modifier = Modifier.size(width = 150.dp, height = 100.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "Wonder", fontWeight = FontWeight.Bold)
                Text(text = "It is an archipelago consisting of more than 7,000 islands and islets lying about 500 miles (800 km) off the coast of Vietnam. Manila is the capital, but nearby islands.")
            }

        }

        //End of row
        //First Row
        Row {
            Image(
                painter = painterResource(id = R.drawable.afric),
                contentDescription = "Afric",
                modifier = Modifier.size(width = 150.dp, height = 100.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "Kenya", fontWeight = FontWeight.Bold)
                Text(text = "Kenya is one of the most beloved countries in Africa due its culture and tourism since it is a site for one of the great wonder of the world The Wildbeast migration.")
            }

        }

        //End of row
        Spacer(modifier = Modifier.width(300.dp))

        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,IntentsActivity::class.java))
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
fun LayoutPreview (){
    Layout()
}