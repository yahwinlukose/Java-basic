/*
     Serialization and De-Serialization.
     Basic object state persistence in Java.
     @JIYO P V      roll no: 33    
     02 january 2026
*/
import java.io.*;

class SerStudent implements Serializable {
    String name;
    int roll;

    SerStudent(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        SerStudent s1 = new SerStudent("John", 101);
        String filename = "student_simple.ser";

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(s1);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // De-Serialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            SerStudent s2 = (SerStudent) in.readObject();
            System.out.println("De-serialized Student: Name=" + s2.name + ", Roll=" + s2.roll);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

 

 
