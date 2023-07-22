
  fun main() {
    displaySeperator(character='@')
}

fun displaySeperator(character:Char='*', size:Int =10){
    repeat(size) { 
        println(character)
     }
}