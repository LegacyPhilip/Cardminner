package OnboardScreen


import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

import com.example.angle.R
import screens.Composea

@Composable
fun Offers(){

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ){
        LazyColumn(
            modifier = Modifier
                .background(Color(0xff120D0D))
                .fillMaxSize()

        ) {
            item(10) {
                Composea().header()

                Spacer(modifier = Modifier.height(30.dp))



                Row (

                    modifier = Modifier
                        .offset(x= 22.dp)
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.offer),
                        contentDescription = "an icon of offer",
                        Modifier.size(40.dp),
                        tint = Color.White
                    )

                    Text(
                        "Our Offers",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .offset(x = 10.dp, y = 5.dp)
//                            .padding(start = 3.dp)
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))

                Composea().PlansListing()
                Spacer(modifier = Modifier.height(10.dp))
                Composea().PlansListing()
                Spacer(modifier = Modifier.height(10.dp))
                Composea().PlansListing()
                Spacer(modifier = Modifier.height(10.dp))
                Composea().PlansListing()
                Spacer(modifier = Modifier.height(10.dp))
                Composea().PlansListing()

            }
        }
    }
}