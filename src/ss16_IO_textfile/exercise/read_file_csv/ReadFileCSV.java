package ss16_IO_textfile.exercise.read_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileCSV {

    public static void main(String[] args) {
        File file = new File("src\\ss16_IO_textfile\\exercise\\read_file_csv\\danhsach.csv");
        List<String[]> list = new ArrayList<>();
        List<Country> countryList = new ArrayList<>();
        if (!file.exists()) {
            System.out.println("File trống");
        } else {
            String line;
            String[] arr;
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                while ((line = bufferedReader.readLine()) != null) {
                    arr = line.split(",");
                    list.add(arr);
                    System.out.println(Arrays.toString(arr));
                }

                for (String[] item : list) {
                    Country country = new Country(Integer.parseInt(item[0]), item[1], item[2]);
                    countryList.add(country);
                }

                System.out.println("List of countries: ");
                for (Country item : countryList) {
                    System.out.println(item);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
