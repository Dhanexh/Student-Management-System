package com.dhanesh.StudentPortal.service;

import com.dhanesh.StudentPortal.model.Laptop;
import com.dhanesh.StudentPortal.model.Student;
import com.dhanesh.StudentPortal.repository.ILapotopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILapotopRepo laptopRepo;

    public String addLaptops(List<Laptop> laptops) {
        laptopRepo.saveAll(laptops);
        return "Laptops added";
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public String updateLaptop(Long id, String name, String brand, Integer price) {
        Laptop laptop = laptopRepo.findById(id).get();
        laptop.setName(name);
        laptop.setBrand(brand);
        laptop.setPrice(price);
        return "Laptop updated";
    }

    public String removeLaptop(Long id) {
        laptopRepo.deleteById(id);
        return "Laptop removed";

    }
}
