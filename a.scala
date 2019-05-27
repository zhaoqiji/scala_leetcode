
import scala.collection.mutable.Map
//导入可变Map方法，默认为不可变的Map

//object 实例对象
object Solution {
    //定义twoSum方法，参数 nums 定义为int的列表，target 为int 返回int列表，= 后面为函数体
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
      //定义一个不可变量r_Map 但是其实他是会变的，因为它所指向的Map会变
        val r_Map = Map[Int,Int]()
        // 0 到 数组长度，until 为开，to 为闭
        for(x <- 0 until nums.length){
          //contains方法判断是否包含某个key，包含为True,不包含为False
          /*
           if(条件){
           }else{
           }
           */
            if(r_Map.contains(nums(x))){
                return Array(r_Map(nums(x)),x)
            }else{
                val t = target - nums(x)
                r_Map += ( t -> x)
            }
    }   //这与python不一样的地方在于方法必须要有一个返回（python默认返回None）
        return Array(0,0)
    }
}