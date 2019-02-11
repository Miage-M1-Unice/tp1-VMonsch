package fr.unice.miage.monsch;

import java.io.File;
import java.io.FilenameFilter;

public class CustomFilter implements FilenameFilter {

    private String nameFilter;

    public CustomFilter(String nameFilter) {
        this.nameFilter = nameFilter;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.contains(nameFilter);
    }
}
