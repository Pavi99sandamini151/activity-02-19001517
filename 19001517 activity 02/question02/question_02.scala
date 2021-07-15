object question02{
    def primeseq(y:Int , x:Int=2): Boolean = {
        if(x==y)
        {
         false
        }
        else
        {
            if(y%x == 0) true
            else primeseq(y,x+1)
        }
    }
    def main(args:Array[String])
    {
        println("enter a number")
        val number = scala.io.StdIn.readInt()
        var i = 0;
        println("prime numbers")
        for(i<- 2 until number)
        {
            if(primeseq(i,2) == false){
                println(i)}
        }
    }
}