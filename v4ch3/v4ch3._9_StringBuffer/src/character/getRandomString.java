package character;

public class getRandomString {


    public static String getRandomString(int N) {
        //1.先打随机数表
        StringBuilder pool = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            pool.append(i);
        }
        for (char i = '1'; i <= '9'; i++) {
            pool.append(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            pool.append(i);
        }
        //打表完成，开始随机

        char[] cs = new char[N];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
//        String result = new String(cs);
        return new String(cs);

    }
}
