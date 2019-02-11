package fr.unice.miage.monsch.un.b;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoryPrinter {

    public void printFilesWithAnonymousFilter2(String rootPath, String filter) {
        printFiles(rootPath, new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.contains(filter);
            }
        }, "");
    }

    public void printFilesWithAnonymousFilter(String rootPath, String filter) {
        FilenameFilter internalFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.contains(filter);
            }
        };
        printFiles(rootPath, internalFilter, "");
    }

    public void printFilesWithInternalFilter(String rootPath, String filter) {
        CustomInternalFilter internalFilter = new CustomInternalFilter(filter);
        printFiles(rootPath, internalFilter, "");
    }

    public void printFiles(String rootPath, FilenameFilter filter, String indent) {
        File rootFile = new File(rootPath);
        for(File childFile : rootFile.listFiles(filter)) {
            System.out.println(indent + childFile.getPath());

            if (childFile.isDirectory()) {
                printFiles(childFile.getPath(), filter, indent + "-");
            }
        }
    }

    public class CustomInternalFilter implements FilenameFilter {

        private String nameFilter;

        public CustomInternalFilter(String nameFilter) {
            this.nameFilter = nameFilter;
        }

        @Override
        public boolean accept(File dir, String name) {
            return name.contains(nameFilter);
        }
    }
}
