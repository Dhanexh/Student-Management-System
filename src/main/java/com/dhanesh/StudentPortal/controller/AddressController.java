package com.dhanesh.StudentPortal.controller;

import com.dhanesh.StudentPortal.model.Address;
import com.dhanesh.StudentPortal.model.Student;
import com.dhanesh.StudentPortal.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody List<Address> address){
        return addressService.addAddress(address);
    }

    @GetMapping("address")
    public List<Address> getAllStudents(){
        return addressService.getAllAddress();
    }

    @PutMapping("address/{id}")
    public String updateAddress(@PathVariable Long id,@RequestBody String landmark,
                                @RequestBody String zipcode,@RequestBody String district,
                                @RequestBody String state, @RequestBody String country){
        return addressService.updateAddress(id,landmark,zipcode,district,state,country);
    }

    @DeleteMapping("address/{id}")
    public String removeAddress(@PathVariable Long id){
        return addressService.removeAddress(id);
    }
}
