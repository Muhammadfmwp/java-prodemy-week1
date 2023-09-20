import java.time.*;
public class MyDate {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) throws Exception {
        if (day < 1 || day > 31) {
            throw new Exception("Tanggal hari salah");
        }
        else {
            this.day = day;
        }
    }

    public void setMonth(int month) throws Exception {
        if (month < 1 || month > 12) {
            throw new Exception("Bulan salah");
        }
        else {
            this.month = month;
        }
    }

    public void setYear(int year) throws Exception {
        Year tahunIni = Year.now();
        int tahunIniInt = tahunIni.getValue();
        if (year > tahunIniInt) {
            throw new Exception("Tahun melebihi tahun " + tahunIniInt);
        }
        else {
            this.year = year;
        }
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return this.day + "-" + this.month + "-" + this.year;
    }
}
