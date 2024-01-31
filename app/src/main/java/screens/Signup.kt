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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.angle.R

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun SignUpScreen(){
    var emailAddress by remember{mutableStateOf("")}
    var password by remember {mutableStateOf("")}
    var username by remember {mutableStateOf("")}
    var cpass by remember {mutableStateOf("")}

    val gradientColors = listOf(Color(0xFFD04954), Color(0xFFA51DA0))
    val gradientBrush = Brush.horizontalGradient(gradientColors)
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            //        verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(1) {
                //            Company Logo
                Composea().Logo()

                //            Login
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.signup_logo),
                        contentDescription = "Signup logo",
                        Modifier.size(80.dp)
                    )
                    Text(
                        "access unlimited income options that increase your financial status with us today",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 13.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight(300),
                            textAlign = TextAlign.Center

                        ),
                        modifier = Modifier
                            .fillMaxWidth(0.6f)
                    )
                }


                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 22.dp, top = 40.dp)
                ) {

                    Column {
                        Text(
                            "Username",
                            style = TextStyle(
                                color = Color(0xff000000),
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight(700)
                            ),
                            modifier = Modifier
                                .padding(start = 8.dp)
                        )

                        OutlinedTextField(
                            value = username,
                            onValueChange = { username = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                .clipToBounds()
                                .height(60.dp)
                                .padding(top = 15.dp, end = 22.dp)
                                .border(
                                    width = 1.dp,
                                    brush = gradientBrush,
                                    shape = RoundedCornerShape(9.dp)
                                ),

                            colors = TextFieldDefaults.textFieldColors(
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                containerColor = Color.Unspecified


                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                imeAction = ImeAction.Done
                            ),
                            singleLine = true,
                            )
                    }

                    Column(
                        modifier = Modifier
                            .padding(top = 25.dp)
                    ) {
                        Text(
                            "Email Address",
                            style = TextStyle(
                                color = Color(0xff000000),
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight(700)
                            ),
                            modifier = Modifier
                                .padding(start = 8.dp)
                        )

                        OutlinedTextField(
                            value = emailAddress,
                            onValueChange = { emailAddress = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                .clipToBounds()
                                .height(60.dp)
                                .padding(top = 15.dp, end = 22.dp)
                                .border(
                                    width = 1.dp,
                                    brush = gradientBrush,
                                    shape = RoundedCornerShape(9.dp)
                                ),

                            colors = TextFieldDefaults.textFieldColors(
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                containerColor = Color.Unspecified


                            ),
                            singleLine = true,

                            )
                    }

                    Column(
                        modifier = Modifier
                            .padding(top = 25.dp)
                    ) {
                        Text(
                            "Password",
                            style = TextStyle(
                                color = Color(0xff000000),
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
                                .height(60.dp)
                                .padding(top = 15.dp, end = 22.dp)
                                .border(
                                    width = 1.dp,
                                    brush = gradientBrush,
                                    shape = RoundedCornerShape(9.dp)
                                ),

                            colors = TextFieldDefaults.textFieldColors(
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                containerColor = Color.Unspecified


                            ),
                            singleLine = true,
                            )
                    }

                    Column(
                        modifier = Modifier
                            .padding(top = 25.dp)
                    ) {
                        Text(
                            " Confirm Password",
                            style = TextStyle(
                                color = Color(0xff000000),
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight(700)
                            ),
                            modifier = Modifier
                                .padding(start = 8.dp)
                        )



                        OutlinedTextField(
                            value = cpass,
                            onValueChange = { cpass = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                .clipToBounds()
                                .height(60.dp)
                                .padding(top = 15.dp, end = 22.dp)
                                .border(
                                    width = 1.dp,
                                    brush = gradientBrush,
                                    shape = RoundedCornerShape(9.dp)
                                ),

                            colors = TextFieldDefaults.textFieldColors(
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                containerColor = Color.Unspecified


                            ),
                            singleLine = true,
                            )

                    }

                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffA219A5)
                    ),
                    shape = RoundedCornerShape(9.dp),
                    modifier = Modifier
                        .width(219.dp)
                        .padding(top = 40.dp)
                    //                    .height(36.dp)

                ) {

                    Text(
                        "Signup",
                        style = TextStyle(
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            fontStyle = FontStyle.Normal,
                            fontSize = 14.sp,
                            fontWeight = FontWeight(700)
                        )
                    )

                }
                Row {
                    Text(
                        "Already own an account?",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Normal
                        ),
                        modifier = Modifier
                            .padding(top = 12.dp)
                    )
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(
                            "Login",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                fontWeight = FontWeight(700),
                            )
                        )
                    }

                }

            }
        }
    }
}