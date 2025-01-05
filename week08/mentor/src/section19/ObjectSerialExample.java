package section19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerialExample {
    public static void main(String[] args) {
        Person p1 = new Person("김철수", 19);
        Person p2 = new Person("김영희", 17);
        FileOutputStream out = null;
        ObjectOutputStream oos = null;
        try {
            out = new FileOutputStream("object_data.dat");
            oos = new ObjectOutputStream(out);
            
            oos.writeObject(p1);
            oos.writeObject(p2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}