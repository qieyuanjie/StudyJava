public class eg004 {
    public static void main(String[] args) {
        boolean breakout = false; //是否终止外部循环的标记
        for (int i = 0; i < 10; i++) {
        	
            for (int j = 1; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (0 == j % 2) {
                    breakout = true; //终止外部循环的标记设置为true
                    break;
                }
            }
            
            if (breakout) //判断是否终止外部循环
            	//每次内部循环结束后，都要在外部循环中判断，这个变量的值
                break;
        }
 
    }
}