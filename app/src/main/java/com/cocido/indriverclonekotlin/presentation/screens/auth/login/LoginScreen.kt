package com.cocido.indriverclonekotlin.presentation.screens.auth.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cocido.indriverclonekotlin.R

@Composable
@Preview
fun LoginScreen() {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Scaffold(
        contentWindowInsets = WindowInsets.navigationBars
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFF370086), Color(0xFF6A00FF))
                    )
                )
                .padding(paddingValues)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.fillMaxHeight()
            ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontSize = 33.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .rotate(90f)
                        .padding(top = 12.dp)
                )
                Spacer(modifier = Modifier.height(150.dp))
                Text(
                    text = "Registro",
                    color = Color.White,
                    fontSize = 27.sp,
                    modifier = Modifier
                        .rotate(90f)
                        .padding(top = 35.dp)
                )
                Spacer(modifier = Modifier.height(250.dp))
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 60.dp, bottom = 35.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color(0xFF4E03B6), Color(0xFF8A39FD))
                        ),
                        shape = RoundedCornerShape(
                            topStart = 35.dp,
                            bottomStart = 35.dp
                        )
                    )
            ) {
                Column(
                    modifier = Modifier
                        .statusBarsPadding()
                        .padding(start = 20.dp)
                ) {
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Welcome",
                        color = Color.White,
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "back...",
                        color = Color.White,
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 25.dp)
                    ) {
                        Image(
                            modifier = Modifier
                                .size(180.dp)
                                .align(Alignment.CenterEnd),
                            painter = painterResource(id = R.drawable.car_white),
                            contentDescription = "",
                        )
                    }
                    Text(
                        text = "Log in",
                        color = Color.White,
                        fontSize = 27.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(50.dp))
                    TextField(
                        value = email,
                        onValueChange = {
                            email = it
                        },
                        label = { Text(text = "Email") }
                    )
                    TextField(
                        value = password,
                        onValueChange = {
                            password = it
                        },
                        label = { Text(text = "Password") }
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Box(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .align(Alignment.Center)
                                .width(250.dp)
                                .height(55.dp)
                        ) {
                            Text(
                                text = "LOGIN",
                                fontSize = 18.sp
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(
                            modifier = Modifier
                                .width(30.dp)
                                .height(1.dp)
                                .background(color = Color.White)
                        )
                        Text(
                            modifier = Modifier.padding(horizontal = 10.dp),
                            text = "O",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                        Spacer(
                            modifier = Modifier
                                .width(30.dp)
                                .height(1.dp)
                                .background(color = Color.White)
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "¿No tienes cuenta?",
                            color = Color.White,
                            fontSize = 17.sp
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "Registrate",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp
                        )
                    }
                }
            }
        }
    }

}