import java.io.*;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ConvertFile {
    public static void main(String[] args) throws ParseException {
        String receivedFile = "filetxt/new.txt";
//        String resultFile = "filecsv/new.csv";

//        readFile(receivedFile);
//        writeFile(resultFile);

        ListReceived listReceived = new ListReceived();
        listReceived.handleReceivedData(receivedFile);
//        write date to cvs
//        int month = localDate.getMonthValue();
//        String months = (month<10?("0"+month):(String.valueOf(month)));
//        System.out.println(months);

//        write time to file csv
//        String s = "09:45:00";
//        int second = convertToTime(s).getSeconds();
//        String seconds = (second<10?("0"+second):(String.valueOf(second)));
//        System.out.println(seconds);
//        int hour = convertToTime(s).getHours();
//        String hours = (hour<10?("0"+hour):(String.valueOf(hour)));
//        System.out.println(hours);
//        System.out.println(convertToTime(s).getMinutes());


    }

    public static void writeFile(String path) {
        try {
            PrintWriter printWriter = new PrintWriter(path, "UTF-8");
            printWriter.println(100);
            printWriter.println(100);
            printWriter.println(100);
            printWriter.println(100);
//        writeFile(path + namefile);

            printWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readFile(String path) {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
