import java.util.*;
import java.io.*;

public class User implements Serializable {

    private String username, password;
    private boolean active;

    public User(String username, String password, boolean active){

        this.username = username;
        this.password = password;
        this.active = active;

    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public boolean isActive(){
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void printInfo(){
        System.out.println("Username: "+username+"; Password: "+password+"; Active: "+active);
    }
}
