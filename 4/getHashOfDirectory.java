import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Scanner;

public class getHashOfDirectory {
    public static MessageDigest getHashOfFile(File file, MessageDigest complete) throws Exception{
        //create a buffer to calculate hash value
        byte[] buffer = new byte[1024];
        int numRead=0;
        FileInputStream is = new FileInputStream(file);
        while (numRead!=-1){
            numRead = is.read(buffer);
            //buffer get characters at the number of numRead
            if (numRead>0)
                complete.update(buffer,0,numRead);
        }
        is.close();
        return complete;
    }

    public static MessageDigest getHashOfDirectory(File file,MessageDigest complete) throws Exception {
        if (file.isDirectory()) {
            File[] files = file.listFiles(); // All files and subdirectories
            for (File f: files)
                complete = getHashOfDirectory(f, complete); // Recursive call
        }
        else if (file.isFile()){ // Base case
            complete = getHashOfFile(file,complete);
        }
        return complete;
    }


    public static void main(String[] args) throws Exception {
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        File file = new File(path);
        if(!file.isFile()&&!file.isDirectory()) {
            System.out.print("Given path is not effective!");
            return;
        }
        //use the SHA1 hash algorithm
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        getHashOfDirectory(file,complete);
        byte[] sha1 = complete.digest();
        StringBuilder result = new StringBuilder();
        for (byte b : sha1)
            result.append(Integer.toString(b & 0xFF, 16));
        System.out.print("Hash of the given directory is: "+result);
    }
}
