import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello Jupiterian");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println(br.readLine());
    }
}
