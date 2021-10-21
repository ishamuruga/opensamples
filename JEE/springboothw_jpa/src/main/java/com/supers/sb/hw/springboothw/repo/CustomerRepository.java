package com.supers.sb.hw.springboothw.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.supers.sb.hw.springboothw.entity.Customer;
import com.supers.sb.hw.springboothw.entity.CustomJoin;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	public List<Customer> findByName(String name);
	
	public List<Customer> findByEmail(String email);
	
	@Query(value = "select c from Customer c where c.name=:name or c.email=:email")
	public List<Customer> findByEmailNameAndAge(String name, String email);
	
	@Query(value = "select new com.supers.sb.hw.springboothw.entity.CustomJoin(c.name,c.email,c.age,c.dob) from Customer as c left join c.bankAccounts as ba")
	public List<CustomJoin> custom12manyjoin();

	@Modifying
	@Query(value="update customer c set c.email=:email where c.name=:name")
	public void updateCustomer(String name,String email);

	//@Query(value="select cust.name,cust.age,cust.email,act.accnbr from tbl_Customer cust left outer join tbl_Account act on act.custid = cust.id and cust.name like concat('%',:name,'%')",nativeQuery="true") 
	//public List<Object[]> custom12manyjoin2();

	
	 
}
