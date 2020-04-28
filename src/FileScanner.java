import java.io.*;

public class FileScanner {


    public String readInputFile(File file) throws IOException {
        StringBuilder input = new StringBuilder();
        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(file))) {
            String sCurrentLine;
            while ((sCurrentLine = inputFileReader.readLine()) != null) {
                input.append(sCurrentLine);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.valueOf(input);
    }


    public void writeOutputFile(File file, String output) {
        try {
            BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(file));
            outputFileWriter.write(output);
            outputFileWriter.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}










