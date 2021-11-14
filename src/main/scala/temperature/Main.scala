package temperature

import org.jsoup.Jsoup


object Main extends App {

  // whole path https://www.seatemperature.org/europe/denmark/copenhagen.htm

  val doc2 = Jsoup.connect("https://www.seatemperature.org/europe/denmark/copenhagen.htm").get()

  val temp = doc2.select("div#sea-temperature")

  val divStr = temp.text()

  val indexOfSlash = divStr.lastIndexOf("/")
  val temperature = divStr.substring(0, indexOfSlash)

  print(temperature)

}