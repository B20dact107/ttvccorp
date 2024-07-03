/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.adapter;

/**
 *
 * @author Admin
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class BookingAdapter implements HotelBookingSystem{
    private BookingAPI bookingAPI;

    public BookingAdapter(BookingAPI bookingAPI) {
        this.bookingAPI = bookingAPI;
    }
    

    @Override
    public void bookrom(String custername, String room, LocalDate cKin, LocalDate ckout) {
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("YYYY-MM-DD");
        String form=cKin.format(dateTimeFormatter);
        String to = ckout.format(dateTimeFormatter);
        bookingAPI.creabooking(custername, room, form, to);
    }
    
    

   
    
}


















// @Override
//    public void bookrom(String clientname, String room, LocalDate cKin, LocalDate ckout) {
//         DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        String to = cKin.format(dateTimeFormatter);
//        String from=ckout.format(dateTimeFormatter);
//        BookingAPI.creabooking(clientname, room, to, from);
//    }