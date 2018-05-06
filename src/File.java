import java.util.*;
import java.io.*;

public class File implements Serializable {

    public void readFromUser(ArrayList<User> users) throws ClassNotFoundException {
        try {
            FileInputStream fileIn = new FileInputStream("txt//users.ser");
            ObjectInputStream input = new ObjectInputStream(fileIn);
            users = (ArrayList<User>) input.readObject();
            input.close();
            fileIn.close();
        } catch (IOException e) {
            users.add(new User("admin", "admin", true));
            users.add(new User("bent", "1234", true));
            users.add(new User("hans", "5678", true));
        }
    }

    public void writeToUser(ArrayList<User> users) throws IOException, ClassNotFoundException{
        FileOutputStream fileOut = new FileOutputStream("txt//users.ser");
        ObjectOutputStream output = new ObjectOutputStream(fileOut);
        output.writeObject(users);
        output.close();
        fileOut.close();
    }

}
