package fr.unice.miage.monsch;

public class Main {

    public static void main(String[] args) {
        DirectoryPrinter directoryPrinter = new DirectoryPrinter();
        CustomFilter filter = new CustomFilter("");
        directoryPrinter.printFiles(".", filter,  "");
    }
}
