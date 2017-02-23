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
public class MySever {
    public static void main(String[] args) throws IOException{
        ServerSocket server=new ServerSocket(5678);
        Socket client=server.accept();
        BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out=new PrintWriter(client.getOutputStream());
        while(true){
            String str=in.readLine();
            System.out.println(str);
            out.println("has receive....");
            out.flush();
            if(str.equals("end"))
            break;
                  }
        client.close();
        }
}
