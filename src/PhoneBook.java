import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public Map<String, String> note = new HashMap<>();

    public static Contact createContact(String name, String number) {
        return new Contact(name, number);
    }

    public String searchContact(String number) {
        return note.get(number);

    }

}
