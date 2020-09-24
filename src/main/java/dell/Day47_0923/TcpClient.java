package dell.Day47_0923;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author 马小姐
 * @Date 2020-09-23 09:18
 * @Version 1.0
 * @Description:  tcp通信的客户端：向服务器发送链接请求 给服务器发送数据 读取服务器的回写数据
 *                表示客户端的类：
 *                  java.net.Socket类
 *
 *                  java.net.Socket  此类实现客户端套接字（也可以就叫“套接字”）。套接字是两台机器间通信的端点
 *                                   套接字的实际工作由 SocketImpl 类的实例执行。应用程序通过更改创建套接字实现的套接字工厂可以配置它自身，以创建适合本地防火墙的套接字。
 *                                   包含了ip和端口号网络单位
 *
 *                  构造方法：
 *                      Socket(String host, int port) 创建一个流套接字并将其连接到指定主机上的指定端口号。
 *
 *                  成员方法：
 *                      OutputStream	getOutputStream()   返回此套接字的输出流。
 *                      InputStream	getInputStream()        返回此套接字的输入流。
 *                      void	close()                     关闭此套接字。
 *
 *
 *                 实现步骤：
 *                    1、创建一个客户端对象Socket   构造方法中绑定服务器的ip和端口号
 *                    2、使用Socket对象中的getOutputStream() 方法获取网络对象字节输出流
 *                    3、使用网络字节输出流中的write给服务器发送数据
 *                    4、使用Socket对象中的getInputStream()方法获取网络字节输入流对象InputStream
 *                    5、使用网络字节InputStream中的方法read读取服务器回写的数据
 *                    6、释放资源 关闭Socket即可
 *
 *
 *                    注意事项：
 *                      客户端和服务器端进行交互必须使用Socket中提供的网络流 不能使用自己创建的流对象
 *                      当我们创建客户端对象Socket的时候  他就会去请求服务器和服务器经过三次握手建立连接通路  这时候如果服务器没有启动  就会抛出异常  如果服务器已经启动了  那么久可以进行交互了
 *
 *
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {

        //1、创建一个客户端对象Socket   构造方法中绑定服务器的ip和端口号
        Socket socket = new Socket("127.0.0.1",8888);


        // 2、使用Socket对象中的getOutputStream() 方法获取网络对象字节输出流
        OutputStream os = socket.getOutputStream();



        //3、使用网络字节输出流中的write给服务器发送数据

        os.write("你属猪的吗".getBytes());

        // 4、使用Socket对象中的getInputStream()方法获取网络字节输入流对象InputStream
        InputStream is = socket.getInputStream();


        //5、使用网络字节InputStream中的方法read读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);

        System.out.println(new String(bytes,0 , len));


        //6、释放资源
        socket.close();


    }
}
