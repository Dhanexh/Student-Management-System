package com.dhanesh.StudentPortal.service;

import com.dhanesh.StudentPortal.model.Address;
import com.dhanesh.StudentPortal.model.Student;
import com.dhanesh.StudentPortal.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(List<Address> address) {
        addressRepo.saveAll(address);
        return "Address added";
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public String updateAddress(Long id, String landMark, String zipcode,
                                String district, String state, String country) {
        Address address = addressRepo.findById(id).get();
        address.setLandmark(landMark);
        address.setZipcode(zipcode);
        address.setDistrict(district);
        address.setState(state);
        address.setCountry(country);
        return "Address updated";
    }

    public String removeAddress(Long id) {
        addressRepo.deleteById(id);
        return "Address removed";

    }
}
