fun main( ) {
    val s1: String? = null
    val s2: String? = ""
   
    
    s1?.isEmptyOrNull()?:false eq true
    s2?.isEmptyOrNull()?:false eq true

    val s3 = "   "
    s3.isEmptyOrNull()  eq false
}

fun String.isEmptyOrNull():Boolean {
        
    return  this.isEmpty() || this.trim().length == 0
}

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}