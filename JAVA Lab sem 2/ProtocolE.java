import java.net.*;
class ProtocolE{
    public static void main(String[] args) throws Exception{
        URL url=new URL("https://chatgpt.com/c/699c54dd-6b88-8320-8fbe-6c9a0f5d83cf");
        System.out.println("Protocol :"+url.getProtocol());

    }

}