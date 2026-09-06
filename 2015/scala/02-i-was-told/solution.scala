import scala.io.Source

def calculateLine(line: String): Int = {
    val numbersString: Array[String] = line.split('x')
    val numbers: Array[Int] = for s <- numbersString yield s.toInt
    val numbersMultiplied: Array[Int] = Array(numbers(0) * numbers(1), numbers(1) * numbers(2), numbers(0) * numbers(2))

    var lowest: Int = Int.MaxValue 
    for num <- numbersMultiplied do {
        println(num)
        if num < lowest then lowest = num
    }

    var sum = 2 * (numbersMultiplied(0) + numbersMultiplied(1) + numbersMultiplied(2)) + lowest

    return sum
}

def solA(lines: Iterator[String]): Int = {
    var sum: Int = 0
    for line <- lines do {
        sum += calculateLine(line)
    }

    return sum
}

// def solB(line: String): Int = {

// }

@main def entry(): Unit = {
    var filename = "input.txt"
    // var filename = "test1.txt"

    val lines: Iterator[String] = Source.fromFile(filename).getLines()

    println("Solution A: " + solA(lines))
    // println("Solution B: " + solB(line))
}