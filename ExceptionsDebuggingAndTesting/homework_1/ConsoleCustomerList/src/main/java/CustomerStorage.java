
import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {

    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        if (components.length != 4) {
        throw new IllegalArgumentException("Некорректное количество элементов массива. ");
        }
        if (!components[0].matches("[А-я]+")){
            throw new IllegalArgumentException("Неверный формат имени. ");
        }
        if (!components[1].matches("[А-я]+")) {
            throw new IllegalArgumentException("Неверный формат фамилии. ");
        }
        if (!components[2].matches(".+@.+\\.[\\w]{2,3}")){
            throw new IllegalArgumentException("Неверный формат элетронной почты. ");
        }
        if (!components[3].matches("^\\+?\\d{11}$")){
            throw new IllegalArgumentException("Неверный формат номера телефона. ");
        }

            String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
            storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
        }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}