package OnboardScreen


import androidx.compose.foundation.Image
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

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale


import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign


import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

import com.example.angle.R
import screens.Composea

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaymentRecivedScuessful(){

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


                Spacer(modifier = Modifier.height(30.dp))

                Row (
                    modifier = Modifier
//                        .border(1.dp, Color.Blue)
                        .padding(start = 22.dp, end = 22.dp)
                        .fillMaxWidth()
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.deposit),
                        contentDescription = "an icon of offer",
                        Modifier.size(40.dp),
                        tint = Color.White
                    )

                    Text(
                        "Payment Summary",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .offset(x = 10.dp, y = 5.dp)
//                            .padding(start = 3.dp)
                    )


                }
                Spacer(modifier = Modifier.height(30.dp))


                Box(
                    contentAlignment =  Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = (100).dp)
                        .padding(start = 22.dp, end = 22.dp)
//                        .border(1.dp, Color.Blue)
                ){

                    Image(painter = painterResource(id = R.drawable.sucessful), contentDescription = "Image of raza gold giftcard", Modifier.size(120.dp), contentScale = ContentScale.Fit)
                }


//   ::::::::::::::::::::::::::::::: Payment input field ::::::::::::::::::::: \\

                Spacer(modifier = Modifier.height(131.dp))

                Column(
                    horizontalAlignment =  Alignment.CenterHorizontally,

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 22.dp, end = 22.dp)
                ){
                    Text(
                        "Payment Submitted Successfully",
                        style = TextStyle(
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                        )

                    )
                    Spacer(modifier = Modifier.height(11.dp))

                    Text(
                        "Asset will be credited within 20min",
                        style = TextStyle(
                            color = Color.White,
                            fontWeight = FontWeight.Light,
                            fontSize = 14.sp,
                        )
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
                        .offset(x = 100.dp, y = 243.dp),
                    shape = RoundedCornerShape(6.dp)
                ) {
                    Text(
                        "To Dashboard",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Black,
                        ),
                        modifier = Modifier

                    )
                }


            }
        }
    }
}