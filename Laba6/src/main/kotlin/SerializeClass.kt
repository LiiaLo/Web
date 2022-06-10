import kotlinx.serialization.json.*
import java.net.HttpURLConnection
import java.net.URL

@kotlinx.serialization.Serializable
data class AgifyMan(
    val name: String = "",
    val age: Int = 0,
    val count: Int = 0
)

fun parse(): AgifyMan{
    var person = AgifyMan()
    try {
        val url = URL("https://api.agify.io?name=dasha")
        val con: HttpURLConnection = url.openConnection() as HttpURLConnection
        con.connectTimeout = 5000
        con.readTimeout = 5000
        val reader = con.inputStream.reader()
        var json = reader.readText()
        reader.close()
        con.disconnect()
        var encode: JsonElement = Json.parseToJsonElement(json)
        person = Json.decodeFromJsonElement(encode,)
    } catch (e: Exception){
        e.printStackTrace()
    }
    return person
}