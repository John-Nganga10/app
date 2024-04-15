package com.example.johnafternoonproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.johnafternoonproject.ui.theme.JohnAfternoonProjectTheme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Cities", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Arrowback",
                        tint = Color.Black
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Menu",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "Menu",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Menu",
                        tint = Color.Black
                    )
                }
            }
        )
        //End TopApp Bar

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Text(text = "Tickets",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            //Row 1
            Row (modifier = Modifier.padding(start = 30.dp)){
                //Column1
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.nep),
                                contentDescription = "NewYork",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 54000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.nature),
                                contentDescription = "Nature",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "500 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 69000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column2

            }
            //End of Row
            Spacer(modifier = Modifier.height(10.dp))
            //Row 1
            Row (modifier = Modifier.padding(start = 30.dp)){
                //Column1
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.dubs),
                                contentDescription = "Dubs",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "100 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 194000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.afric),
                                contentDescription = "Africa",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "756 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 70000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column2

            }
            //End of Row
            Spacer(modifier = Modifier.height(10.dp))
            //Row 1
            Row (modifier = Modifier.padding(start = 30.dp)){
                //Column1
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.rio),
                                contentDescription = "Rio",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "683 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 124000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.wonder),
                                contentDescription = "Wonder",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "1560 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 291000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column2

            }
            //End of Row
            Spacer(modifier = Modifier.height(10.dp))
            //Row 1
            Row (modifier = Modifier.padding(start = 30.dp)){
                //Column1
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.statue),
                                contentDescription = "Stat",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "890 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 98000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.free),
                                contentDescription = "LA",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "404 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 40000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column2

            }
            //End of Row
            Spacer(modifier = Modifier.height(10.dp))
            //Row 1
            Row (modifier = Modifier.padding(start = 30.dp)){
                //Column1
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.fyggyu),
                                contentDescription = "Eastside",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "669 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 147000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.field),
                                contentDescription = "Hike",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "1800 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 210000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column2

            }
            //End of Row
            Spacer(modifier = Modifier.height(10.dp))
            //Row 1
            Row (modifier = Modifier.padding(start = 30.dp)){
                //Column1
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.images),
                                contentDescription = "Cliffhanger",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "310 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 80000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.bluuuuuu),
                                contentDescription = "NIKKER",
                                modifier =  Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "246 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh 34000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0757890212".toUri()
                            mContext.startActivity(callIntent) })
                        {
                            Text(text = "Call")

                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello i am John and i am requesting a tour visit")
                            mContext.startActivity(shareIntent) }) {
                            Text(text = "Email")

                        }
                    }


                }
                //End of Column2

            }
            //End of Row
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Button(onClick = {
                    mContext.startActivity(Intent(mContext, ListActivity::class.java))
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
fun ExplorePreview (){
    Explore()
}