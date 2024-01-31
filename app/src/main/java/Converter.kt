////import java.util.Scanner
////
////fun pxToDp(pixels: Float, density: Float): Float {
////    return pixels / density
////}
////
////fun main() {
////    val scanner = Scanner(System.`in`)
////
////    println("Enter pixel value:")
////    val pixels = scanner.nextFloat()
////
////    println("Enter screen density (default is 1.0):")
////    val density = scanner.nextFloat()
////
////    // Use default density of 1.0 if not provided
////    val result = pxToDp(pixels, if (density > 0) density else 1.0f)
////
////    println("$pixels pixels is equal to $result dp")
////}
//
//
//
//import android.content.Context
//import android.util.DisplayMetrics
//import android.view.WindowManager
//
//fun pixelsToDp(context: Context, pixels: Float): Float {
//    val density = context.resources.displayMetrics.density
//    return pixels / density
//}
//
//fun main() {
//    // Obtain a context, e.g., from an Activity or ApplicationContext
//    val context = 134// Your context here
//
//    // Sample pixel value
//    val pixelValue = 100f
//
//    // Calculate density and convert pixels to dp
//    val dpValue = pixelsToDp(context, pixelValue)
//
//    println("$pixelValue pixels is equal to $dpValue dp")
//}
