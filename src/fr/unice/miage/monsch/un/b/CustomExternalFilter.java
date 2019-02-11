package fr.unice.miage.monsch.un.b;

import java.io.File;
import java.io.FilenameFilter;

public class CustomExternalFilter implements FilenameFilter {

    private String nameFilter;

    public CustomExternalFilter(String nameFilter) {
        this.nameFilter = nameFilter;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.contains(nameFilter);
    }
}
