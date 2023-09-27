package demo_file;

import java.io.*;

public class CreateFileDemo {
    public static void main(String[] args) throws Exception {
        try {
            // create file
            File file = new File("D:\\FA\\J2SE_FA\\FA\\src\\demo_file\\filetest.txt");
            boolean fvar = file.createNewFile();
            if(fvar){
                System.out.println("File has been created sucessfully");
            }else{
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
        // write file
        FileOutputStream fos = null;
        File file2;
        String mycontent = "This is my Data which needs"+ " to be written into the file";
        try{
            file2 = new File("D:\\FA\\J2SE_FA\\FA\\src\\demo_file\\filetest.txt");
            fos = new FileOutputStream(file2);
            byte[] bytesArray = mycontent.getBytes();
            fos.write(bytesArray);
            fos.flush();
            System.out.println("File written successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                if(fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // ghi nối thêm file bằng fileWriter và BuferedWriter
//        try{
//            String content = "This is my content which would be appended"+ " at the end of the specified file";
//            File file3 = new File("D:\\FA\\J2SE_FA\\FA\\src\\demo_file\\filetest.txt");
//            if(!file3.exists()){
//                file3.createNewFile();
//            }
//            FileWriter fw = new FileWriter(file3, true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(content);
//            bw.close();
//            System.out.println("Data successfully appended at the end of file");
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // nối file bằng PrintWrite
            try {
                File file4 = new File("D:\\FA\\J2SE_FA\\FA\\src\\demo_file\\filetest.txt");
                if(!file4.exists()){
                    file4.createNewFile();
                }
                FileWriter fw1 =  new FileWriter(file4, true);
                BufferedWriter bw = new BufferedWriter(fw1);
                PrintWriter pw = new PrintWriter(bw);
                pw.println("");
                pw.println("This is first line");
                pw.println("This is the second line");
                pw.println("This is third line");
                pw.close();
                System.out.println("Data successfully appended at the end of file");


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        //read file

        File file1 = new File("D:\\FA\\J2SE_FA\\FA\\src\\demo_file\\filetest.txt");
        BufferedInputStream bis = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file1);
            bis = new BufferedInputStream(fis);
            while (bis.available()>0){
                System.out.print((char) bis.read());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                if(bis != null && fis != null){
                    fis.close();
                    bis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // delete file
        try {
            File file5 = new File("D:\\FA\\J2SE_FA\\FA\\src\\demo_file\\filetest.txt");
            if(file5.delete()){
                System.out.println(file5.getName() + " is deleted!");
            }else{
                System.out.println("Delete failed: File didn't delete");
            }

        }catch (Exception e){
            throw new Exception(e);
        }
    }
}
