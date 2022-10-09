package App;

import Database.FileDatabase;
import magazine.Magazine;
import magazine.MagazineService;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        FileDatabase<Magazine> magazineFileDatabase = new FileDatabase<>("magazines", Magazine.class);

        ArrayList<Magazine> magazineList = new ArrayList<>(magazineFileDatabase.getData());
        System.out.printf("Found %d shops\n", magazineList.size());
        MagazineService magazineService = new MagazineService();
        magazineList.forEach(shop -> {
            magazineService.showInfo(shop);
        });
        magazineList.add(new Magazine(
                "New shop",
                "New address",
                "Test",
                "Kolpakov"
        ));
        magazineFileDatabase.saveData(magazineList);

        FileDatabase<String> stringFileDatabase = new FileDatabase<>("strings", String.class);
        stringFileDatabase.saveData(Arrays.asList("HEllo", "world"));
        System.out.println(stringFileDatabase.getData());

    }
}
