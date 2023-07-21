

fun main( ) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}


fun isValidIdentifier(s: String): Boolean {

    var result:Boolean=false 
    
   if(s.isNotEmpty()  ){
  
        for ((index ,c) in s.withIndex()){
         result=false

            if(index ==0){

          val ch = s.elementAt(index)

         if( ch !in 'a'..'z' && ch !in 'A'..'Z' && ch != '_' ){
           
            break;
            }
          else{
          result=true
          }

        }
           else if( c in '0'..'9' || c in 'a'..'z' || c in 'A'..'Z'  ){
              result=true  
           }
           
   }  
}
   return result 
 
}