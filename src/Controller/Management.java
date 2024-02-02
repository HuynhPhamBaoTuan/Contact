package Controller;

import java.util.ArrayList;
import Model.Contact;
import Common.Program;
import view.Menu;


public class Management extends Menu {

    private ArrayList<Contact> arr = new ArrayList();

    public Management() {
    }

    public Management(String title, String[] s) {
        super(title, s);
    }
    
    @Override
    public void execute(int choice) {
            Program pro = new Program();
        switch (choice) {
            case 1:
                pro.createContact(arr);
                break;
            case 2:
                pro.displayAllContact(arr);
                break;
            case 3:
                pro.deleteContact(arr);
                break;
            case 4:
                System.out.println("Exited");
                return;
            default:
                System.err.println("Choose 1-4");
                break;
        }
    }
}