object question03{
    
    def addition(n:Int):Int =
    {
        if (n==1) 1
        else ( n+addition(n-1))
    }

    def main(args:Array[String])
    {
        println("enter a number")
        val number = scala.io.StdIn.readInt()
        println( "the total of all numbers to a given number is " + (addition(number)))
    }
}