package stringfile;

import java.util.*;

import java.io.*;

public class ReadFile {

    public static void FileRead(String Filename) {
        try {
            File file = new File(Filename);
            Scanner sc = new Scanner(file);

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {
        // FileRead("C:/\Users/\amkusharma/\Desktop/\newpro/\extra/\chegg/\javacode/\stringfile");

    }

}