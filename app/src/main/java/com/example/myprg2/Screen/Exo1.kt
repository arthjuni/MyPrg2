package com.example.myprg2.Screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Exo1Home(){
    Surface(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(5.dp),
        color = Color(0xFFFFFFFF)
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(start = 6.dp, end = 6.dp, top = 20.dp), horizontalAlignment = Alignment.CenterHorizontally)
        {
            //la parte sopra
            Surface(modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                , shape = RoundedCornerShape(8.dp),
                color = Color(0xA8C0A6EB)
            ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Text(text = "TTTTTT")
                        Text(text = "XXXXX")
                    }
            }
            //la parte sotto
            Spacer(modifier = Modifier.height(25.dp))

                Surface(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .border(
                        border = BorderStroke(
                            width = 2.dp,
                            color = Color(0xFF0A0A0A)
                        ), shape = RoundedCornerShape(5)
                    )
                    .padding(top = 10.dp),

                )
                 {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top) {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .border(
                                border = BorderStroke(width = 3.dp, color = Color(0xE63A1D6B)),
                                shape = RoundedCornerShape(3.dp)
                            ),
                        contentAlignment = Alignment.Center) {
                            OutlinedTextField(value = "",
                                onValueChange = {},
                                enabled = true,
                                label = { Text(text = "Enter Value")}, keyboardOptions =  KeyboardOptions (
                                    keyboardType = KeyboardType.Number, imeAction = ImeAction.Next
                                ), keyboardActions = KeyboardActions {
                                    KeyboardActions.Default
                                }, leadingIcon = {
                                    Icon(imageVector = Icons.Default.Add, contentDescription = "")
                                },
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp)) {
                            Text(text = "Calcul", fontSize = 27.sp, textAlign = TextAlign.Start)

                            Surface() {
                            Row() {
                                Surface(modifier = Modifier
                                    .border(
                                        width = 2.dp, color = Color(0xFF0A0A0A),
                                        shape = CircleShape
                                    )
                                    .size(40.dp),shape = CircleShape, elevation = 6.dp) {

                                    Text(text = buildAnnotatedString {
                                        withStyle(style = ParagraphStyle(textIndent = TextIndent.None)){
                                            withStyle(style = SpanStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)){
                                                append("-")
                                            }
                                        }
                                    }, textAlign = TextAlign.Center, modifier = Modifier.clickable {  })

                                }
                                Spacer(modifier = Modifier.width(10.dp))
                                Surface(modifier = Modifier
                                    .border(
                                        width = 2.dp, color = Color(0xFF0A0A0A),
                                        shape = CircleShape
                                    )
                                    .size(40.dp),shape = CircleShape, elevation = 6.dp) {

                                    Text(text = buildAnnotatedString {
                                        withStyle(style = ParagraphStyle(textIndent = TextIndent.None)){
                                            withStyle(style = SpanStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)){
                                                append("+")
                                            }
                                        }
                                    }, textAlign = TextAlign.Center, modifier = Modifier.clickable {  })

                                }
                            }
                            }
                        }
                        Spacer(modifier = Modifier.height(15.dp))
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(text = "Tip", fontSize = 27.sp, textAlign = TextAlign.Start)
                            Text(text = buildAnnotatedString {
                                withStyle(style = ParagraphStyle(textIndent = TextIndent.None)){
                                    withStyle(style = SpanStyle(fontSize = 30.sp, fontWeight = FontWeight.Light)){
                                        append("$ XXXX")
                                    }
                                }
                            }, textAlign = TextAlign.Center, modifier = Modifier.clickable {  })
                        }
                        Spacer(modifier = Modifier.height(45.dp))
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                            Text(text = "tttt")
                        }
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                        }




                        }
                }

        }
    }
}

@Preview
@Composable
fun PreExo1Home(){
    Exo1Home()
}