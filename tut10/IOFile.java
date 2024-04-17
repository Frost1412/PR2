package PR2.tut10;

import java.io.*;

public class IOFile {
    private String filename;


    public IOFile(String filename) {
        this.filename = filename;
    }

//    public void write(OutputStream os)  {
//    try {
//        os.write(filename.getBytes());
//
//    } catch (IOException e) {
//        throw new RuntimeException("toi on ma ban");
//    }
//    }

    public void write(OutputStream os) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void print() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int countLines() {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
        return count;
    }

    public void copy(String newFilename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
             BufferedWriter writer = new BufferedWriter(new FileWriter(newFilename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(String path) {
        File file = new File(path);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }



}
