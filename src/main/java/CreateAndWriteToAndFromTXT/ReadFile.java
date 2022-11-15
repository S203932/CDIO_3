package CreateAndWriteToAndFromTXT;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public class ReadFile {

    public ArrayList<String> ReadFile(String fileName){
        ArrayList<String> stringArrayList = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string =bufferedReader.readLine();
            int counter = 0;
            while(string != null){
                System.out.println(string);
                stringArrayList.add(string);
                string = bufferedReader.readLine();
                counter++;
            }
            bufferedReader.close();
            fileReader.close();
            return stringArrayList;
        }catch (IOException Error){
            System.out.println(Error);
            Error.printStackTrace();
            return stringArrayList;
        }
    }
}