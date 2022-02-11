package com.mycompany.mybankapi.repo;

import java.util.List;

import com.mycompany.mybankapi.model.College;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<College,Long> {

    @Query(value = "from com.mycompany.mybankapi.model.College")
    public List<College> fetchAll();

    @Query(value = "from DeemedUniv d where d.name=:xyzname")
    public List<College> fetchDeemedUniv(String xyzname);
}
