import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("hello!");
        } catch (IOException e) {
            System.out.println("何らかの例外が発生しました");
        }
        fw.close();
    }
}
