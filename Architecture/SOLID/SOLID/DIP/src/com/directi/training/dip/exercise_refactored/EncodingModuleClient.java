
import java.io.IOException;
import java.net.URL;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        String fileReaderPath=  "beforeEncryption.txt";
        String fileWriterPath=  "afterEncryption.txt";
        URL url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
        EncodingModule encodingModule = new EncodingModule();
        encodingModule.encodeWithFiles(fileReaderPath,fileWriterPath);
        MyDatabase dataBase = new MyDatabase();
        encodingModule.encodeBasedOnNetworkAndDatabase(url,dataBase);
    }
}
