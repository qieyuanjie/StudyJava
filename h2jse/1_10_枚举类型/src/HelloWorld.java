public class HelloWorld{
  public static void main(String[] args){
	  Season s = Season.SPRING;
	  switch (s) {
	  case SPRING:
          System.out.println("春天");
          break;
      case SUMMER:
          System.out.println("夏天");
          break;
      case AUTUMN:
          System.out.println("秋天");
          break;
      case WINTER:
          System.out.println("冬天");
          break;
	  }
	  //借助增强型for循环，可以很方便的遍历一个枚举都有哪些常量
	  //注：增强型for循环只能用来取值，却不能用来修改数组里的值
	  for (Season s1 : Season.values()) {
		            System.out.println(s1);
	  }
	
	  
  }
}