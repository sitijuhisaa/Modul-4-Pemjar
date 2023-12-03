import java.net.*;

public class urltest1 {
  public static void main (String args[]){
    URL webURL, ftpURL;
    try{
   webURL = new URL("http://www.macfaq.com/vendor.html");
   System.out.println(webURL);
   ftpURL = new URL("ftp://ftp1.macfaq.com/pub/");
   System.out.println(ftpURL);
   }
   catch(MalformedURLException e) {
    System.err.println("URL Salah");
   }
  }
}
