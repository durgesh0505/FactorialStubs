import java.io.File;
import java.io.IOException;


public class FactorialStubs{

    public static final String INPUT_FILE = "file.txt";
    public static final String OUTPUT_FILE = "output.txt";
    public static FileScanner fileScan = new FileScanner();
    private static String readFileInput = null;

    public static void main(String[] args) throws IOException {



        if (FileConnection(new File(INPUT_FILE)) == false){
            System.out.println("No file has been found!\nFix the file locaton and run again");
            System.exit(1);
        } else {
            try {
                readFileInput = fileScan.readInputFile(new File(INPUT_FILE));
            } catch (NullPointerException e){
                e.printStackTrace();
            }
        }


        if(readFileInput.isEmpty()){
            System.out.println("The file is empty!\nAdd input the file and run again.");
            System.exit(2);
        }
        else {
            System.out.println("Reading data from the input file...");
        }


        //print input data from input file
        System.out.println("Input: " + readFileInput);


        //perform factorial methods and print
        int factorial = Factorial(Integer.parseInt(readFileInput));
        System.out.println("Factorial Solution: " + factorial);

        //write the solution to the output file
        fileScan.writeOutputFile(new File(OUTPUT_FILE), String.valueOf(factorial));
        String readFileOutput = fileScan.readInputFile(new File(OUTPUT_FILE));
        System.out.println("Output file data: "+readFileOutput);


        // Check input file connection
        boolean inputFileCheck = FileConnection(new File(INPUT_FILE));
        System.out.println("FileConnection Test: " + inputFileCheck);
        //check output file and data
        boolean outputFileDataCheck = output(new File(OUTPUT_FILE), factorial);
        System.out.println("Output Test: " + outputFileDataCheck);

        System.out.println("\nThe Solution has been saved to the output.txt file");

    }

    //Takes input from file to be used in Factorial
    public static boolean FileConnection(File file) {
        boolean connect = false;
        try {
            if(file.exists()){
                connect = true;
            }
        } catch (NullPointerException e){
            System.out.println("No data in file");
        }
        return connect;
    }

    // Does calculation of Factorial
    public static int Factorial(int number) {
        int fact = 1;
        if (number > 1){
            for (int i = 2; i <= number; i++) {
                fact = fact * i;
            }
        } else if( number < 0){
            for (int i = 2; i <= Math.abs(number); i++) {
                fact = fact * i;
            }
            fact = -fact;
        }

        return fact;
    }

    // returns a file with the output of factorial
    public static boolean output(File file, int F){
        boolean result = false;
        String readFile = null;
        try {
            if(file.exists()){
                result = true;
                readFile = fileScan.readInputFile(file);
            }
            if(file.exists() && readFile.equals(String.valueOf(F))){
                result = true;
            }
        } catch (NullPointerException | IOException e){

        }

        return result;
    }


    //Syntax Coverage
    //AOR:  fact = fact + i;
    public static int FactorialMutant1(int number) {
        int fact = 1;
        if (number > 1){
            for (int i = 2; i <= number; i++) {
                fact = fact + i;
            }
        } else if( number < 0){
            for (int i = 2; i <= Math.abs(number); i++) {
                fact = fact * i;
            }
            fact = -fact;
        }

        return fact;
    }

    //ROR:  else if( number <= 0){
    public static int FactorialMutant2(int number) {
        int fact = 1;
        if (number > 1){
            for (int i = 2; i <= number; i++) {
                fact = fact * i;
            }
        } else if( number <= 0){
            for (int i = 2; i <= Math.abs(number); i++) {
                fact = fact * i;
            }
            fact = -fact;
        }

        return fact;
    }

    //UOI:  fact = fact * -i;
    public static int FactorialMutant3(int number) {
        int fact = 1;
        if (number > 1){
            for (int i = 2; i <= number; i++) {
                fact = fact * -i;
            }
        } else if( number <= 0){
            for (int i = 2; i <= Math.abs(number); i++) {
                fact = fact * i;
            }
            fact = -fact;
        }

        return fact;
    }

    //SVR:  fact = number * i;
    public static int FactorialMutant4(int number) {
        int fact = 1;
        if (number > 1){
            for (int i = 2; i <= number; i++) {
                fact = number * i;
            }
        } else if( number < 0){
            for (int i = 2; i <= Math.abs(number); i++) {
                fact = fact * i;
            }
            fact = -fact;
        }

        return fact;
    }

    //ROR:  if (number < 1){
    public static int FactorialMutant5(int number) {
        int fact = 1;
        if (number < 1){
            for (int i = 2; i <= number; i++) {
                fact = fact * i;
            }
        } else if( number < 0){
            for (int i = 2; i <= Math.abs(number); i++) {
                fact = fact * i;
            }
            fact = -fact;
        }

        return fact;
    }

    //ROR:  for (int i = 2; i < number; i++) {
    public static int FactorialMutant6(int number) {
        int fact = 1;
        if (number > 1){
            for (int i = 2; i < number; i++) {
                fact = fact * i;
            }
        } else if( number < 0){
            for (int i = 2; i <= Math.abs(number); i++) {
                fact = fact * i;
            }
            fact = -fact;
        }

        return fact;
    }


}
