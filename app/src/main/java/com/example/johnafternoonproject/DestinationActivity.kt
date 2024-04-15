package com.example.johnafternoonproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.johnafternoonproject.ui.theme.JohnAfternoonProjectTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
Column (modifier = Modifier.fillMaxSize()) {
    val mContext = LocalContext.current
    //TopApp Bar
    TopAppBar(
        title = { Text(text = "Destinations", color = Color.White) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Green),
        navigationIcon = {
            IconButton(onClick = {
                mContext.startActivity(Intent(mContext, MainActivity::class.java))
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
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(R.drawable.nep),
            contentDescription = "Nep",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop

        )
        Text(
            text = "Let's plan your next vacation!",
            fontSize = 35.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.White,
            textAlign = TextAlign.Center

        )
    }
    //End Of Box
    Spacer(modifier = Modifier.height(10.dp))
    var search by remember { mutableStateOf("") }
    //Search Bar
    OutlinedTextField(
        value = search,
        onValueChange = { search = it },
        placeholder = { Text(text = "What is your destination?") },
        leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
    )


    //End of Search bar
    Spacer(modifier = Modifier.height(10.dp))
    Text(
        text = "Recently viewed",
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        modifier = Modifier.padding(start = 20.dp)
    )
    Spacer(modifier = Modifier.height(10.dp))
    //Card1
    Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
        Card(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(
                            id = R.drawable.rio
                        ),
                        contentDescription = "rio",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = "Boston",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.fillMaxSize(),
                    textAlign = TextAlign.Center
                )


            }

        }
        //End of Card1
        Spacer(modifier = Modifier.width(8.dp))
        Card(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(
                            id = R.drawable.rio
                        ),
                        contentDescription = "rio",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = "Boston",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.fillMaxSize(),
                    textAlign = TextAlign.Center
                )


            }

        }
        //End of Card1
        Spacer(modifier = Modifier.width(8.dp))
        Card(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(
                            id = R.drawable.rio
                        ),
                        contentDescription = "rio",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = "Boston",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.fillMaxSize(),
                    textAlign = TextAlign.Center
                )


            }

        }
        //End of Card1
        Spacer(modifier = Modifier.width(8.dp))

        Card(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(
                            id = R.drawable.rio
                        ),
                        contentDescription = "rio",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = "Boston",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.fillMaxSize(),
                    textAlign = TextAlign.Center
                )


            }

        }
        //End of Card1
        Spacer(modifier = Modifier.width(8.dp))
        
       Row {
           Button(onClick = {
               mContext.startActivity(Intent(mContext,ExploreActivity::class.java))
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
}

}


@Preview(showBackground = true)
@Composable
fun DestinationReview(){
    Destination()
}