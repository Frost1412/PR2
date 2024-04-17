package PR2.tut10;

import javax.swing.*;
import java.io.*;

public class XFile {
//    *Read binary file
//    @param path the path of the file to read
//    @return the read data
//    @throws IOE exception if an error occurs while reading the file
//

   public static byte[] read(String path)  {
       try {
           FileInputStream fis = new FileInputStream(path);
           int n = fis.available();
           byte[] data = new byte[n];
           fis.read(data);
           fis.close();
           return data;

       } catch (IOException e) {
        throw new RuntimeException("loi roi ban oi1");
       }

   }


//   Write binary file
//    @param path the path of the file to write
//    @param data the data to write the file
//    @throws IOException if an error occurs while writing the file
   public static void write (String path, byte[] data)  {
       try {
           FileOutputStream fos = new FileOutputStream(path);
           fos.write(data);
           fos.close();
       } catch (IOException e) {
           throw new RuntimeException("Loi roi ban oi");
       }
   }


//   Read object file
//   @param path the path of the file to read
//   @return the read object
//   @throws IOException if an error occurs while reading the file

    public static Object readObject(String path) {
       try{
           ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
           Object object = ois.readObject();
           ois.close();
           return object;
       } catch(IOException | ClassNotFoundException e) {
           throw  new RuntimeException("Loi roi ban oi");
       }

    }

    public static void writeObject(String path, Object object) {
       try{
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
           oos.writeObject(object);
           oos.close();
       } catch(IOException e) {
           throw new RuntimeException("Loi ban roi oi");
       }

    }




}
