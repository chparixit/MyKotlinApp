package com.example.kotlin



import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class Card : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold {
                    innerPadding->
                CardClone(innerPadding)
            }

        }
    }
}

@Composable

fun CardClone(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color(0xFF1ED5A0))
    ) {


        Row(modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Card",
                fontSize = 35.sp,
                color = Color.White
            )

            Image(painter = painterResource(R.drawable.img),
                contentDescription = null, contentScale = ContentScale.Crop,
                modifier = Modifier.height(60.dp).width(60.dp).
                clip(shape = RoundedCornerShape(100.dp))
            )


        }

        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 0.dp)
        ) {
            Text(text = "Simple and easy to use app",
                fontSize = 20.sp,
                color = Color.White,

                )
        }
        Spacer(modifier = Modifier.height(50.dp))

        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 10.dp),) {
            androidx.compose.material3.Card(modifier=Modifier.height(150.dp).weight(1F),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )) {
                Column( horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(R.drawable.img_1), contentDescription = null,
                        modifier = Modifier.height(50.dp)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Text", fontSize=15.sp, fontWeight = FontWeight.Bold)
                }


            }
            Spacer(modifier = Modifier.width(10.dp))
            androidx.compose.material3.Card(modifier = Modifier.height(150.dp).weight(1F),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )) {
                Column( horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(R.drawable.img_2), contentDescription = null,
                        modifier = Modifier.height(50.dp).width(80.dp)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Address", fontSize=15.sp, fontWeight = FontWeight.Bold)
                }
            }


        }
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 10.dp),) {
            androidx.compose.material3.Card(modifier=Modifier.height(150.dp).weight(1F),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )) {

                Column( horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(R.drawable.img_3), contentDescription = null,
                        modifier = Modifier.height(50.dp)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Character", fontSize=15.sp, fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            androidx.compose.material3.Card(modifier = Modifier.height(150.dp).weight(1F),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )) {
                Column( horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(R.drawable.img_4), contentDescription = null,
                        modifier = Modifier.height(50.dp)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Bank Card", fontSize=15.sp, fontWeight = FontWeight.Bold)
                }
            }


        }
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 10.dp),) {
            androidx.compose.material3.Card(modifier=Modifier.height(150.dp).weight(1F),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )) {
                Column( horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(R.drawable.img_5), contentDescription = null,
                        modifier = Modifier.height(50.dp)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Password", fontSize=15.sp, fontWeight = FontWeight.Bold)
                }


            }
            Spacer(modifier = Modifier.width(10.dp))
            androidx.compose.material3.Card(modifier = Modifier.height(150.dp).weight(1F),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )) {
                Column( horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(R.drawable.img_6), contentDescription = null,
                        modifier = Modifier.height(50.dp)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "Logistics", fontSize=15.sp, fontWeight = FontWeight.Bold)
                }
            }


        }

        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 10.dp),) {
            androidx.compose.material3.Card(modifier=Modifier.height(100.dp).weight(1F),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )) {
                Row( horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp)) {
                    Image(
                        painter = painterResource(R.drawable.img_7), contentDescription = null,
                        modifier = Modifier.height(50.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(text = "Setting", fontSize=25.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    CardClone(innerPadding = PaddingValues(0.dp))
}