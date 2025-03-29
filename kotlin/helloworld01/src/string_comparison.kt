fun main(args: Array<String>) {

    val s1 = "Bee"
    val s2 = "Bee"
    val s3 = "bee"

    val result1 = if (s1.compareTo(s2) == 0) "equal" else "not equal"

    println("String s1 and s2 are $result1") // prints String s1 and s2 are equal

    val result2 = if (s1.compareTo(s3) == 0) "equal" else "not equal"
    println("String s1 and s3 are $result2") // prints String s1 and s3 are not equal
    println("String s1 and s3 are ${s1==s2}")

    var result3 = "abcd".plus("efgh")
    println(result3) // prints abcdefgh

    val text1 = "Kotlin"
    val firstChar = text1.first() // 'K'
    val lastChar = text1.last() // 'n'

    val text2 = "java,kotlin,android"
    val fruits = text2.split(",") // ["java", "kotlin", "android"]

    val text3 = "Hello, Kotlin"
    val containsKotlin = text3.contains("Kotlin") // true
    val startsWithHello = text3.startsWith("Hello") // true
    val endsWithKotlin = text3.endsWith("Kotlin") // true

    val text4 = "I like Java"
    val updatedText = text4.replace("Java", "Kotlin")

    val str1 = "Kotlin"
    val str2 = "kotlin"

    val contentEqual = (str1 == str2) // true, case-insensitive comparison

    println(contentEqual)
    println(str1.equals(str2, true)) // true, case-insensitive comparison

    val str3 = str1

    val referenceEqual = (str1 === str3) // true

    println(referenceEqual)
}
