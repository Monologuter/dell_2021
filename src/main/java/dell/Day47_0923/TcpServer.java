package dell.Day47_0923;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author 马小姐
 * @Date 2020-09-23 09:39
 * @Version 1.0
 * @Description:  Tcp通信的服务端   接收客户端的请求 读取客户端发送的数据  给客户端回写数据
 *
 *                构造方法：
 *                  ServerSocket(int port)  创建绑定到特定端口的服务器套接字。
 *
 *                服务器端必须明确一件事情 必须知道哪个客户端请求的服务器  所以可以使用accept方法获取到请求的客户端Socket
 *
 *                成员方法：
 *                  Socket accept() 监听接收到的套接字连接
 *
 *
 *                服务器的实现步骤：
 *                  1、创建服务器ServerSocket对象和系统要指定的端口号
 *                  2、使用ServerSocket对象中的accept方法获取到客户端的对象的socket
 *                  3、使用Socket对象中的getInputStream()方法获取网络字节输入流对象InputStream
 *                  4、使用网络字节InputStream中的方法read读取服务器回写的数据
 *                  5、使用Socket对象中的getOutputStream() 方法获取网络对象字节输出流
 *                  6、使用网络字节输出流中的write给服务器回写数据
 *                  7、释放资源(Socket ServerSocket )
 */
public class TcpServer {
    public static void main(String[] args) throws IOException {
        // 1、创建服务器ServerSocket对象和系统要指定的端口号
        ServerSocket server  = new ServerSocket(8888);

        //2、使用ServerSocket对象中的accept方法获取到客户端的对象的socket
        Socket socket = server.accept();

        //3、使用Socket对象中的getInputStream()方法获取网络字节输入流对象InputStream
        InputStream is = socket.getInputStream();

        //4、使用网络字节InputStream中的方法read读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0 , len));


        //5、使用Socket对象中的getOutputStream() 方法获取网络对象字节输出流
        OutputStream os = socket.getOutputStream();



        //6、使用网络字节输出流中的write给服务器回写数据
        os.write("收到谢谢".getBytes());


        //7、释放资源(Socket ServerSocket )
        socket.close();
        server.close();
    }
}
