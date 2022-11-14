package CreateAndWriteToAndFromTXT;
public class TestMain {
    public static void main(String[] args){
        // Testing the creating a file part
        CreateAFile createAFile = new CreateAFile();
        createAFile.CreateAFile("Test");

        // Testing writing to a file
        WriteToFile writeToFile = new WriteToFile();
        writeToFile.WriteToFile("Test.txt","I think it worked",3);



    }

}
