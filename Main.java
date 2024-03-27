import Setting.Setting;
import controller.FileManager;
import controller.InfoWords;
import view.ViewShoow;


/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        String nameInputFile = "input.txt";
        String[] words = FileManager.fileRead(Setting.pathSaveFileUser + nameInputFile);

        ViewShoow.shoowResponse(
            "Количество слов в файле: " + 
            String.valueOf(InfoWords.cntWords(words))
        );

        ViewShoow.shoowResponse(
            "Самое длинноые слово в файле: " + 
            String.valueOf(InfoWords.findHighWord(words))
        );

        ViewShoow.shoowResponse(
            "Статистика слов в файле: " + 
            String.valueOf(InfoWords.frequencyOfWords(words))
        );
    }
}