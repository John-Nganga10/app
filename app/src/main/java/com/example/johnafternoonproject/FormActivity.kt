package com.example.johnafternoonproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.johnafternoonproject.ui.theme.JohnAfternoonProjectTheme

class FormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyForm()
        }
    }
}

@Composable
fun MyForm(){
    Column (modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.back4),
        contentScale = ContentScale.FillBounds
    )

    ) {
        var firstname by remember {
            mutableStateOf("")
        }
        var lastname by remember {
            mutableStateOf("")
        }
        var email by remember {
            mutableStateOf("")
        }
        var password by remember {
            mutableStateOf("")
        }
        var contact by remember {
            mutableStateOf("")
        }
        var username by remember {
            mutableStateOf("")
        }
        val mContext = LocalContext.current
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.reg),
                contentDescription = "register",
                modifier = Modifier.size(width = 50.dp, height = 50.dp),
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Create an account",
            fontSize = 40.sp,
            color = Color.White,
            modifier = Modifier.fillMaxWidth(),
            fontFamily = FontFamily.Cursive,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = firstname,
            onValueChange = { firstname = it },
            placeholder = { Text(text = "Firstname") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Person"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = lastname,
            onValueChange = { lastname = it },
            placeholder = { Text(text = "Lastname") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Person"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text(text = "Email") },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Password") },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = contact,
            onValueChange = { contact = it },
            placeholder = { Text(text = "Contact") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "Contact"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value =username,
            onValueChange = { username = it },
            placeholder = { Text(text = "Username") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Username"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Register")


        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Already have an account? Login",
            fontSize = 10.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    mContext.startActivity(Intent(mContext,LoginActivity::class.java))
                },
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )




    }
}

@Preview(showBackground = true)
@Composable
fun MyFormPreview(){
    MyForm()
}