package OnboardScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.core.view.KeyEventDispatcher.Component
import com.example.angle.R
import screens.Composea

@Composable
fun DashboardScreen(){


    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .background(Color(0xff120D0D))
                .fillMaxSize()

        ) {
            item(1) {
                Composea().header()

                Box(
                    modifier = Modifier
                        .offset(22.dp, 40.dp)
                ) {
                    Text(
                        "Asset in Gift card",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 13.sp,
                            fontWeight = FontWeight(800),
                            fontStyle = FontStyle.Normal
                        )
                    )
                }

                Row(
                    modifier = Modifier
                        .offset(22.dp, 60.dp)
                        .fillMaxWidth()
                ) {
    //:::::::::::::::::::::::::::: >>>>>>>>>>>>>>>>>>>>> Type of Angle Card <<<<<<<<<<<<<<<<<<<<<<<<<< :::::::::::::::::::::::::::::::::\\

                    Column(


                        modifier = Modifier
                            //                        .border(1.dp, Color(0xff9F9F9F), shape = RoundedCornerShape(6.dp))
                            .background(Color.White, shape = RoundedCornerShape(10.dp))
                            .fillMaxWidth(0.5f)
                            .height(355.dp)
                    ) {

                        //                    Top Right
                        Box(
                            contentAlignment = Alignment.TopEnd,
                            modifier = Modifier
                                .fillMaxWidth()


                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.topright),
                                contentDescription = null,
                                Modifier.size(140.dp),
                                contentScale = ContentScale.FillWidth
                            )
                        }


                        Text(
                            text = "$67,000.00",
                            style = TextStyle(
                                color = Color(0xff002067),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center,


                                ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .offset(y = 30.dp)
                        )

                        Text(
                            text = "Angle card",
                            style = TextStyle(
                                color = Color(0xff002067),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Black,
                                textAlign = TextAlign.End,


                                ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 26.dp, end = 22.dp)
                        )
                        Box(
                            contentAlignment = Alignment.TopEnd,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 22.dp)
                            //                            .border(1.dp, Color.Green)


                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bottom2),
                                contentDescription = null,
                                Modifier.size(230.dp),
                                contentScale = ContentScale.FillWidth
                            )
                        }


                    }
