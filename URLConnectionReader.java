import java.net.*;
import java.io.*;

public class URLConnectionReader
{
  public static void main(String[]args)throws Exception
  {
    URL alamat = new URL("http://www.unisbank.ac.id");
    URLConnection yc = alamat.openConnection();
    BufferedReader in = new BufferedReader(
                  new InputStreamReader(
                  yc.getInputStream()));
    String inputLine;
    while ((inputLine = in.readLine())!=null)
      System.out.println(inputLine);
      in.close();
     }
    }
