package sg.edu.nus.iss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class App {
    public static void main(String[] args) throws IOException {

        // ArraySortExample arr = new ArraySortExample();
        // arr.example2();

        // CollectionSortExample coll = new CollectionSortExample();
        // coll.example2();

        // HashMapExample hash = new HashMapExample();
        // hash.example();
        
        // ConcurrentHashMapExample conHash = new ConcurrentHashMapExample();
        // conHash.example();

        // LinkedListExample lle = new LinkedListExample();
        // lle.example();

        // StackExample se = new StackExample();
        // se.example();

        
        String dirPath = "data";
        String fileName = "data.txt";

        //Create a directory
        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        if(isDirCreated) {
            System.out.println("New directory: " + dirPath + " created");
        } else {
            System.out.println("Directory " + dirPath + " already exists");
        }

        //Create a file in the directory created above
        File newFile = new File(dirPath + File.separator + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if(isFileCreated) {
            System.out.println("New file: " + fileName + " created");
        } else {
            System.out.println("File " + fileName + " already exists");
        }

        //List files under a directory
        File fileList[] = newDir.listFiles();
        for(File f : fileList) {
            System.out.println("File " + f.getPath() + ":" + f.getCanonicalFile());
        }

        FileOutputStream fos = new FileOutputStream(newFile);
        // FileWriter fw = new FileWriter(fos);
        for (int i=0; i<10; i++) {
            char str[] = Integer.toString(i).toCharArray();
            fos.write(str[0]);
            fos.write('\n');
        }

        String welcomeMessage = "Welcome to ISS TFIP Programme";

        //Covert string to byte array
        byte [] outputData = welcomeMessage.getBytes();
        //Writing the string in byte array, one character at a time to the file
        fos.write(outputData);

        fos.flush();
        fos.close();
    }
}