// ::::::::::::::::::::::::::::::::: Details of selected plan
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 15.dp, end = 40.dp)
                    ) {

//:::::::::::::::::::::::::::: >>>>>>>>>>>>>>>>>>>>> Type of plan selected <<<<<<<<<<<<<<<<<<<<<<<<<< :::::::::::::::::::::::::::::::::\\

                        Box(
                            modifier = Modifier
                                .background(Color(0xffF8F8F8), shape = RoundedCornerShape(10.dp))
                                .fillMaxWidth()
                                .height(110.dp)
                                .border(1.dp, Color(0xffE8E8E8), shape = RoundedCornerShape(10.dp))
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxSize()
                            )

                            {
                                Text(
                                    "Active Plan",
                                    style = TextStyle(
                                        color = Color(0xff02143E),
                                        fontSize = 8.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.End

                                        ),
                                    modifier = Modifier
                                        .padding(top = 8.dp, end = 10.dp)
//                                        .border(1.dp, Color.Green)
                                        .fillMaxWidth()

                                )

                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier =  Modifier
//                                        .border(1.dp, Color.Red)
                                        .padding(5.dp)

                                ) {
                                    Text(
                                        "$50",
                                        style = TextStyle(
                                            fontSize = 18.sp,
                                            fontWeight = FontWeight.Black,
                                            color = Color(0xff02143E),
                                            textAlign = TextAlign.Center
                                        ),
                                        modifier = Modifier
                                            .offset(y = 4.dp)
                                    )

                                    Spacer(
                                        modifier = Modifier
                                            .width(4.dp)
                                    )
                                    Text(
                                        text = "Per day",
                                        style = TextStyle(
                                            fontSize = 11.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color(0xff02143E),
                                            textAlign = TextAlign.Center
                                        ),
                                        modifier = Modifier
                                            .offset(y = 3.dp)
                                            .padding(1.dp)
                                            .background(Color(0xffEC9108))
                                            .width(45.dp)
                                            .height(20.dp)
                                    )
                                }



                                Text(
                                    text = "LEVRAGE PLAN",
                                    style = TextStyle(
                                        color = Color(0xff02143E),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight(400),
                                        textAlign  =  TextAlign.Center
                                    ),
                                    modifier = Modifier


                                )

                                Text(
                                    text = "30 active days",
                                    style = TextStyle(
                                        color = Color(0xff02143E),
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.ExtraLight
                                    ),
                                    modifier = Modifier
//                                        .padding(top = 1.dp)
                                )
                            }
                        }
                        Spacer(
                            modifier = Modifier
                                .height(20.dp)
                        )

                        //:::::::::::::::::::::::::::: >>>>>>>>>>>>>>>>>>>>> Deposited Amount  <<<<<<<<<<<<<<<<<<<<<<<<<< :::::::::::::::::::::::::::::::::\\

                        Box(
                            modifier = Modifier
                                .background(Color(0xffF8F8F8), shape = RoundedCornerShape(10.dp))
                                .fillMaxWidth()
                                .height(100.dp)
                                .border(1.dp, Color(0xffE8E8E8), shape = RoundedCornerShape(10.dp))

                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxSize()
                            )

                            {
                                Text(
                                    "Deposit",

                                    style = TextStyle(
                                        color = Color(0xff02143E),
                                        fontSize = 8.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.End

                                        ),
                                    modifier = Modifier
                                        .padding(top = 8.dp, end = 10.dp)
//                                        .border(1.dp, Color.Green)
                                        .fillMaxWidth()

                                )

                                Text(
                                    text = "$75",
                                    style = TextStyle(
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xff02143E),
                                        textAlign = TextAlign.Center
                                    ),
                                    modifier = Modifier
                                        .offset(y = 20.dp)

                                    //                                    .background(Color(0xffEC9108))
                                    //                                    .width(110.dp)
                                )

                                Text(
                                    text = "Razer Gold",
                                    style = TextStyle(
                                        color = Color(0xff02143E),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight(600)
                                    ),
                                    modifier = Modifier
                                        .padding(top = 15.dp)
                                )
                            }
                        }
                        Spacer(
                            modifier = Modifier
                                .height(20.dp)
                        )

       //:::::::::::::::::::::::::::: >>>>>>>>>>>>>>>>>>>>> Timeline  <<<<<<<<<<<<<<<<<<<<<<<<<< :::::::::::::::::::::::::::::::::\\
                        Box(
                            modifier = Modifier
                                .background(Color(0xffF8F8F8), shape = RoundedCornerShape(10.dp))
                                .fillMaxWidth()
                                .height(105.dp)
                                .border(1.dp, Color(0xffE8E8E8), shape = RoundedCornerShape(10.dp))
                        ) {

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxSize()
                            )

                            {
                                Text(
                                    "Timeline",
                                    style = TextStyle(
                                        color = Color(0xff02143E),
                                        fontSize = 8.sp,
                                        fontWeight = FontWeight.Bold,

                                        textAlign = TextAlign.End

                                    ),
                                    modifier = Modifier
                                        .padding(top = 8.dp, end = 10.dp)
//                                        .border(1.dp, Color.Green)
                                        .fillMaxWidth()

                                )

                                Text(
                                    text = "DAY 5",
                                    style = TextStyle(
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xff02143E),
                                        textAlign = TextAlign.Center
                                    ),
                                    modifier = Modifier
                                        .offset(y = 22.dp)

                                        .background(Color(0xffEC9108))
                                        .width(80.dp)
                                )

                                Text(
                                    text = "5 June -31 November 2023",
                                    style = TextStyle(
                                        color = Color(0xff02143E),
                                        fontSize = 8.sp,
                                        fontWeight = FontWeight(400)
                                    ),
                                    modifier = Modifier
                                        .padding(top = 25.dp)
//                                        .border(1.dp, Color.Red)
                                )
                            }
                        }
                    }
                }

 //:::::::::::::::::::::::::::: >>>>>>>>>>>>>>>>>>>>> Related Assets   <<<<<<<<<<<<<<<<<<<<<<<<<< :::::::::::::::::::::::::::::::::\\
                //            Related Asset
                Spacer(modifier = Modifier.height(60.dp))
                Text(
                    "Related Assets",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp, start = 22.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        //                    .border(1.dp, Color.White)
                        .padding(top = 20.dp, start = 22.dp, end = 22.dp)
                ) {

 //:::::::::::::::::::::::::::: >>>>>>>>>>>>>>>>>>>>> Active Balance <<<<<<<<<<<<<<<<<<<<<<<<<< :::::::::::::::::::::::::::::::::\\
                    Box(
                        //                    contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .width(90.dp)
                            .height(80.dp)
                            .border(1.dp, Color(0xffF5F5F5))
                    ) {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp)
                            //                        verticalArrangement = Arrangement.Top
                        ) {
                            Text(
                                text = "Active Balance ",
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 8.sp,
                                    fontWeight = FontWeight(400),
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                            )

                            Text(
                                text = "$400 ",
                                style = TextStyle(
                                    color = Color(0xffEC9108),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight(800),
                                    textAlign =  TextAlign.Center
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .fillMaxWidth()
                            )
                        }

                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    //:::::::::::::::::::::::::::: >>>>>>>>>>>>>>>>>>>>> Referal Bonus  <<<<<<<<<<<<<<<<<<<<<<<<<< :::::::::::::::::::::::::::::::::\\
                    Box(
                        modifier = Modifier
                            .width(90.dp)
                            .height(80.dp)
                            .border(1.dp, Color(0xffF5F5F5))
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp)
                            //                        verticalArrangement = Arrangement.Top
                        ) {
                            Text(
                                text = "Referal Bonus  ",
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 8.sp,
                                    fontWeight = FontWeight(400)
                                )
                            )

                            Text(
                                text = "$40 ",
                                style = TextStyle(
                                    color = Color(0xffEC9108),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight(800)
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    //:::::::::::::::::::::::::::: >>>>>>>>>>>>>>>>>>>>> Lucky Bonus <<<<<<<<<<<<<<<<<<<<<<<<<< :::::::::::::::::::::::::::::::::\\
                    Box(
                        modifier = Modifier
                            .width(90.dp)
                            .height(80.dp)
                            .border(1.dp, Color(0xffF5F5F5))
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp)
                            //                        verticalArrangement = Arrangement.Top
                        ) {
                            Text(
                                text = "Lucky Bonus",
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 8.sp,
                                    fontWeight = FontWeight(400)
                                )
                            )

                            Text(
                                text = "$10 ",
                                style = TextStyle(
                                    color = Color(0xffEC9108),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight(800),
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .fillMaxWidth()
                            )
                        }
                    }
                }

                //:::::::::::::::::::::::::::: >>>>>>>>>>>>>>>>>>>>> Trending Plans  <<<<<<<<<<<<<<<<<<<<<<<<<< :::::::::::::::::::::::::::::::::\\
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    "Trending Plan",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 22.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))

                //:::::::::::::::::::::::::::: >>>>>>>>>>>>>>>>>>>>> Contanier for Active plan  <<<<<<<<<<<<<<<<<<<<<<<<<< :::::::::::::::::::::::::::::::::\\
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 22.dp, end = 22.dp)
                        .background(Color(0xffEC9108), shape = RoundedCornerShape(8.dp))
                ) {


                    Column(
                        modifier = Modifier
                            .padding(18.dp)
                        //                            .border(1.dp, Color.Red)
                    ) {
                        Text(
                            text = "12 Day Hit",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                fontWeight = FontWeight(800)
                            )
                        )

                        Text(
                            text = "The 12days Hit plan, comes twice every month, Payment with Gift Cards comes with additonal  \$40 for 3 times durring the hit, which can be withdrawn  at anytime ",

                            style = TextStyle(
                                color = Color(0xff060606),
                                fontSize = 10.sp,
                                fontWeight = FontWeight(400)
                            ),
                            modifier = Modifier
                                .fillMaxWidth(0.6f)
                        )
                    }

                    Column(
                        horizontalAlignment = Alignment.End,
                        modifier = Modifier
                            .padding(top = 18.dp, end = 18.dp)
                            //                        .border(1.dp, Color.Green)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "DP: \$120 ",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                fontWeight = FontWeight(800)
                            )
                        )
                        Text(
                            text = "DN: \$30 ",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                fontWeight = FontWeight(800)
                            )
                        )
                        Text(
                            text = "TN: \$360 ",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                fontWeight = FontWeight(800)
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .background(Color(0xff120D0D), shape = RoundedCornerShape(8.dp))
                                .fillMaxWidth()
                                .height(30.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xff120D0D)
                            )

                        ) {
                            Text(
                                text = "Acquire ",
                                style = TextStyle(
                                    color = Color.White,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight(800)
                                ),
                                modifier = Modifier.offset(y = -5.dp)
                            )

                        }
                        Spacer(modifier = Modifier.height(8.dp))

                    }
                }
            }
        }
    }
}