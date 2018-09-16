public class AddressBook {
    public static void main(String[] args) {
        Address address = new Address(" Wrocław", "Rymarska", "54", "1");
        Person person = new Person("Jan", "Kowalski", address);

        System.out.println(person.firstName + " " + person.lastName);
        System.out.printf("%s %s %s/%s",person.address.city, person.address.street, person.address.homeNumber, person.address.apartament);
    }
}
