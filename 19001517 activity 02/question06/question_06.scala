object question06{
    def fibonacci(n:Int): Int ={
        if (n <= 1){
        return n;}
        return fibonacci(n-1) + fibonacci(n-2);
        
    }
    def main(args:Array[String])
    {
        println("enter a number")
        val number = scala.io.StdIn.readInt()
        println("fibonacci series is.....")
        for ( i <- 0 to number)
        {
            println(fibonacci(i))
        }
    }
}