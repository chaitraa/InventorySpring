package com.trial.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class availability {



    public int free;

    @Transient
    public String bookDate;
    @Field("bookDate")
    private LocalDate bookingDate;

    public void setBookDate(String bookDate)
    {
        this.bookingDate = LocalDate.parse(bookDate, DateTimeFormatter.ISO_DATE);
    }



    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public LocalDate getBookDate() {
        return bookingDate;
    }

   // public void setBookDate(LocalDate bookingDate) {
      //  this.bookingDate = bookingDate;
    //}



}
