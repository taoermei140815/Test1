/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;
import java.io.*;
import java.net.*;
/**
 *
 * @author Administrator
 */
public class Client {
    static Socket server;
    public static void main(String[] args)throws Exception{
        server=new Socket(InetAddress.getLocalHost(),5678);
        BufferedReader in=new BufferedReader(new InputStreamReader(server.getInputStream()));
        PrintWriter out=new PrintWriter(server.getOutputStream());
        BufferedReader wt=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str=wt.readLine();
            out.println(str);
            out.flush();
            if(str.equals("end")){
                break;
                                }
            System.out.println(in.readLine());
}
            server.close();

}
}
