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

    public ListReceived(ArrayList<ReceivedFormat> arrayList) {
        this.arrayList = arrayList;
    }

    public void handleReceivedData(String path) {
        arrayList = new ArrayList<>();
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

    public void readLineToObject(String line) {
        LocalDate date;
        Date time;
        String station;
        int sensor;
        float value;
        String contain[] = line.split(",");
//        contain[1] = convertToTime();
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
