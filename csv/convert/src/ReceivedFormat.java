import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

public class ReceivedFormat {
    private LocalDate date;
    private Date time;
    private String nameStation;
    private int idSensor;
    private float value;


    public ReceivedFormat(LocalDate date, Date time, String nameStation, int idSensor, float value) {
        this.date = date;
        this.time = time;
        this.nameStation = nameStation;
        this.idSensor = idSensor;
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        this.nameStation = nameStation;
    }

    public int getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(int idSensor) {
        this.idSensor = idSensor;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
