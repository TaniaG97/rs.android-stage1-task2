package subtask3

import sun.java2d.loops.Blit

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val aList = a.toUpperCase().toMutableList()
        val bList = b.toUpperCase().toMutableList()
        var counter:Int=0

        for (char in aList){
            if (counter<bList.count() && char==bList[counter]){counter++}
        }

        return if (counter==bList.count()){
            "YES"
        }else{
            "NO"
        }
    }
}
