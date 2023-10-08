package com.dhanesh.StudentPortal.repository;

import com.dhanesh.StudentPortal.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
