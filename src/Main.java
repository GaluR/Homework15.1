import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Country> countryMap = new LinkedHashMap<>();
        try {
            getFromFile("countries.csv", countryMap);
            System.out.println("Podaj kod kraju, o którym chcesz wyświetlić informację: ");
            String id = scan.nextLine();
            checkCountries(countryMap, id);
        } catch (IOException e) {
            System.out.println("Niepoprawna ścieżka pliku lub plik nie został stworzony.");;
        }

    }

    private static void checkCountries(Map<String, Country> countryMap, String id) {
        if (countryMap.get(id) == null) {
            System.out.println("Nie ma kraju o podanym ID!");
        } else {
            System.out.println(countryMap.get(id));
        }
    }

    private static Map<String, Country> getFromFile(String s, Map<String, Country> countryMap) throws FileNotFoundException {
        Scanner input = new Scanner(new File(s));
        String line;
        String[] temp;
        Country country;
        while (input.hasNextLine()) {
            line = input.nextLine();
            temp = line.split(";");
            country = new Country(temp[0], temp[1], Integer.valueOf(temp[2]));
            countryMap.put(temp[0], country);
        }
        return countryMap;
    }
}
