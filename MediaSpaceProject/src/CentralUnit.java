
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohamed
 */
public class CentralUnit {
    public ArrayList<User> users = new ArrayList<User>();
    public Manager centralManager = new Manager("Mohamed", "admin", "admin");
    public int activeUserIndex = -2; // -2: No user, -1: Manager, index of user

    public CentralUnit() throws FileNotFoundException, ClassNotFoundException, IOException {
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Users.txt"));
            while (true) {
                users.add((User)in.readObject());
            }
        }
        catch(EOFException ex) {
            // complete in gui
        }
        
        try{
            Scanner scan = new Scanner(new File("RememberMe.txt"));
            activeUserIndex = scan.nextInt();
        } catch(Exception e) {
            
        }
    }
    
    public int login(String username, String password, boolean remember) { // 0: Manager, 1: User, 2: wrong password, 3: not found
        // Check Manager
        if (centralManager.getUsername().equals(username)) {
            if (centralManager.getPassword().equals(password)) {
                activeUserIndex = -1;
                return 0;
            }
            return 2;
        }
        // Check User
        int index = checkUsername(username);
        if (index != -1) {
            if (users.get(index).getPassword().equals(password)) {
                activeUserIndex = index;
                if (remember) {
                    try{ 
                        PrintWriter output = new PrintWriter(new FileWriter("RememberMe.txt"));
                        output.print("" + activeUserIndex);
                        output.close();
                    } catch (IOException ex) {

                    }
                }
                return 1;
            }
            activeUserIndex = -2;
            return 2;
        }
        // Not Found
        activeUserIndex = -2;
        return 3;
    }
    
    public boolean register(User u) { // Returns true if registerd, false: If username is used
        if (checkUsername(u.getUsername()) != -1) {
            return false;
        }
        users.add(u);
        activeUserIndex = users.size() - 1;
        return true;
    }
    
    private int checkUsername(String username) { // Returns index of user if found, -1: If not found 
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean editProfile(User u) { // Returns true if editted, false: If username is used
        if (!users.get(activeUserIndex).getUsername().equals(u.getUsername()) && checkUsername(u.getUsername()) != -1) {
            return false;
        }
        users.set(activeUserIndex, u);
        return true;
    }
    public void saveUsers() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Users.txt"));
            for (int i = 0; i < users.size(); i++) {
                out.writeObject(users.get(i));
            }
            out.close();
        } catch (IOException ex) {
            // complete in gui
        }
    }
    public void unRemeberMe() {
        try{ 
            PrintWriter output = new PrintWriter(new FileWriter("RememberMe.txt"));
            output.print("-2");
            output.close();
        } catch (IOException ex) {

        }
    }
}
