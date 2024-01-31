//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.*
//
//import androidx.compose.material3.*
//
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MyApp()
//        }
//    }
//}
//
//@Composable
//fun MyApp() {
//    Surface(
//        color = MaterialTheme.colorScheme.background
//    ) {
//        BottomNavigationExample()
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun BottomNavigationExample() {
//    var selectedTab by remember { mutableStateOf(0) }
//
//    Scaffold(
//        bottomBar = {
//            BottomNavigation(
//                modifier = Modifier.background(MaterialTheme.colorScheme.background),
//                backgroundColor = MaterialTheme.colorScheme.surface
//            ) {
//                BottomNavigationItem(
//                    selected = selectedTab == 0,
//                    onClick = { selectedTab = 0 },
//                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = null) },
//                    label = { Text("Dashboard") }
//                )
//
//                BottomNavigationItem(
//                    selected = selectedTab == 1,
//                    onClick = { selectedTab = 1 },
//                    icon = { Icon(imageVector = Icons.Default.CardGiftcard, contentDescription = null) },
//                    label = { Text("Offer") }
//                )
//
//                BottomNavigationItem(
//                    selected = selectedTab == 2,
//                    onClick = { selectedTab = 2 },
//                    icon = { Icon(imageVector = Icons.Default.AccountBalance, contentDescription = null) },
//                    label = { Text("Transaction") }
//                )
//
//                BottomNavigationItem(
//                    selected = selectedTab == 3,
//                    onClick = { selectedTab = 3 },
//                    icon = { Icon(imageVector = Icons.Default.MoneyOff, contentDescription = null) },
//                    label = { Text("Withdraw") }
//                )
//
//                BottomNavigationItem(
//                    selected = selectedTab == 4,
//                    onClick = { selectedTab = 4 },
//                    icon = { Icon(imageVector = Icons.Default.AttachMoney, contentDescription = null) },
//                    label = { Text("Deposit") }
//                )
//
//                BottomNavigationItem(
//                    selected = selectedTab == 5,
//                    onClick = { selectedTab = 5 },
//                    icon = { Icon(imageVector = Icons.Default.ExitToApp, contentDescription = null) },
//                    label = { Text("Logout") }
//                )
//            }
//        }
//    ) {
//        // Content of your app goes here
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewBottomNavigationExample() {
//    BottomNavigationExample()
//}
