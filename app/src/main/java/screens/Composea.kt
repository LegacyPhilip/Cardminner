package screens

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.angle.R

public class Composea {
    @Composable
    fun Logo() {
        Box(
            contentAlignment = Alignment.TopEnd,

            modifier = Modifier
                .padding(top = 22.dp, end = 22.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Top Right level company logo ",
                Modifier.size(60.dp)
            )
        }
    }


    @Composable
    fun header() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 22.dp)
//                    .border(1.dp, Color.Red)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .width(35.dp)
                    .height(35.dp)
                    .offset(22.dp, 5.dp)
                    .background(Color(0xffD9D9D9), shape = RoundedCornerShape(100.dp))

            ) {
                Text(
                    "AL",
                    style = TextStyle(
                        color = Color(0xff120D0D),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,

                        )
                )
            }

            Box(
                modifier = Modifier
                    .offset(40.dp, 10.dp)
            ) {
                Text(
                    "Augustina Legacy",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400),
                        fontStyle = FontStyle.Normal
                    )
                )
            }

            Box(

                contentAlignment = Alignment.TopEnd,
                modifier = Modifier
//                    .offset(120.dp)
                    .padding(end = 22.dp)
//                    .border(1.dp, Color.Red)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Top Right level company logo ",
                    Modifier.size(50.dp)
                )
            }
        }
    }


    @Composable
    fun PlansListing() {
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

    //  ################################################ Left Wing of Full Details of Selected Plan ##########################################\\
    @Composable
    fun LeftWing() {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
//                                .border(1.dp, Color.Cyan)
        ) {
            Column {
                Text(
                    "Offer",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                    ),

                    )
                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Type of Plan ][][][][][][][][][][][][][][][][[][][][][][]::::::::::::::::::\\

                Text(
                    "Type",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),

                    )
                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Capacity of Plan ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "Capacity",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),

                    )


                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Tag on Plan ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "Tag",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),

                    )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Duration of Plan ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "Duration",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Total Return  of Plan ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "Total Return",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),
                )


                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Daily Return  of Plan ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "Daily Return",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Minimum Withdrawal  ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "Minimum Withdrawal",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with  Gift Card Reward ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "Payment with Gift Card Reward",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Bank Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "Payment with Bank Card",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Gift Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "Payment with Gift Card",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),
                )
            }
        }
    }


    //  ################################################ Right Wing Of Full Details of Selected Plan ###########################################\\
    @Composable
    fun RightWing() {
        Box(
            contentAlignment = Alignment.TopEnd,
            modifier = Modifier
//                            .border(1.dp, Color.Magenta)
//                            .padding(end = 22.dp)
                .fillMaxWidth()
        ) {


            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    "Queens Angle",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.End
                    ),
                    modifier = Modifier
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Bank Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "12z Feet Caravan",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )
                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Bank Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "1,500 Light Weight Goods",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Bank Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "$700.00",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Bank Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "28Days",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Bank Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "$2,100.00",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Bank Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "$75.00",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Start
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Bank Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "$40.00",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Bank Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "$10.00",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Bank Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "$728.00",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Bank Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "710.00",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )


            }
        }
    }

//    Dialog Box

    @Composable
    fun PaymentVerificationPopup() {
        var showDialog by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Button to trigger the popup
            Button(onClick = { showDialog = true },
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
                    .offset(x = 100.dp),
                shape = RoundedCornerShape(6.dp)

            ) {
//                Icon(imageVector = Icons.Default.Info, contentDescription = "Info")
//                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    "Proceed",
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

            // Dialog
            if (showDialog) {
                AlertDialog(
                    onDismissRequest = { showDialog = false },
                    title = {
                        Text(text = "Verifying Payment!")
                    },
                    icon = {
                        Icon(painter = painterResource(id = R.drawable.rotate),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.size(80.dp)

                           )
                    },
//                Icon(painter = painterResource(id = R.drawable.rotate), tint = Color.Unspecified),

                    text = {
                        Text(text = "please wait while submitted payment details are been verified",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center
                            )
                            )
                    },
                    confirmButton = {
                        Button(onClick = { showDialog = false }) {
                            Text(text = "OK")
                        }
                    }
                )
            }
        }
    }

