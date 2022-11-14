package CreateAndWriteToAndFromTXT;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args){
        // Testing the creating a file part
        CreateAFile createAFile = new CreateAFile();
        createAFile.CreateAFile("Arabisk");

        // Testing reading a file
        ReadFile readFile = new ReadFile();
        ArrayList<String> stringArrayList = readFile.ReadFile("TestSprog.txt");

        System.out.println("Printing now the fetched arraylist from txt\n");
        System.out.println(stringArrayList);

        // Testing writing to a file
        //WriteToFile writeToFile = new WriteToFile();
        //writeToFile.WriteToFile("Test.txt","I think it worked",3);



    }

}
