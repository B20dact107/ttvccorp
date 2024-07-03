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


public class Main {
    public static void main(String[] args) {
       HotelBookingSystem system= new MyHotelBookingSystem();
       HotelBookingSystem bookingSystem= new BookingAdapter(new BookingAPI());
       system.bookrom("Daovanlam ", "vip", LocalDate.MIN, LocalDate.MIN);
       bookingSystem.bookrom("Lam", "thuong", LocalDate.MIN, LocalDate.MIN);
    }
}

