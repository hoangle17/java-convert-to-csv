import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ListReceived {
    private ArrayList<ReceivedFormat> arrayList;

    public void handleReceivedData(String path) {
        arrayList = new ArrayList<>();
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                ReceivedFormat receivedFormat;
                String data = myReader.nextLine();
                receivedFormat = readLineToObject(data);
                arrayList.add(receivedFormat);
            }
            myReader.close();
        } catch (FileNotFoundException | ParseException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).toString());
        }
    }

    public ReceivedFormat readLineToObject(String line) throws ParseException {
        LocalDate date;
        Date time;
        String station;
        int sensor;
        String value;
        String contain[] = line.split(",");
        date = convertToDate(contain[0]);
        time = convertToTime(contain[1]);
        station = contain[2];
        sensor = Integer.parseInt(contain[3]);
        value = contain[4];
        ReceivedFormat receivedFormat = new ReceivedFormat(date, time, station, sensor, value);
        return receivedFormat;
    }

    public Date convertToTime(String s) throws ParseException {
        Date time;
        DateFormat formatter = new SimpleDateFormat("hh:mm:ss");
        time = (Date) formatter.parse(s);
        return time;
    }

    public LocalDate convertToDate(String s) {
        LocalDate localDate = LocalDate.parse(s, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        return localDate;
    }
}
