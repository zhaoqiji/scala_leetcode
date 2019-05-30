
object Solution {
  def reverse(x: Int): Int = {
    var a = 0    
    var res = 0l //定义长整型，64位整数
    var y = x
    while(y != 0){
      a = y%10 //取余数
      res = res*10 + a
      //判断是否溢出
      if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
        return 0
      }
      y = y/10 //和py一样，除法取整数
    }
    res.toInt //转成Int，32位整数
  }
}