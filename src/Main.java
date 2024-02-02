
import Controller.Management;

public class Main {
    public static void main(String[] args) {
        String title = "========== Contact program ============";
        String[] s = new String[]{"Add a Contact", "Display all Contact", "Delete a Contact", "Exit"};
        Management manage = new Management(title, s);
        manage.run();
    }
}
