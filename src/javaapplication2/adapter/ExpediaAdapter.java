/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.adapter;

/**
 *
 * @author Admin
 */
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class ExpediaAdapter implements HotelBookingSystem {
    private ExpediaAPI expediaAPI;

    public ExpediaAdapter(ExpediaAPI expediaAPI) {
        this.expediaAPI = expediaAPI;
    }

      

    @Override
    public void bookrom(String custername, String room, LocalDate cKin, LocalDate ckout) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startDate = dateFormat.format(cKin);
        String endDate = dateFormat.format(ckout);
        expediaAPI.makeReservation(custername, room, startDate, endDate);
    }
}
