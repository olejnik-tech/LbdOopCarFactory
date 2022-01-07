package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileService {

    private static String[] symbolsToRemove = {"[", "]"};

    public static List<String> readFile(String fileName) throws IOException {
        return Files.readAllLines(Path.of(fileName));
    }

    public static String[] parseString(String line, String delimiter){
        line = stripFromSymbols(line);
        return line.split(delimiter);
    }

    private static String stripFromSymbols(String orig){
        for (int i = 0; i < symbolsToRemove.length; i++) {
            orig = orig.replace(symbolsToRemove[i],"");
        }
        return orig;
    }

}
