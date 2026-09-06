import scala.io.Source

def solA(line: String): Int = {
    var count: Int = 0

    for c <- line do {
        if c == '(' then {
            count += 1
        }
        else if c == ')' then {
            count -= 1
        }
        else {
            println("SOMETHING WENT HORRIBLY WRONG")
        }
    } 

    return count
}

def solB(line: String): Int = {
    var pos: Int = 1

    return pos
}

@main def entry(): Unit = {
    var filename = "input.txt"

    val lines: Iterator[String] = Source.fromFile(filename).getLines()
    val line = lines.next()

    println("Solution A: " + solA(line))
    println("Solution B: " + solB(line))
}