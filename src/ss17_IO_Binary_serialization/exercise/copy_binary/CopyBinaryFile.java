package ss17_IO_Binary_serialization.exercise.copy_binary;

import ss17_IO_Binary_serialization.exercise.product_to_binary_file.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyBinaryFile {

    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("src\\ss17_IO_Binary_serialization\\exercise\\copy_binary\\source.txt"));
            outStream = new FileOutputStream(new File("src\\ss17_IO_Binary_serialization\\exercise\\copy_binary\\target.txt"));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
