package fr.unice.miage.monsch.un.a;

public class Main {

    public static void main(String[] args) {
        DirectoryPrinter directoryPrinter = new DirectoryPrinter();
        CustomExternalFilter filter = new CustomExternalFilter("");
        //directoryPrinter.printFiles(".", filter,  "");
        //directoryPrinter.printFilesWithAnonymousFilter(".", "git");
        directoryPrinter.printFilesWithAnonymousFilter2(".", "git");
    }
}
