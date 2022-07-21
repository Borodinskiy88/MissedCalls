import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

import static java.time.LocalDateTime.now;

public class MissedCalls {
    Map<LocalDateTime, String> loseCalls = new TreeMap<>();

    public void putMissedCalls(String number) {
        loseCalls.put(now(), number);
    }

    public String printCalls(PhoneBook phoneBook) {
        for (Map.Entry<LocalDateTime, String> local : loseCalls.entrySet()){
            String contact = phoneBook.searchContact(local.getValue());
            String nameOrNumber = contact != null ? contact : local.getValue();
            System.out.println(local.getKey() + "   " + nameOrNumber);
        }
        return null;
    }





}
