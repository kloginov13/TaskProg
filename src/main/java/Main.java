import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Админ on 02.12.2016.
 */

/**
 * Проверяемые исключения
 */
public class Main {
    @UserStorie(userStory = "Чтение из файла")
    public static void main(String args[])
    {
        FileInputStream file = null;
        try{
            file = new FileInputStream("C:/NumFile.txt");
        }catch(FileNotFoundException e){
            System.out.println("File doesn't exist!");
        }
        int k;
        try{
            while(( k = file.read() ) != -1)
            {
                System.out.print((char)k);
            }
            file.close();
        }catch(IOException ioe){
            System.out.println("I/O error occurred: "+ioe);
        }

    }
}
