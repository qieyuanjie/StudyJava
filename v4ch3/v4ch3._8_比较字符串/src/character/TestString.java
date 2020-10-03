package character;

public class TestString {
    public static void main(String[] args){
//        String str1 = "the light";
//        String str2 = "the light";
//        String str3 = new String(str1);
//        //==用于判断是否是同一个字符串对象
//        //str1和str3的内容一定是一样的！
//        //但是，并不是同一个字符串对象
//        //一般说来，编译器每碰到一个字符串的字面值，就会创建一个新的对象
//        //str1创建了一个新的字符串"the light"
//        //但是在创建str2时，编译器发现已经存在现成的"the light"，那么就直接拿来使用，而没有进行重复创建
//        //故str1=str2
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str2 == str3);

        //使用equals进行字符串内容的比较，必须大小写一致
        //equalsIgnoreCase，忽略大小写判断内容是否一致
//        String str1 = "the light";
//        String str2 = new String(str1);
//        String str3 = str1.toUpperCase();
//
//        //==用于判断是否是同一个字符串对象
//        System.out.println( str1  ==  str2);//不是同一个字符串对象，返回false
//        System.out.println(str1.equals(str2));//完全一样返回true
//
//        System.out.println(str1.equals(str3));//大小写不一样，返回false
//        System.out.println(str1.equalsIgnoreCase(str3));//忽略大小写的比较，返回true


        //startsWith //以...开始
        //endsWith //以...结束
//        String str1 = "the light";
//        String start = "the";
//        String end = "Ight";
//
//        System.out.println(str1.startsWith(start));//以...开始,返回true
//        System.out.println(str1.endsWith(end));//以...结束，返回false
//
        //创建一个长度是100的字符串数组
        //使用长度是2的随机字符填充该字符串数组
        //统计这个字符串数组里重复的字符串有多少种
        int num = 0;
//        TestString TS1 = new TestString();
        String[] str = new String[100];
        for(int i = 0;i < str.length;i++){
            str[i] = TestString.getRandomString(2);
            System.out.print(str[i] + " ");
            if((i+1)!=1&&(i+1)%10==0)System.out.println();
        }
        System.out.println("重复的字符串是:");
        for(int i = 0;i < str.length - 1;i++){
            for(int j = i+1;j < str.length;j++){
                if(str[i].equals(str[j])){
                    num++;
                    System.out.println(str[i] + " ");
                    break;
                }

            }


        }
        System.out.println();
        System.out.println("共有" + num + "个");

    }
    public static String getRandomString(int N){
        //1.先打随机数表
        StringBuilder pool = new StringBuilder();
        for(char i = 'a';i <= 'z';i++){
            pool.append(i);
        }
        for(char i = '1';i <= '9';i++){
            pool.append(i);
        }
        for(char i = 'A';i <= 'Z';i++){
            pool.append(i);
        }
        //打表完成，开始随机

        char[] cs = new char[N];
        for(int i = 0;i < cs.length;i++){
            int index = (int)(Math.random()*pool.length());
            cs[i] = pool.charAt(index);
        }
//        String result = new String(cs);
        return new String(cs);

    }
}
