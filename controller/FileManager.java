package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Error.ErrorLog;

/**
 * FileManager
 */
public class FileManager {
    private FileManager() {}

    public static String[] fileRead(String filename) {
        String[] words = null;
        try(FileReader fileReader = new FileReader(filename); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String lineWords = bufferedReader.readLine();
            words = lineWords.split(" ");
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка файл не найден, что бы изменить путь поиска изменить туть к папке в файле Setting.Setting: " + e.getClass());
            ErrorLog.errorReadFile(e);
        } catch (IOException e) {
            System.out.println("Произошла ошибка: " + e.getClass());
            ErrorLog.errorReadFile(e);
        }
        return words;
    }
}