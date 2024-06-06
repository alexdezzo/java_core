package home_work_6.phonebook;

import java.util.*;

class PhoneBook {
    Map<User, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void addContact(String name, Integer phone) {
        User user = new User(name, phone);

        if (phoneBook.containsKey(user)) {
            phoneBook.get(user).add(phone);
        } else {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(phone);
            phoneBook.put(user, numbers);
        }
    }

    PhoneBook() {
        comparator = (o1, o2) -> o2.getValue().size() - o1.getValue().size();
    }

    Comparator<Map.Entry<User, ArrayList<Integer>>> comparator;

    public void printPhoneBook() {
//        System.out.println(phoneBook); // проверка

        phoneBook.entrySet().stream()
                .sorted(comparator)
                .forEach(System.out::println);
        System.out.println("---End of Sorted PhoneBook---");
        System.out.println();

    }


    public void removePhone(int phoneNum) {
        int count = 0;
        for (Map.Entry<User, ArrayList<Integer>> entry : phoneBook.entrySet()) {
            User user = entry.getKey();
            List<Integer> numbers = entry.getValue();
            for (Integer number : numbers) {
                if (number == phoneNum) {
                    numbers.remove(number);
                    System.out.println("Удаление номера " + phoneNum + " выполнено");
                    System.out.println("Номер принадлежал контакту " + "'" + user + "'");
                    System.out.println();

                    count++;
                    break;
                }
            }

        }
        if (count == 0) {
            System.out.println("Телефон " + phoneNum + " не найден");
            System.out.println();

        }

    }
}

