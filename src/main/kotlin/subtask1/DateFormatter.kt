package subtask1

import java.lang.Exception
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    val ERROR_MESSAGE="Такого дня не существует"

    fun toTextDay(day: String, month: String, year: String): String {
        var outputStr: String
        try {
            var date = LocalDate.of(year.toInt(),month.toInt(),day.toInt())
            outputStr = date.format(DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru")))
        } catch (e: Exception){
            outputStr = ERROR_MESSAGE
        }

        return  outputStr
    }
}
