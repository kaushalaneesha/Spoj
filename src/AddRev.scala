/**
  * Created by akaushal on 2/8/2016.
  * http://www.spoj.com/problems/ADDREV/
  */
import scala.io.StdIn._;
object AddRev extends App{
  for(i<- 1 to readInt()){
    val nos = readLine().reverse.split(" ").map(_.toInt)
    val res = (nos(0) + nos(1)).toString.reverse.replaceFirst("^0+(?!$)","")
    println(res)
  }
}
