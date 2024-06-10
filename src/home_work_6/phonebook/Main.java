package home_work_6.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.addContact("Ростислав", 52368);
        book.addContact("Ivan", 5587);
        book.addContact("Иван", 5557);
        book.addContact("Лариса", 657);
        book.addContact("Лариса", 333);
        book.addContact("Лариса", 652347);
        book.addContact("Иван", 737);
        book.addContact("Иван", 7337);
        book.addContact("Евгений", 85537);
        book.addContact("Евгений", 455447);


        book.printPhoneBook(); // вывод в консоль мапы

        book.removePhone(455447); // удаляет номер из контакта
        book.printPhoneBook(); // вывод в консоль мапы
//        book.removeContact(new User("Иван"), 75537);

    }
}
