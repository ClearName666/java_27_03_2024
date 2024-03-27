package Error;

import java.io.FileWriter;
import java.io.IOException;

import Setting.Setting;

public class ErrorLog {
    private ErrorLog() {}
    public static void errorReadFile(Exception error){
        try(FileWriter fileWriter = new FileWriter(Setting.pathError + "errors.txt", true)) {
            fileWriter.write(error.getMessage());
        } catch(IOException e) {
            System.out.println("Записать ошибку в файл не удалось: " + e.getMessage());
        }
    } 
}
