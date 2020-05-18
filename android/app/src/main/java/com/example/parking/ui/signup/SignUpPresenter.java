package com.example.parking.ui.signup;

import android.util.Log;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.Toast;

import com.example.parking.R;
import com.example.parking.dao.UserDAO;
import com.example.parking.domain.Address;
import com.example.parking.domain.Rating;
import com.example.parking.domain.User;
import com.example.parking.domain.Vehicle;
import com.example.parking.util.Credits;
import com.example.parking.util.ZipCode;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class SignUpPresenter {
    private SignUpView view;
    private UserDAO dao;
    public SignUpPresenter(SignUpView view, UserDAO dao){
        this.view=view;
        this.dao=dao;
    }
    public void add() {
        if (validateName() && validateLast() && validatePhone() && validateEmail() && validateUsername() && validatePassword() && validateZipCode() && validateStreet() && validateStreetNo()) {
            Address address = new Address(view.getStreet(), view.getStrN(), new ZipCode(Integer.valueOf(view.getZipCode())));
            User user = new User(view.getName(), view.getSurname(), view.getPhone(), view.getEmail(), view.getUsername(), view.getPassword(), new Credits(10), address, new ArrayList<Rating>(), new ArrayList<Vehicle>());
            dao.save(user);
            User us = dao.find(user.getUsername());
            view.successfullyFinishActivity("registered");

        } else {
            view.makeToast("Please recheck your fields!");
        }
    }


    private boolean validatePhone(){
        String phone = view.getPhone().trim();
        if(phone.isEmpty()){
            view.setError("phone","Phone cannot be empty");
            return false;
        }else if(phone.length()!=10){
            view.setError("phone","Phone must be 10 digits");
            return false;
        }else{
            view.setError("phone",null);
            //Toast.makeText(this,"Phone added",Toast.LENGTH_SHORT).show();
            return true;
        }
    }

    private boolean validateZipCode(){
        String zipCode = view.getZipCode().trim();
        if(zipCode.isEmpty()){
            view.setError("zip","ZIP Code cannot be empty");
            return false;
        }else if(zipCode.length()!=5){
            view.setError("zip","ZIP Code must be 5 digits");
            return false;
        }else{
            view.setError("zip",null);
           // Toast.makeText(this,"ZIP Code added",Toast.LENGTH_SHORT).show();
            return true;
        }
    }

    private boolean validateName(){
        String name = view.getName().trim();
        if(name.isEmpty()){
            view.setError("firstname","Name cannot be empty");
            return false;
        }else{
            view.setError("firstname",null);
            //Toast.makeText(this,"Name added",Toast.LENGTH_SHORT).show();
            return true;
        }
    }

    private boolean validateLast(){
        String last = view.getSurname().trim();

        if(last.isEmpty()){
            view.setError("lastname","Last name cannot be empty");
            return false;
        }else{
            view.setError("lastname",null);
            //Toast.makeText(this,"Last name added",Toast.LENGTH_SHORT).show();
            return true;
        }
    }

    private boolean validateEmail(){
        String email = view.getEmail().trim();
        Pattern EMAIL_ADDRESS =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        if(email.isEmpty()){
            view.setError("email","Email cannot be empty");
            return false;
        }else if(!EMAIL_ADDRESS.matcher((CharSequence)email).matches()){
            view.setError("email","Invalid email");
            return false;
        }else{
            view.setError("email",null);
            view.makeToast("Email added");
            return true;
        }
    }

    private boolean validateUsername(){
        String username = view.getUsername().trim();
        if(username.isEmpty()){
            view.setError("username","Username cannot be empty");
            return false;
        }else if(username.length()<=3){
            view.setError("username","Username must be more than 3 characters");
            return false;
        }else{
            view.setError("username",null);
            view.makeToast("Username added");
            return true;
        }
    }

    private boolean validatePassword() {
        String password = view.getPassword().trim();
        Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9\\!\\@\\#\\$]{8,24}");
        if(password.isEmpty()){
            view.setError("password","Password cannot be empty");
            return false;
        }else if(!PASSWORD_PATTERN.matcher(password).matches()){
            view.setError("password","Password must contain minimum 8 characters at least 1 Alphabet, 1 Number and 1 Special Character");
            return false;
        }else{
            view.setError("password",null);
            view.makeToast("Password added");
            return true;
        }
    }

    private boolean validateStreet() {
        String street = view.getStreet().trim();
        if(street.isEmpty()){
            view.setError("street","Street cannot be empty");
            return false;
        }else{
            view.setError("street",null);
            view.makeToast("Street added");
            return true;
        }
    }

    private boolean validateStreetNo() {
        String streetno = view.getStrN().trim();
        if(streetno.isEmpty()){
            view.setError("streetno","Street Number cannot be empty");
            return false;
        }else{
            view.setError("streetno",null);
            view.makeToast("Street Number added");
            return true;
        }
    }
}
