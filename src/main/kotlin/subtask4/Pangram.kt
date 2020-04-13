package subtask4

class Pangram {
    val vowels = "aeiouy"
    val consonants = "qwrtpsdfghjklzxcvbnm"

    fun getResult(inputString: String): String {
        var words : MutableList<String> = inputString.replace('\n', ' ').split(' ').filter { it.isNotEmpty() }.toMutableList()
        val isPangram = inputString.toLowerCase().filter { it in 'a'..'z'}.chars().distinct().count().toInt() ==  26

        if (isPangram){
            for (wordIndex in words.indices){
                var counter=0
                var newString=""
                for (char in words[wordIndex]) {
                    if (vowels.contains(char, true)) {
                         counter++
                         newString+= char.toUpperCase()
                    }else{
                         newString+= char
                    }
                }
                words[wordIndex] = "${counter}${newString}"
            }

            words.sortBy { char->char[0].toInt() }
            return words.joinToString(" ")
        }else{
            for (wordIndex in words.indices){
                var counter=0
                var newString=""
                for (char in words[wordIndex]) {
                    if (consonants.contains(char, true)) {
                        counter++
                        newString+= char.toUpperCase()
                    }else{
                        newString+= char
                    }
                }
                words[wordIndex] = "${counter}${newString}"
            }

            words.sortBy { char->char[0].toInt() }
            return words.joinToString(" ")
        }
    }
}
