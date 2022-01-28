import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main(args: Array<String>) {

    //only bellow line is written by me
    //create a http request to check is it raining in Ankara Turkey
    val url = "http://api.openweathermap.org/data/2.5/weather?q=Ankara,tr&appid=b6907d289e10d714a6e88b30761fae22"
    //make a http request
    val request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .GET()
            .build()

    //send the request
    val response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString())

    //print the response
    println(response.body())
}