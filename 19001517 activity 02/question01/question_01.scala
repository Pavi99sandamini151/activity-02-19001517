object question01{
    def prime(n:Int): Boolean = {
        if(n <= 1) {
            false
        }
        else if(n == 2){
            true
        }
        else
        {
            !(2 until n).exists( i => n % i ==0)
        }
    }
    

    def main(args:Array[String])
    {
        println("enter a number")
        val number = scala.io.StdIn.readInt()
        println(prime(number))
    }
}