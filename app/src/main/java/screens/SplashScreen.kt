package screens//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.angle.R
//import kotlinx.coroutines.delay
//
//@Composable
//fun SlasphScreen(
//    onTimeout: () -> Unit
//) {
//    // Simulate a delay to show the splash screen
//    LaunchedEffect(Unit) {
//        // Simulate a delay, replace with your actual initialization logic
//        delay(2000)
//        onTimeout()
//    }
//
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Blue), // Replace with your desired background color
////        contentAlignment = Alignment.Center
//    ) {
//        // Add your splash screen content here
////        Company Logo
//        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Company Logo")
//
////        Company Catch Phrase
//        Text(
//            "Life made easy",
//            style = TextStyle(
//                color = Color.Black,
//                fontWeight = FontWeight.Normal,
//                fontSize = 13.sp
//
//            )
//
//        )
//
//    }
//}
