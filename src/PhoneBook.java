import java.util.HashMap;
import java.util.Map;
public class PhoneBook {
    private final Map<String, String> contacts = new HashMap<>();
    public void addContacts (String name, String number) {
        contacts.put(name, number);}
    public void removeContacts (String name) {
        contacts.remove(name);}

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + contacts +
                '}';
    }
}

