package TugasPraktikum_FileHadling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter{
    public static void main(String[] args) {
        String csvFile = "./data/student.csv";
        String[] data = {
            "4,Dani,23",
            "5,Rizki,23",
            "6,Fairuz,22"
        };
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}