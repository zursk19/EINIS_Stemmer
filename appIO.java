package stemmer;

import java.io.*;

public class appIO {

    public String getText(String filePath){

        try{
            FileReader reader = new FileReader(filePath);

            if(reader.ready()){
                char[] cbuf = new char[255];
                ((Reader)reader).read(cbuf);

                String string = new String(cbuf);
            }
        } catch (Exception e) {
        }

        return "";
    }
    //public String StringToChar(char[] charArray){ }
}
