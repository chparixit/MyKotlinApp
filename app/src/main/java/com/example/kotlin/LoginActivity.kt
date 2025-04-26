package com.example.kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin.ui.theme.KotlinTheme
import java.nio.file.WatchEvent

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold {innerPadding->
              InstaClone(innerPadding)
                }
            }
        }

    }

@Composable
fun InstaClone(innerPadding : PaddingValues){
    Column(
        modifier= Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color.White)
        ){

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Icon(imageVector =Icons.Default.KeyboardArrowLeft,contentDescription = null, modifier = Modifier
                .height(30.dp)
                .width(30.dp))
            Text(text = "Andrew", style = TextStyle
                (fontSize =25.sp,
                fontWeight= FontWeight.Bold,fontStyle= FontStyle.Italic,textAlign= TextAlign.Center))
            Icon(painterResource(R.drawable.baseline_more_horiz_24),
            contentDescription=null, modifier = Modifier
                    .height(30.dp)
                    .width(30.dp))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(R.drawable.img),contentDescription=null, contentScale = ContentScale.Crop, modifier = Modifier
                .height(120.dp)
                .width(120.dp)
                .clip(shape = RoundedCornerShape(100.dp))
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("174", fontWeight = FontWeight.Bold)
                Text("Posts")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("1M",fontWeight = FontWeight.Bold)
                Text("Followers")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("169",fontWeight = FontWeight.Bold)
                Text("Following")
            }
        }

        Column(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                text = "Andrew Garfield",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold

            )
            Text(
                text = "Artist",
                fontSize = 15.sp,
                color = Color.Gray,
                modifier = Modifier.alpha(0.5f)
            )
            Text(
                text = "ACTOR",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "andrew@aritst.com",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Followed by Tom holland",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )


        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(
                onClick = { // todo when button clicked
                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )

            ) {
                Text(text = "Follow")

            }

            OutlinedButton(
                onClick = { },
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(1.dp,Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black

                )
            ) {
                Text(text = "Message")
            }
            OutlinedButton(
                onClick = { },
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(1.dp,Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black

                )
            ) {
                Text(text = "Email")
            }
            OutlinedButton(onClick = { },
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(1.dp,Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )
            ) {
                Icon(Icons.Default.ArrowDropDown,contentDescription = null)
            }
        }

        }
    }
@Preview(showBackground = true)
@Composable
fun PreviewInsta(){
    InstaClone(innerPadding = PaddingValues(0.dp))
    
}



