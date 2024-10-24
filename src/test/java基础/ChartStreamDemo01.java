package test.java基础;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ChartStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Lenovo\\Desktop\\过滤.txt");
        int ch;
        while((ch=fileReader.read())!=-1){
            System.out.print(ch);
        }
        fileReader.close();
    }
}
