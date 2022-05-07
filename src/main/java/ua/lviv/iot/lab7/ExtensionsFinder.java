package ua.lviv.iot.lab7;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtensionsFinder {

    public List<String> findFilesForExtensions(String text, String searchWord, String extensions) {
        LinkedList<String> images = new LinkedList<>();
        Pattern pattern = Pattern.compile("\\b"+ searchWord + "\\b\\." + extensions);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            images.add(matcher.group());
        }
        return images;
    }

}
