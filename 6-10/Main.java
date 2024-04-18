public class Main {
    public static void main(String[] args) {
        int[] heights = { 172, 149, 152, 191, 155 };
        java.util.Arrays.sort(heights);//APIとして準備されている並べ替え命令
        for (int h : heights) {//拡張for文
            System.out.println(h);
        }
    }
}