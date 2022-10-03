package Lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ChekedExeptions {
    public static void main(String[] args) {

            try {
                InputStream inputStream = new FileInputStream("aff.txt");
            } catch (FileNotFoundException e) {
               System.out.println(e);
            }

            System.out.println("Im still alive");


        }
    }

