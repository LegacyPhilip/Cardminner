package OnboardScreen


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

import com.example.angle.R
import screens.Composea

@Composable
fun DetailedOfSelectedPlan(){

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

                Spacer(modifier = Modifier.height(10.dp))

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
                Spacer(modifier = Modifier.height(23.dp))

//:::::::::::::::::::::::::::::>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Detail of Selected Plan <<<<<<<<<<<<<<<<<<<<<<<<<<<::::::::::::::::::::::::::::::::::\\

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
//                        .border(1.dp, Color.Red)
                        .padding(start = 22.dp, end = 22.dp)
                ){

//                    ::::::::::::: Plan Data ::::::::::::::::::: \\\

                    Composea().LeftWing()
//                    :::::::::::: Plan Datatype :::::::::::::::::: \\\

                    Composea().RightWing()
                }

                Spacer(modifier = Modifier.height(28.dp))

//:::::::::::::::::::::::::::::>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Notification for gift card withdrawal <<<<<<<<<<<<<<<<<<<<<<<<<<<::::::::::::::::::::::::::::::::::\\

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, end = 15.dp)
                            .background(Color(0xff122619), RoundedCornerShape(8.dp))
                    ){
                        Text(
                            "Gift Card Reward becomes withdrawable within 2(two) days.",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Light
                            ),
                            modifier = Modifier
                                .padding(22.dp)
                        )
                    }

             Button(onClick = { /*TODO*/ },
                 colors = ButtonDefaults.buttonColors(
                     containerColor =  Color(0xFF1DAEFF),
                     contentColor = Color(0XFFFFFFFF)
                 ),
                 elevation = ButtonDefaults.buttonElevation(
                     defaultElevation = 22.dp
                 ),
                 modifier = Modifier
                     .width(180.dp)
                     .height(40.dp)
                    .offset(x = 190.dp, y = 20.dp),
                 shape = RoundedCornerShape(6.dp)
                 ) {
                    Text(
                        "Earn",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Black,
                        ),
                        modifier = Modifier
//                            .offset()
//                            .padding(top = 8.dp)
                    )
                }

            }
        }
    }
}