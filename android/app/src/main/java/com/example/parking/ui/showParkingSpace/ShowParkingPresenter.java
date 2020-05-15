package com.example.parking.ui.showParkingSpace;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.example.parking.dao.ParkingRequestDAO;
import com.example.parking.dao.ParkingSpaceDAO;
import com.example.parking.dao.RatingDAO;
import com.example.parking.dao.UserDAO;
import com.example.parking.domain.ParkingRequest;
import com.example.parking.domain.ParkingSpace;
import com.example.parking.domain.User;
import com.example.parking.memorydao.MemoryInitializer;
import com.example.parking.util.Pin;
import com.example.parking.util.TimeRange;

import java.time.LocalDateTime;

public class ShowParkingPresenter {
    ShowParkingView view;
    UserDAO userDAO;
    ParkingSpaceDAO parkingDAO;
    ParkingRequestDAO parkingRequestDAO;
    RatingDAO ratingsDAO;
    User user;
    ParkingSpace space;
    @RequiresApi(api = Build.VERSION_CODES.O)
    public ShowParkingPresenter(ShowParkingView view, UserDAO userDAO, ParkingSpaceDAO parkingDAO, ParkingRequestDAO parkingRequestDAO, RatingDAO ratingsDAO, ParkingSpace space) {
        this.view = view;
        this.userDAO = userDAO;
        this.space=space;
        user = userDAO.find(space.getParkedUser().getUsername());
        this.parkingDAO = parkingDAO;
        this.ratingsDAO=ratingsDAO;
        this.parkingRequestDAO = parkingRequestDAO;
        view.setAddress(space.getAddress().getStreet()+" "+space.getAddress().getStreetNumber()+" ,"+space.getAddress().getZipCode().getZip());
        view.setParkedUser(user.getUsername());
        view.setVehicle(space.getPlate());
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    void add(ParkingSpace parkingSpace){
        parkingRequestDAO.save(new ParkingRequest(new TimeRange(LocalDateTime.now(),30),new Pin(), userDAO.find(view.getRequestingUser()),parkingSpace));
        }

}