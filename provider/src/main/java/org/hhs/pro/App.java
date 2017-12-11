package org.hhs.pro;

import org.hhs.pro.baseInters.SayHelloService;
import org.hhs.pro.impls.SayHelloServiceImpl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class App {
//    private static SayHelloService service = new SayHelloServiceImpl();
//    public static void main( String[] args ) throws NoSuchMethodException, IOException, ClassNotFoundException, InvocationTargetException, IllegalAccessException {
//        ServerSocket serverSocket = new ServerSocket(1234);
//        while (true && serverSocket.isClosed()){
//            Socket socket = serverSocket.accept();
//            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
//            String interfaceName = inputStream.readUTF();
//            String methodName = inputStream.readUTF();
//            Class<?>[] parameterTypes = (Class<?>[]) inputStream.readObject();
//            Object[] arguments = (Object[]) inputStream.readObject();
//            Class serviceInterfaceClass = Class.forName(interfaceName);
//            Method method = serviceInterfaceClass.getMethod(methodName, parameterTypes);
//            Object result = method.invoke(service, arguments);
//
//            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
//            outputStream.writeObject(result);
//            serverSocket.close();
//        }
//    }
}