//   ::::::::::::::::::::::::::::::::::::::::::: Payment Field using Gift Card ::::::::::::::::::::::::::::::: \\

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable

    fun PaymentPattern() {
        var emailAddress by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .offset(y = -(50).dp)
                .padding(start = 22.dp, end = 22.dp)
        ) {
            Text(
                "User ID",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                "Card Number",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )
            Spacer(modifier = Modifier.height(18.dp))

            Text(
                "Pin",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )
            Spacer(modifier = Modifier.height(18.dp))

            Text(
                "Upload Card",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )
        }

    }

    //  ################################################ Left Wing of Payment Summary ##########################################\\
    @Composable
    fun PaymentSummaryLeftWing() {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .offset(y = -80.dp)
//                                .border(1.dp, Color.Cyan)
        ) {
            Column {
                Text(
                    "Offer",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                    ),

                    )
                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Gift Card ][][][][][][][][][][][][][][][][[][][][][][]::::::::::::::::::\\

                Text(
                    "Payment with Gift Card",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),

                    )
                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ User ID ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "User ID",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),

                    )


                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Card Number ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "Card Number",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                    ),

                    )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Card Pin  ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "Card Pin",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
//                        concept setting
                    ),
                )

            }
        }



        //  ################################################ Right Wing Of Payment Summary ###########################################\\

    }

    @Composable
    fun PaymentSummaryRightWing() {
        Box(
            contentAlignment = Alignment.TopEnd,
            modifier = Modifier
                .offset(y = -(80.dp))
//                            .border(1.dp, Color.Magenta)
//                            .padding(end = 22.dp)
                .fillMaxWidth()
        ) {


            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    "Queens Angle",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.End
                    ),
                    modifier = Modifier
                )

                Spacer(modifier = Modifier.height(21.dp))

//:::::::::::::::::::[][][][][][][][][][][][][][][ Payment with Gift Card ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "$716.00",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )
                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ User ID ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "DHCS87957",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))
//:::::::::::::::::::[][][][][][][][][][][][][][][ Card Number ][][][][][][][][][][][][][][][][[][][][][][]:::::::::::::::::::::::::::\\
                Text(
                    "3482-6789-3875-2213",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )

                Spacer(modifier = Modifier.height(21.dp))

                Text(
                    "456KYSTY",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.End
                    ),
                )
            }
        }
    }


    //   ::::::::::::::::::::::::::::::::::::::::::: Deposit Field using Gift Card ::::::::::::::::::::::::::::::: \\

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable

    fun DepositFields() {
        var emailAddress by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .offset(y = -(50).dp)
                .padding(start = 22.dp, end = 22.dp)
        ) {

            Text(
                "Select Offer",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                "User ID",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                "Card Number",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )
            Spacer(modifier = Modifier.height(18.dp))

            Text(
                "Pin",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )
            Spacer(modifier = Modifier.height(18.dp))

            Text(
                "Upload Card",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )
        }

    }

    //   ::::::::::::::::::::::::::::::::::::::::::: Deposit Field using Gift Card ::::::::::::::::::::::::::::::: \\

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable

    fun WithdrawScreen() {
        var emailAddress by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .offset(y = -(50).dp)
                .padding(start = 22.dp, end = 22.dp)
        ) {



            Text(
                "User ID",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                "Email Address",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )
            Spacer(modifier = Modifier.height(18.dp))

            Text(
                "Amount",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )
            Spacer(modifier = Modifier.height(18.dp))

            Text(
                "Pin",
                style = TextStyle(
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clipToBounds()
                    .padding(top = 15.dp, end = 22.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(9.dp)
                    ),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Unspecified


                ),

                )
        }

    }

}
