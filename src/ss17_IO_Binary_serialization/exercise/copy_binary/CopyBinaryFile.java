package ss17_IO_Binary_serialization.exercise.copy_binary;

import ss17_IO_Binary_serialization.exercise.product_to_binary_file.Product;

import java.io.*;
import java.util.List;

public class CopyBinaryFile {

    public static void writeProduct(String pathFile, List<Product> list) {
    File file = new File(pathFile);
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
        try {
        fos = new FileOutputStream(file);
        oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

    public static Object readProduct(String pathFile) {
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Object object = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            object = objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return object;
    }
}
