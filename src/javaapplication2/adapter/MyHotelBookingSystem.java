/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.adapter;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class MyHotelBookingSystem implements HotelBookingSystem{

    @Override
    public void bookrom(String custername, String room, LocalDate cKin, LocalDate ckout) {
        System.out.println("Ban da dat phong o "+ custername+"loai phong "+room);
    }

    
    
}
