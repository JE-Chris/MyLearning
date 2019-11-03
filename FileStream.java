import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileStream {
    public static void main(String []args) {
        ReadListFromFile();
    }

    private static void ReadListFromFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the File's Absolute Path:");
        String path = sc.nextLine();

        File f = new File(path);
        if (!f.exists()) {

            Opreate();
        }

        System.out.println("The Path of this file is " + f.getAbsolutePath());

        List<String> listStr = new ArrayList<String>();
        BufferedReader br = null;
        String str = null;

        try {
            br = new BufferedReader(new FileReader(f));
            while ((str = br.readLine()) != null) {
                listStr.add(str);
            }
        } catch (FileNotFoundException event) {
            event.printStackTrace();
        } catch (IOException event) {
            event.printStackTrace();
        }

        System.out.println(listStr);
        Opreate();
    }

    private static void WriteListToFile(List<String> listStr) {
        File f = new File("E:\\Test\\WordsInner.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
                System.out.println("File "+f.getAbsolutePath()+" isn't exit, and it's be created for you.");
            } catch (IOException event) {
                System.out.println("Creating File Exception!");
                event.printStackTrace();
            }

            for (String str : listStr) {
                FileOutputStream fos = null;
                PrintStream ps = null;
                try {
                    fos = new FileOutputStream(f, true);
                    ps = new PrintStream(fos);
                } catch (FileNotFoundException event) {
                    event.printStackTrace();
                }

                String string = str + "\r\n";
                ps.print(string);
                ps.close();
            }

            System.out.println("File written successfully.");
        }
    }


    private static void Opreate() {
        System.out.println("Input the words you want to save in another file.");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        List<String> str2 = new ArrayList<String>();
        str2.add(str1);
        WriteListToFile(str2);
    }
}