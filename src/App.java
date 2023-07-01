import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Steps to DeSerialization

        // 1 Declare your object (don't instantiate)
        // 2 Your class should implement Serializable interface
        // 3 add import java.io.Serializable;
        // 4 FileInputStream fileIn = new FileInputStream(File path);
        // 5 ObjectInputStream in = new ObjectInputStream(fileIn);
        // 6 objectName = (Class) in.readObject();
        // 7 in.close(); fileIn.close();


        User user = null;

        FileInputStream fileIn = new FileInputStream("C:/JAVA 23''/First test in 23''/Serializer/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        user = (User) in.readObject();

        in.close();
        fileIn.close();


        System.out.println(user.name);
        System.out.println(user.password);
        user.seyHello();


    }
}
