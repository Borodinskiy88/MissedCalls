public class Contact {

    public String name;
    public String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + " -> " + number;
    }

    public String getNumber() {
        return number;
    }
}
