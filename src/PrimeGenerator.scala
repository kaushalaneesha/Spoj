/**
  * Created by akaushal on 2/8/2016.
  * http://www.spoj.com/problems/PRIME1/
  */
import scala.io.StdIn._;
object PrimeGenerator extends App{
//  def isPrime(num : Long) : Boolean = {
//    if(num==1) return false
//    for(i <- 2 to Math.sqrt(num).toInt){
//        if(num%i == 0)
//          return false
//    }
//    return true
//  }
//
  val comp = new Array[Byte](1000000000+1)
  for(j<- 1 to readInt()){
    val nums = readLine().split(" ").map(_.toInt)
    setComp(nums(1), comp)
    for(i<-nums(0) to nums(1)){
       if(comp(i)==0)
         println(i)
    }
    println()
  }

  def setComp(upperbound : Int, comp : Array[Byte]) ={
    for(m<-2 to Math.sqrt(upperbound).toInt){
      if(comp(m)==0){
        for(k<- m*m to upperbound by m){
            comp(k) = 1
        }
      }
    }
  }
}
