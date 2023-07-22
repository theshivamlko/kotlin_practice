fun main() {

    var list: List<Int> = listOf(2, 3, 4, 5, 7, 8)

    var list3: List<Int> = listOf(10..20).flatten()

    var map = mapOf(1 to "Google", 2 to "Amazon", 3 to "Microsoft")

    var list2: List<Int> = list.filter({ e -> e % 2 == 0 })

    println(list)
    println(list2)

    list2 = list.map({ e -> e * e })
    var list4: List<Int> = listOf(2, 3)


    println(list2)

    println(list.any({ e -> e % 1 == 0 }))

    println(list.groupBy({
        when {
            it % 2 == 0 -> "EVEN"
            it % 2 != 0 -> "ODD"
            else -> "NA"
        }

    }))

    println(list.partition({ it % 4 == 0 }))

    println(list.associateBy({
        when {
            it % 2 == 0 -> "EVEN"
            it % 2 != 0 -> "ODD"
            else -> "NA"
        }
    }, { it * 2 }))

    println(list.associateBy({ it }, { it }))
    println(list.associate({ Pair(it, it) }))

    println(list.zip(list3))

    println(list.zipWithNext())

    println(listOf(list, list2, list3).flatten())
    println("FlatMap")
    println(list4.flatMap { map.toList() })

    println(list.first{it%2==0})

    val heroes = listOf(
        Pair("The Captain", 60),
        Pair("Frenchy", 42, ),
        Pair("The Kid", 9, ),
        Pair("Sir Stephen", 29, ),
        Pair("First Mate", 29, ),
        Pair("Sir Stephen", 37, ))

    println( heroes.map { it.first }.distinct())



}