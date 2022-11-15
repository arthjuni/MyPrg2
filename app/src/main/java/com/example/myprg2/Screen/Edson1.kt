package com.example.myprg2.Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun EdsonExo1(){
Column(modifier = Modifier
    .fillMaxWidth()
    .fillMaxHeight()
    .padding(top = 15.dp) ) {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .border(color = Color.Transparent, width = 2.dp, shape = RoundedCornerShape(50)),
        color = Color(0xFFF6F5F8), shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
    ) {
        Column() {

            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 15.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(imageVector = Icons.Rounded.Home, contentDescription = "Home Logo", modifier = Modifier.size(45.dp))
                    Text(text = "MoDo", fontSize = 30.sp, fontWeight = FontWeight.Bold)
                }
                Box(contentAlignment = Alignment.Center, modifier = Modifier
                    .clip(shape = CircleShape)
                    .background(color = Color.White)) {
                    Icon(imageVector = Icons.Rounded.Close, contentDescription = "Chiudi",modifier = Modifier.size(30.dp), tint = Color(
                        0xFFE4DFDF
                    )
                    )
                }
            }
            Canvas(modifier = Modifier.fillMaxWidth(), onDraw ={
                this.drawLine(color = Color.Black,
                    start = Offset(x = 2.dp.toPx(), y = 2.dp.toPx()),
                    end = Offset(x=size.width-10f, y = 2.dp.toPx()),
                    strokeWidth = 0.9f)
            } )
            Spacer(modifier = Modifier.height(30.dp))
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp)) {
                OutlinedTextField(value = "", onValueChange = {}, placeholder = {
                    Text(text = "Create new Space")
                }, trailingIcon = {
                    Icon(imageVector = Icons.Filled.Add, contentDescription = "")
                }, enabled = true, shape = RoundedCornerShape(15.dp), colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White
                ), modifier = Modifier
                    .fillMaxWidth()
                    .border(color = Color.White, shape = RoundedCornerShape(15.dp), width = 4.dp))

                Spacer(modifier = Modifier.height(30.dp))

                OutlinedTextField(value = "", onValueChange = {}, placeholder = {
                    Text(text = "Edit MoDe")
                }, trailingIcon = {
                    Icon(imageVector = Icons.Filled.Settings, contentDescription = "")
                }, enabled = true, shape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp), colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White
                ), modifier = Modifier
                    .fillMaxWidth()
                    .border(color = Color.White, shape = RoundedCornerShape(15.dp), width = 1.dp))

                Canvas(modifier = Modifier.fillMaxWidth(), onDraw ={
                    this.drawLine(color = Color.Black,
                        start = Offset(x = 2.dp.toPx(), y = 2.dp.toPx()),
                        end = Offset(x=size.width-10f, y = 2.dp.toPx()),
                        strokeWidth = 0.9f)
                } )

                OutlinedTextField(value = "", onValueChange = {}, placeholder = {
                    Text(text = "Delete MoDe")
                }, trailingIcon = {
                    Icon(imageVector = Icons.Filled.Delete, contentDescription = "")
                }, enabled = true, shape = RoundedCornerShape(bottomStart = 15.dp, bottomEnd = 15.dp), colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White
                ), modifier = Modifier
                    .fillMaxWidth()
                    .border(color = Color.White, shape = RoundedCornerShape(15.dp), width = 1.dp))
            }
            Spacer(modifier = Modifier.height(30.dp))
            Canvas(modifier = Modifier.fillMaxWidth(), onDraw ={
                this.drawLine(color = Color.Black,
                    start = Offset(x = 2.dp.toPx(), y = 2.dp.toPx()),
                    end = Offset(x=size.width-10f, y = 2.dp.toPx()),
                    strokeWidth = 0.9f)
            } )
            val tb= mutableListOf<String>("Sarint","DevArch","People","FullAM","Service Desk","Data Cloud","Svago","NGMS","ELITE","Tello","Iscritti","Home","Data Cloud","Svago","NGMS","ELITE","Tello","Iscritti","Home")
            LazyVerticalGrid(cells = GridCells.Adaptive(100.dp), content ={
                items(tb.size){sp->
                    Card(modifier = Modifier.size(95.dp).padding(15.dp), shape = RoundedCornerShape(25),
                        backgroundColor = Color.White,
                        elevation = 6.dp) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                            Text(text = "${tb[sp]}")
                        }
                    }
                }
            } )
        }
    }
}
}

@Composable
@Preview(showBackground = true)
fun PreExo1(){
    EdsonExo1()
}
