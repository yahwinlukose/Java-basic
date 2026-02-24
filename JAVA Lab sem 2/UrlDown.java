import java.net.*;
import java.io.*;
class UrlDown{
    public static void main(String[] args) throws Exception{
        URL url=new URL("https://example.com");
        BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
        FileOutputStream fos=new FileOutputStream("Downloaded1.html");
        String data;
        while((data=br.readLine())!=null){
            fos.write((data+"\n").getBytes());
        }
        System.out.println("Downloaded Successfully");
        
        fos.close();


    }

}