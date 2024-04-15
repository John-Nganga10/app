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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.johnafternoonproject.ui.theme.JohnAfternoonProjectTheme

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyList()
        }
    }
}

@Composable
fun MyList(){
Column (
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
){
    val mContext = LocalContext.current
    Row(modifier = Modifier.padding(30.dp)) {
        Image(painter = painterResource(id = R.drawable.dogprint),
            contentDescription ="Dogprint",
            modifier = Modifier
                .size(width = 50.dp, height = 55.dp)
                .size(120.dp)
                .clip(CircleShape),

            )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(
                text = "Woof",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)

            )
        }

    }
    //Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.dog1),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(80.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Dmx",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="1 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
    //Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.dog7),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Neptune",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="5 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
    //Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.dog6),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Nick ker",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="4 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
    //Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.dog8),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Bruno",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="11 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
    //Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.dog9),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Brutus",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="10 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
    //Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.eish),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Max",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="9 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
    //Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.bulldog),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Rottie",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="8 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
    //Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.doggie),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Roll",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="7 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
//Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.dog1),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Rex",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="3 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
//Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.dog6),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Pixel",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="1 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
//Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.dog7),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Jack",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="6 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
//Card 1
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(350.dp)
            .padding(10.dp)

    ) {

        Row {
            Image(painter = painterResource(id = R.drawable.eish),
                contentDescription ="Dog1",
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Tga",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text ="5 years old",
                    fontSize = 10.sp
                )
            }


        }


    }

    //End of Card1
    Button(onClick = {
        mContext.startActivity(Intent(mContext,LottieActivity::class.java))
    },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Red),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp)
    ) {
        Text(text = "CONTINUE")
    }
    Button(onClick = {
        mContext.startActivity(Intent(mContext,AssignmentActivity::class.java))
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
fun MyListPreview(){
    MyList()
}