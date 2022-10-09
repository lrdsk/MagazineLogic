package Database;

import com.google.gson.Gson;
import magazine.Magazine;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FileDatabase <T> {
    private static final Gson GSON = new Gson();
    private final Path filePath;
    private final Class<T> tClass;

    public FileDatabase(String fileName, Class<T> tClass) throws IOException {
        this.tClass = tClass;
        this.filePath = Paths.get("./storage", fileName + ".jsonl").toAbsolutePath();
        Files.createDirectories(filePath.getParent());
    }

    public List<T> getData() throws IOException {
        System.out.println("FD: Reading");
        if (!Files.exists(this.filePath)) {
            return Collections.emptyList();
        }

        return Files.lines(this.filePath)
                .map(line -> GSON.fromJson(line, this.tClass))
                .collect(Collectors.toList());
    }

    public void saveData(List<T> data) throws IOException {
        System.out.println("FD: Saving");
        List<String> fileData = data
                .stream()
                .map(GSON::toJson)
                .collect(Collectors.toList());
        Files.write(this.filePath, fileData);
    }
}
