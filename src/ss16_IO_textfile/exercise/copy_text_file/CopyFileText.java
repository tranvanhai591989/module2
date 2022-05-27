package ss16_IO_textfile.exercise.copy_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static void main(String[] args) {
        List<String> arr2 = read("src\\ss16_IO_textfile\\exercise\\copy_text_file\\sourceFile.txt");
        String copy = "";
        for (String item : arr2) {
            System.out.println(item);
            copy += item + "\n";
        }

        write("src\\ss16_IO_textfile\\exercise\\copy_text_file\\targetFile.txt", copy);

    }

    public static void write(String pathFile, String data) {
        File file = new File(pathFile);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> read(String pathFile) {
        File file = new File(pathFile);
        List<String> str = new ArrayList<>();
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            FileReader  fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                str.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return str;
    }
}
