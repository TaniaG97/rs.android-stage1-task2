package subtask2

class TimeConverter {

    val numberStrings: Map<Int, String> = mapOf(
        Pair(1, "one"),
        Pair(2, "two"),
        Pair(3, "three"),
        Pair(4, "four"),
        Pair(5, "five"),
        Pair(6, "six"),
        Pair(7, "seven"),
        Pair(8, "eight"),
        Pair(9, "nine"),
        Pair(10, "ten"),
        Pair(11, "eleven"),
        Pair(12, "twelve"),
        Pair(13, "thirteen"),
        Pair(14, "fourteen"),
        Pair(16, "sixteen"),
        Pair(17, "seventeen"),
        Pair(18, "eighteen"),
        Pair(19, "nineteen"),
        Pair(20, "twenty")
    )

    fun toTextFormat(hour: String, minute: String): String {
        val hourInt = hour.toInt()
        val minuteInt = minute.toInt()
        var outputStr: String

        outputStr = when (minuteInt) {
            0 -> "${numberStrings[hourInt]} o' clock"
            15 -> "quarter past ${numberStrings[hourInt]}"
            30 -> "half past ${numberStrings[hourInt]}"
            45 -> "quarter to ${numberStrings[hourInt+1]}"
            in 1..14, in 16..29 ->{
                if (minuteInt <= 20){
                    if (minuteInt==1){
                        "${numberStrings[minuteInt]} minute past ${numberStrings[hourInt]}"
                    }else{
                        "${numberStrings[minuteInt]} minutes past ${numberStrings[hourInt]}"
                    }
                }
                else {
                    "${numberStrings[20]} ${numberStrings[minuteInt-20]} minutes past ${numberStrings[hourInt]}"
                }
            }
            in 31..44, in 46..59 -> {
                val minToHour = 60-minuteInt
                if (minToHour <= 20){
                    if (minToHour==1){
                        "${numberStrings[minToHour]} minute to ${numberStrings[hourInt+1]}"
                    }else{
                        "${numberStrings[minToHour]} minutes to ${numberStrings[hourInt+1]}"
                    }
                }
                else {
                    "${numberStrings[20]} ${numberStrings[minToHour-20]} minutes to ${numberStrings[hourInt+1]}"
                }
            }
            else -> ""
        }

        return outputStr
    }
}
