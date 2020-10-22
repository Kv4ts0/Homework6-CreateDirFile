package BTU;
import rootFolder.makeRootFolder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        makeRootFolder mrf= new makeRootFolder();
        mrf.checkDisks();
        mrf.makeFolder();
        mrf.makeFiles();
        mrf.fileManipulation();
    }
}
