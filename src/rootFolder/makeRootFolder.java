package rootFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
import java.nio.file.FileAlreadyExistsException;

public class makeRootFolder {
    private String [] diskDrives;
    private double Size = Math.pow(1024, 3);
    int diskNumber = 0;

    public void checkDisks(){
        File[] f = File.listRoots();
        for(int i=0; i<f.length; i++){
            System.out.println((i+1) + " " + f[i] + " " + f[i].getTotalSpace()/Size + " " + f[i].getUsableSpace()/Size);
        }
    }

    public void makeFolder() throws IOException {
        System.out.println("Choose the disk number");
        Scanner sc = new Scanner(System.in);
        diskNumber = sc.nextInt();
        if (diskNumber == 1) {
            Path path = Paths.get("c:/CdirFile");
            Files.createDirectories(path);
            Path path1 = Paths.get("./src/Directories/CdirFile");
            Files.createDirectories(path1);
            System.out.println("Dir is created");
        } else if (diskNumber == 2) {
            Path path = Paths.get("d:/DdirFile");
            Files.createDirectories(path);
            Path path1 = Paths.get("./src/Directories/DdirFile");
            Files.createDirectories(path1);
            System.out.println("Dir is created");
        } else if (diskNumber == 3) {
            Path path = Paths.get("f:/FdirFile");
            Files.createDirectories(path);
            Path path1 = Paths.get("./src/Directories/FdirFile");
            Files.createDirectories(path1);
            System.out.println("Dir is created");
        }
        else
            System.out.println("Failed to create directory");
    }

    public void makeFiles() throws IOException {
        Scanner sc = new Scanner(System.in);
        if (diskNumber == 1) {
            Path path = Paths.get("c:/CdirFile/cfile.txt");
            Files.createFile(path);
            Path path1 = Paths.get("./src/Directories/CdirFile/cfile.txt");
            Files.createFile(path1);
            Path path2 = Paths.get("./src/Files/cfile.txt");
            Files.createFile(path2);
            System.out.println("File is created");
        } else if (diskNumber == 2) {
            Path path = Paths.get("d:/DdirFile/dfile.txt");
            Files.createFile(path);
            Path path1 = Paths.get("./src/Directories/DdirFile/dfile.txt");
            Files.createFile(path1);
            Path path2 = Paths.get("./src/Files/dfile.txt");
            Files.createFile(path2);
            System.out.println("File is created");
        } else if (diskNumber == 3) {
            Path path = Paths.get("f:/FdirFile/ffile.txt");
            Files.createFile(path);
            Path path1 = Paths.get("./src/Directories/FdirFile/ffile.txt");
            Files.createFile(path1);
            Path path2 = Paths.get("./src/Files/ffile.txt");
            Files.createFile(path2);
            System.out.println("File is created");
        }
    }
    public void fileManipulation() throws IOException {
        if (diskNumber == 1) {
            Path path1 = Paths.get("./src/ctext1.txt");
            Path path2 = Paths.get("./src/fileManipulation/ctext1.txt");
            Files.createFile(path1);
            Files.move(path1,path2, StandardCopyOption.REPLACE_EXISTING);
        }
        else if (diskNumber == 2) {
            Path path1 = Paths.get("./src/BTU/dtext.txt");
            Path path2 = Paths.get("./src/fileManipulation/dtext1.txt");
            Files.createFile(path1);
            Files.move(path1,path2, StandardCopyOption.REPLACE_EXISTING);
        }
        else if (diskNumber == 3) {
            Path path1 = Paths.get("./src/rootFolder/ftext.txt");
            Path path2 = Paths.get("./src/fileManipulation/ftext1.txt");
            Files.createFile(path1);
            Files.move(path1,path2, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
