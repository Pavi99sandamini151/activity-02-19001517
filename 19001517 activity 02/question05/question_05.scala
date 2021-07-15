object question05{
    def evenaddition(n:Int):Int = {
        if(n <= 0)
        {
             0;
        }
        else if(n % 2 == 0)
        {
             evenaddition(n-2)+ n;
        }
        else
        {
             evenaddition(n-1);
        }
    }
    def main(args:Array[String])
    {
        println("enter a number")
        val number = scala.io.StdIn.readInt()
        println(evenaddition(number))
    }
}