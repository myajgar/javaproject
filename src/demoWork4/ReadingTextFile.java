package demoWork4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile {
    public static void main(String[] args) throws IOException {

        String teampcontainer;

        String finalcontainer = " ";//from class 4th.little more on 5th


        FileReader fileReader = new FileReader("src/demoWork4/text.data");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((teampcontainer = bufferedReader.readLine()) != null) {
            finalcontainer = finalcontainer + "\n" + teampcontainer; //" \n " //for to make text as it is.
        }
        System.out.println(finalcontainer);

    }
}
