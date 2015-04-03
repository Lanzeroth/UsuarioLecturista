package com.fourtails.usuariolecturista.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.api.client.util.DateTime;

/**
 * Created by Vazh on 12/2/2015.
 */
@Table(name = "ChartReadings")
public class ChartReading extends Model {

    @Column
    public int day;
    @Column
    public int month;
    @Column
    public int year;
    @Column
    public long value;
    @Column
    public DateTime dateTime;
    @Column
    public String urlSafeKey;
    @Column
    public String accountNumber;

    public ChartReading(int day, int month, int year, DateTime dateTime, long value, String urlSafeKey, String accountNumber) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dateTime = dateTime;
        this.value = value;
        this.urlSafeKey = urlSafeKey;
        this.accountNumber = accountNumber;
    }

    public ChartReading() {
        super();
    }
}
