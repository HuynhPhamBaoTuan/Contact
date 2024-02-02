package view;

import Model.Contact;
import java.util.ArrayList;
import java.util.Scanner;

public class Validation {

    private final static Scanner in = new Scanner(System.in);
    private static final String[] VALID_PHONE = {"[0-9]{10}",
        "[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}",
        "[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}\\s[x][0-9]{4}",
        "[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}\\sext[0-9]{4}",
        "\\([0-9]{3}\\)\\-[0-9]{3}\\-[0-9]{4}",
        "[0-9]{3}\\.[0-9]{3}\\.[0-9]{4}",
        "[0-9]{3}\\s[0-9]{3}\\s[0-9]{4}"};

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    public static int checkId(ArrayList<Contact> contacts){
        int maxId = 0;
       for (Contact contact : contacts){
            if (contact.getId() > maxId){
                maxId = contact.getId();
            }
        }
       return maxId + 1;
    }

    
    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (Exception e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputName() {
        while (true) {
            String name = checkInputString();
            name = name.trim();
            name = name.replaceAll("\\s+", " ");
            String[] strings = name.split("\\s");
            //appen every word and character special distance is one space
            if (strings.length <= 1) {
                System.err.println("Please input Name follow\n" + "First Name + Last Name");
                System.out.print("Enter again: ");
            } else {
                return name;
            }
        }
    }

    public static String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            for (int i = 0; i < VALID_PHONE.length; i++) {
                if (result.matches(VALID_PHONE[i])) {
                    return result;
                }
            }
            System.err.println("Please input Phone follow\n"
                    + "• 1234567890\n"
                    + "• 123-456-7890 \n"
                    + "• 123-456-7890 x1234\n"
                    + "• 123-456-7890 ext1234\n"
                    + "• (123)-456-7890\n"
                    + "• 123.456.7890\n"
                    + "• 123 456 7890");
            System.out.print("Enter again: ");
        }
    }

}