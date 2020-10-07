public class eg005 {

    public static void main(String[] args) {
        for (int a = -100; a < 100; a++) {

            int b = 8 - a;
            int c = 14 - a;
            int d = 10 - b;
            if (d == c - 6) {
                System.out.println("-----鍖洪棿[-100,100)涔嬮棿鐨勶紝婊¤冻姝ゅ洓鍏冧竴娆℃柟绋嬪紡鐨勮В鏈夛細" + a + "--" + b + "--" + c + "--" + d + "----");
            }
        }
    }
}