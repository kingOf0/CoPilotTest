import okhttp3.Request

fun main() {

    //make a http reques to get 1 bitcoin in usd ( Didn't got nice results :( )
    val url = "https://api.coindesk.com/v1/bpi/currentprice.json"
    val request = Request.Builder().url(url).build()
    val response = okhttp3.OkHttpClient().newCall(request).execute()
    val jsonData = response.body?.string()
    println(jsonData)

}