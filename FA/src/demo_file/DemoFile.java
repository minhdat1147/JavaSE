package demo_file;

import java.io.*;
import java.util.Scanner;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("file.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);
        System.out.println("Enter text (@ at the end):");
        char ch;
        while ((ch = (char) dis.read()) != '@') {
            bout.write(ch);
        }

        //đọc file
//        FileInputStream file3 = new FileInputStream("file.txt");
//        System.out.println("Enter text add (@ at the end):");
//        int i =1;
//        String line;
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        try {
//            FileWriter fw = new FileWriter(String.valueOf(file3), true);
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            for (int j = 0; j < n; j++) {
//                System.out.println("Enter line " + i);
//                line = scanner.nextLine();
//                bw.write(i+" "+line);
//            }
//            bw.close();
//            bout.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        //out
        try (FileInputStream fin = new FileInputStream("file.txt");
             BufferedInputStream bfin = new BufferedInputStream(fin);) {
            int data;
            while ((data = bfin.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException exception) {
            System.err.println("File not found!");
        } catch (IOException exception) {
            System.err.println("Cannot read from file!");
        }

    }
}
