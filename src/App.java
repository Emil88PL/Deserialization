import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

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

        // Notes to remember

        // 1 Children classes of a parent class that implements Serializable will do so as well
        // 2 static fields are not serialized (they belong to the class, not an individual object)
        // 3 the class's definition ("class file") itself is not recorded, cast it as the object type
        // 4 Fields declared as "transient" are not serialized, they are ignored
        // 5 sierialVersionUID is a unique version ID for class that is serializable



        User user1 = null;
        User user2 = null;
       

        FileInputStream fileIn = new FileInputStream("C:/JAVA 23''/First test in 23''/Serializer/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        user1 = (User) in.readObject();
        user2 = (User) in.readObject();
       

        in.close();
        fileIn.close();


        System.out.println(user1.name);
        System.out.println(user1.password);
        user1.seyHello();

        System.out.println(user2.name);
        System.out.println(user2.password);
        user2.seyHello();

        long serialVersionUID = ObjectStreamClass.lookup(user1.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}
