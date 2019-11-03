import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitOperation {
    public static void main(String args[]) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2 = "";
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str1 = br.readLine();
            if (str1.equalsIgnoreCase("end"))
                break;

            str2 += str1;
            str2 += "\n";

            System.out.println(str2);
        } while (true);

        System.out.println(str2);
    }
}















