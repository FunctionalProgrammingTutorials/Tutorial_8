import scala.io.StdIn.readInt
object Q2{
    def main(args: Array[String]): Unit = {
        var x = readInt();
        println(patternMatching(x));
    }

    val patternMatching = (num:Int) => num match{
        case x if (num < 0 || num == 0) => "Negative/Zero."
        case x if (num % 2 == 0) => "Even Number."
        case x if (num % 2 != 0) => "Odd Number." 
    }
}