public class Main {
    public static void main(String[] args){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContacts("Arkadiy", "8-911-777-88-99");
        phoneBook.addContacts("Artem", "8-921-777-88-99");
        phoneBook.addContacts("Armen", "8-931-777-88-99");
        phoneBook.addContacts("Andy", "8-941-777-88-99");
        phoneBook.addContacts("Anna", "8-951-777-88-99");
        phoneBook.addContacts("Viktor", "8-961-777-88-99");
        phoneBook.addContacts("Katya", "8-971-777-88-99");
        phoneBook.addContacts("Mama", "8-991-777-88-99");
        phoneBook.addContacts("Papa", "8-981-777-88-99");
        phoneBook.addContacts("Andrey", "8-912-777-88-99");
        phoneBook.addContacts("Tasya", "8-911-787-88-99");
        phoneBook.addContacts("Boris", "8-911-777-98-99");
        phoneBook.addContacts("Gulya", "8-911-477-88-99");
        phoneBook.addContacts("Babka", "8-911-177-88-99");
        phoneBook.addContacts("Evgeniy", "8-911-777-88-39");
        phoneBook.addContacts("Zaya", "8-911-777-87-99");
        phoneBook.addContacts("Olga", "8-915-777-88-99");
        phoneBook.addContacts("Sanya", "8-911-777-88-66");
        phoneBook.addContacts("Bob", "8-919-777-88-99");
        phoneBook.addContacts("Grisha", "8-911-777-33-99");
        System.out.println(phoneBook);

        phoneBook.removeContacts("Grisha");
        System.out.println(phoneBook);


    }
}