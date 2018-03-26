package stemmer;

import java.io.*;

public class appIO {

    public String getText(String filePath){

        String fileText;
        try{
            FileReader reader = new FileReader(filePath);

            if(reader.ready()){
                char[] cbuf = new char[255];
                ((Reader)reader).read(cbuf);

                fileText = new String(cbuf);
            } else
                fileText = new String();
        } catch (Exception e) {
            fileText = new String();
        }

        return fileText;
    }
}
