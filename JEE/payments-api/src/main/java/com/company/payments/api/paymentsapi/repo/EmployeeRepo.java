package com.company.payments.api.paymentsapi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.company.payments.api.paymentsapi.entity.inh.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String> {
    @Query(value = "from com.company.payments.api.paymentsapi.entity.inh.Employee e where e.name=:nme")
    public List<Employee> findByName(String nme);

    /**
     * Called as PolyGraphic Queries
     * @return
     */
    @Query(value = "from com.company.payments.api.paymentsapi.entity.inh.Employee")
    public List<Employee> findMyAll();
}
