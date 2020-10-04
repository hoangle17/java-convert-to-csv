import java.io.*;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class ConvertFile {
    public static void main(String[] args) throws ParseException {
//        String namefile = "new.txt";
//        String path = "../filecsv/";
//        writeFile(path + namefile);
//        readFile(path + namefile);
        LocalDate localDate1 = LocalDate.parse("09/17/2020",
                DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(localDate1);
        String s = "09/17/2020";
        LocalDate localDate = convertToDate(s);
        System.out.println(localDate.getDayOfMonth());
    }
    public static LocalDate convertToDate(String s) {
        LocalDate localDate = LocalDate.parse(s,
                DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        return localDate;
    }

//    public static void writeFile(String path) {
//        try {
//            PrintWriter printWriter = new PrintWriter(path, "UTF-8");
//            printWriter.println(100);
//            printWriter.println(100);
//            printWriter.println(100);
//            printWriter.println(100);
//
//            printWriter.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public static void readFile(String path) {
//        try {
//            File myObj = new File(path);
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
}
