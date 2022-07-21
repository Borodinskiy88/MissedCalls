public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();

        madeContacts(phoneBook);

        missedCalls.putMissedCalls("11-11-11");
        missedCalls.putMissedCalls("22-22-22");
        missedCalls.putMissedCalls("33-33-33");

        missedCalls.printCalls(phoneBook);

        System.out.println(phoneBook.searchContact("11-11-11"));
    }
    public static void madeContacts(PhoneBook phoneBook) {
        phoneBook.createContact("Толстой", "11-11-11");
        phoneBook.createContact("Достоевский", "22-22-22");
        phoneBook.createContact("Солженицын", "33-33-33");

    }
}
