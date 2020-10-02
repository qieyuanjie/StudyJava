public class eg003 {
    public static void main(String[] args) {
        //打印单数    
    	int i = 1;//i用于计数
        for (int j = 0; j < 10; j++) {//j用于判定是否为单数   	
           if(0==j%2) continue; //如果是双数，继续下一次循环
           else {
               	System.out.println(i+":"+j);
               	i++;
           }
                
        }
    }
}