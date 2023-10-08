package com.dhanesh.StudentPortal.controller;

import com.dhanesh.StudentPortal.model.Laptop;
import com.dhanesh.StudentPortal.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping("laptops")
    public String addLaptops(@RequestBody List<Laptop> laptops){
        return laptopService.addLaptops(laptops);
    }

    @GetMapping("laptops")
    public List<Laptop> getAllStudents(){
        return laptopService.getAllLaptops();
    }

    @PutMapping("laptop/{id}")
    public String updateLaptop(@PathVariable Long id,@RequestBody String name,
                                @RequestBody String branch, @RequestBody Integer price){
        return laptopService.updateLaptop(id,name,branch,price);
    }

    @DeleteMapping("laptop/{id}")
    public String removeLaptop(@PathVariable Long id){
        return laptopService.removeLaptop(id);
    }
}
