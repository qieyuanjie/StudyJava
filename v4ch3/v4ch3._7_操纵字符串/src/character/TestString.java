/*
 * 
 * charAt	获取字符	
toCharArray	获取对应的字符数组	
subString	截取子字符串	
split	分隔	
trim	去掉首尾空格	

toLowerCase
toUpperCase	大小写	

indexOf
lastIndexOf
contains	定位	


replaceAll
replaceFirst	替换
 * */
package character;

public class TestString {

    public static void main(String[] args) {

//        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
//        //charAt(int index)获取指定位置的字符
//        char c = sentence.charAt(0);
//        System.out.println(c);
//
//        char c1 = sentence.charAt(1);
//        System.out.println(c1);
//        //toCharArray()
//        //获取对应的字符数组
//        char[] cs = sentence.toCharArray();
//        System.out.println(sentence.length() == cs.length);
//        System.out.println(cs);
//
//        //subString
//        //截取子字符串
//        //截取从第3个开始的字符串 （基0）
//        String subString1 = sentence.substring(3);
//        System.out.println(subString1);
//
//        //截取从第3个开始的字符串 （基0）
//        //到5-1的位置的字符串
//        //左闭右开,即从第三个字符开始，截取第三第四字符
//        String subString2 = sentence.substring(3,5);
//        System.out.println(subString2);
//
////      split
////      根据分隔符进行分隔
//        //根据“，”符号进行分割，得到三个子字符串
//        String subSentences[] = sentence.split(",");
//        for(String sub : subSentences){
//            System.out.println(sub);
//            //会自动输出换行符
////            System.out.format("\n");
//
//        }
////        trim
////        去掉首尾空格
//        sentence = "            盖伦,在进行了连续8次击杀后,获得了 超神 的称号             ";
//        System.out.println(sentence);
////        去掉首尾空格
//        System.out.println(sentence.trim());
//
////        toLowerCase 全部变成小写
////        toUpperCase 全部变成大写
//        String Hero = "Garen";
//        //全部变成小写
//        System.out.println(Hero.toLowerCase());
//        //全部变成大写
//        System.out.println(Hero.toUpperCase());
//
//
////        indexOf 判断字符或者子字符串出现的位置
////        contains 是否包含子字符串
//        sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
//        System.out.println(sentence.indexOf('8'));//字符第一次出现的位置
//        System.out.println(sentence.indexOf("超神")); //字符串第一次出现的位置
//        System.out.println(sentence.lastIndexOf("了"));//字符串最后出现的位置
//        System.out.println(sentence.indexOf(',',5));//从位置5开始，出现的第一次,的位置,忽略下标为2的","
//        System.out.println(sentence.contains("击杀"));//是否包含字符串"击杀"
//
//        //replaceAll 替换所有的
//        //replaceFirst 只替换第一个
//        String temp = sentence.replaceAll("击杀","被杀");//替换所有的
//        temp = temp.replaceAll("超神","超鬼");
//        System.out.println(temp);
//        temp = sentence.replaceFirst(",","");//只替换第一个
//        System.out.println(temp);
//
        //给出一句英文句子： "let there be light"
        //得到一个新的字符串，每个单词的首字母都转换为大写
//        String str = "let there be light";
//        System.out.println(str);
//        //将字符串分为三个子串
//        String subStr[] = str.split(" ");
//        for(int i = 0; i < subStr.length;i++){
//            //从第一个子字符串"let"开始处理
//            String word = subStr[i];
//            char upperCaseFirstWord = Character.toUpperCase(word.charAt(0));//将第一个字符转变为大写
//            String rest = word.substring(1); //截取子字符串,基0,rest="et","there","e","ight"
//            String mergeWord = upperCaseFirstWord  + rest;//合并子字符串 mergeWord ="L"+"et"
//            subStr[i] = mergeWord;//让处理后的字符串赋值给subStr1[i]
//        }
//        String result = "";
//        //合并三个子字符串操作 "Let" + " " + "There" + " " +...
//        for(String word:subStr){
//            result += word + " ";
//        }
//        result = result.trim();//去除首尾空格 这里去除的是尾部
//        System.out.println(result);
//
//
        //英文绕口令
        //peter piper picked a peck of pickled peppers
        //统计这段绕口令有多少个以p开头的单词
//        String str = "peter piper picked a peck of pickled peppers";
//        int num = 0;
//        for(int i=0;i<str.length();i++){
//            char temp = str.charAt(i);
//            if(temp == 'p')num++;
//        }
//        System.out.println(num);


        //把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
//        String str = "lengendary";
        //法1
//        result = "";
//        for(int i = 0;i<str3.length();i+=2){
//            char upperCaseWord = Character.toUpperCase(str3.charAt(i));//大写字母
//            char rest1 = str3.charAt(i+1);//小写字母
//            result += String.valueOf(new char[]{upperCaseWord,rest1} );
//            System.out.println(result);
//        }
        //法2
//        char[] cs = str.toCharArray();
//        for(int i = 0;i < cs.length;i++){
//            if(i%2==0){
//                cs[i] = Character.toUpperCase(cs[i]);
//            }
//        }
//        String result = new String(cs);
//        System.out.println(result);

        //把 lengendary 最后一个字母变大写
//        String str = "lengendary";
//        int a1 = str.length() - 1;
//        String upperCaseEndWord = str.substring(a1).toUpperCase();
//        String rest2 = str.substring(0,a1);
//        String result = rest2 + upperCaseEndWord;
//        System.out.println(result);

//        Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak
//        把最后一个two单词首字母大写
        String str = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int a = str.lastIndexOf("two");
        String s0 = str.substring(0, a);
        String s1 = str.substring(a).replaceFirst("t", "T");
        String result = s0 + s1;
        System.out.println(result);


    }

}
