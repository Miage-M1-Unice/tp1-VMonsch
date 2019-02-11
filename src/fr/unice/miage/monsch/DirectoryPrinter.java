package fr.unice.miage.monsch;

import java.io.File;

public class DirectoryPrinter {

    public void printFiles(String rootPath, CustomFilter filter, String indent) {
        File rootFile = new File(rootPath);
        for(File childFile : rootFile.listFiles(filter)) {
            System.out.println(indent + childFile.getPath());

            if (childFile.isDirectory()) {
                printFiles(childFile.getPath(), filter, indent + "-");
            }
        }
    }
}
