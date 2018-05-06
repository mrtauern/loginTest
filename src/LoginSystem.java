import java.util.*;
import java.io.*;
import java.net.*;

public class LoginSystem implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File();

        ArrayList<User> users = new ArrayList<User>();

        file.readFromUser(users);

        /*try {
            FileInputStream fileIn = new FileInputStream("txt//users.ser");
            ObjectInputStream input = new ObjectInputStream(fileIn);
            users = (ArrayList<User>) input.readObject();
            input.close();
            fileIn.close();
        } catch (IOException e) {
            users.add(new User("admin", "admin", true));
            users.add(new User("bent", "1234", true));
            users.add(new User("hans", "5678", true));
        }*/

        for (User u : users){
            u.printInfo();
        }

        //System.out.println(users);

        /*int index = 0;
        for (User u : users){
            if(u.getUsername().equals("admin")) {
                users.get(index).setUsername("Ivan");
            }
            index++;
        }

        for (User u : users){
            u.printInfo();
        }*/

        file.writeToUser(users);

    }

}
