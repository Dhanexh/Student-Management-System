package com.dhanesh.StudentPortal.repository;

import com.dhanesh.StudentPortal.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILapotopRepo extends JpaRepository<Laptop,Long> {
}
