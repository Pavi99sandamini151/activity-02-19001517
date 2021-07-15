object question04{
    def oddoreven(n:Int): Boolean = n match
    {
        case 0 => true
        case n => ((n%10) %2 ==0) && oddoreven(n/10)
    }

    def main(args:Array[String])
    {
        println("enter a number")
        val number = scala.io.StdIn.readInt()
        val result= oddoreven(number)
        if(result== true)
            println("this entered number is even number")
        else
            println("this entered number is odd number")
    }
}