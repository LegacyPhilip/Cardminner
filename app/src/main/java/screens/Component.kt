package screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Composable


//
//Column(
//horizontalAlignment = Alignment.CenterHorizontally,
//modifier = Modifier
//.offset(17.dp)
//.background(Color(0xffF8F8F8), shape = RoundedCornerShape(6.dp))
//.width(229.dp)
//.height(173.dp)
//.border(1.dp, Color(0xffE9E9E9))
//.padding(10.dp)
//
//) {
//
//
//    Text(
//        "Active offer",
//        style = TextStyle(
//            color = Color(0xff02143E),
//            fontSize = 15.sp,
//            fontWeight = FontWeight(600),
//            fontStyle = FontStyle.Normal
//        ),
//        modifier = Modifier
//            .padding()
//            .offset(65.dp, 7.dp)
//    )
//
//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        modifier = Modifier
//            .fillMaxWidth()
//            .offset(y = 20.dp, x = 50.dp)
//    ) {
//        Text(
//            "$50",
//            style = TextStyle(
//                color = Color(0xff02143E),
//                fontSize = 35.sp,
//                fontWeight = FontWeight.Black,
//                fontStyle = FontStyle.Normal
//            )
//        )
//        Box(
//            contentAlignment = Alignment.Center,
//            modifier = Modifier
//                .padding(start = 10.dp)
//                .background(Color(0xffEC9108))
//                .width(80.dp)
//                .height(40.dp)
//        ) {
//            Text(
//                "Per day",
//                style = TextStyle(
//                    color = Color(0xff02143E),
//                    fontSize = 17.sp,
//                    fontStyle = FontStyle.Normal,
//                    fontWeight = FontWeight.Bold,
//                    textAlign = TextAlign.Center
//                )
//            )
//        }
//
//    }
//    Text(
//        "LEVRAGE PLAN",
//        style = TextStyle(
//            color = Color(0xff02143E),
//            fontSize = 21.sp,
//            fontWeight = FontWeight(600),
//            fontStyle = FontStyle.Normal,
//            textAlign = TextAlign.Center
//        ),
//        modifier = Modifier
//            .padding(top = 28.dp, start = 22.dp)
//    )
//
//    Text(
//        "30 active days",
//        style = TextStyle(
//            color = Color(0xff02143E),
//            fontSize = 16.sp,
//            fontWeight = FontWeight.ExtraLight,
//            fontStyle = FontStyle.Normal
//        ),
//        modifier = Modifier
//            .padding(top = 6.dp, start = 10.dp)
//    )
//
//}
//}
//Column (
//horizontalAlignment = Alignment.CenterHorizontally,
//modifier = Modifier
//.offset(17.dp, 10.dp)
//.background(Color(0xffF8F8F8), shape = RoundedCornerShape(6.dp))
//.width(229.dp)
//.height(170.dp)
//.border(1.dp, Color(0xffE9E9E9))
//.padding(10.dp)
//
//){
//
//
//    Text(
//        "Active offer",
//        style = TextStyle(
//            color = Color(0xff02143E),
//            fontSize = 15.sp,
//            fontWeight = FontWeight(600),
//            fontStyle = FontStyle.Normal
//        ),
//        modifier = Modifier
//            .padding()
//            .offset(65.dp, 7.dp)
//    )
//
//    Text(
//        "$75",
//        style = TextStyle(
//            color = Color(0xff02143E),
//            fontSize = 35.sp,
//            fontWeight = FontWeight.Black,
//            fontStyle = FontStyle.Normal
//        )
//    )
//    Text(
//        "Razer Gold",
//        style =  TextStyle(
//            color = Color(0xff02143E),
//            fontSize = 21.sp,
//            fontWeight = FontWeight(600),
//            fontStyle =  FontStyle.Normal,
//            textAlign = TextAlign.Center
//        ),
//        modifier = Modifier
//            .padding(top = 28.dp)
//    )
//
//
//
//}
//
//}