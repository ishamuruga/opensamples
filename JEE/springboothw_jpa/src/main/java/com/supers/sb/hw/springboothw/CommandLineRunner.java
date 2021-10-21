package com.supers.sb.hw.springboothw;

import java.util.Date;
import java.util.List;

import com.supers.sb.hw.springboothw.entity.AccountStatement;
import com.supers.sb.hw.springboothw.entity.BankAccount;
import com.supers.sb.hw.springboothw.entity.ChennaiZoo;
import com.supers.sb.hw.springboothw.entity.ContractEmployee;
import com.supers.sb.hw.springboothw.entity.Pen;
import com.supers.sb.hw.springboothw.entity.Pencil;
import com.supers.sb.hw.springboothw.entity.PermananetEmployee;
import com.supers.sb.hw.springboothw.entity.Person;
import com.supers.sb.hw.springboothw.entity.SingaporeZoo;
import com.supers.sb.hw.springboothw.repo.AccountStatementRepo;
import com.supers.sb.hw.springboothw.repo.CustomerRepository;
import com.supers.sb.hw.springboothw.repo.PersonRepository;
import com.supers.sb.hw.springboothw.repo.ProductRepo;
import com.supers.sb.hw.springboothw.repo.ZooRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	@Autowired
	private CustomerRepository repo;

	@Autowired
	private AccountStatementRepo aSrepo;

	@Autowired
	private PersonRepository personRepo;

	@Autowired
	private ProductRepo prodRepo;
	
	@Autowired
	private ZooRepo zooRepo;

	@Override
	public void run(String... args) throws Exception {

		for (int i = 0; i < 10; i++) {
			System.out.println("Hi From supers:-" + i);
		}

		repo.custom12manyjoin().forEach(System.out::println);

		// BankAccount ba = new BankAccount();
		// ba.setBankAcctNbr("ACC0.90397049372153084");

		// for (int k = 0; k < 20; k++) {
		// 	AccountStatement aStmt = new AccountStatement();
		// 	aStmt.setAmount(100 + k);
		// 	aStmt.setDescription("Description===" + Math.random());
		// 	aStmt.setbAccount(ba);
		// 	aStmt.setdOfTxn(new Date());
		// 	aSrepo.save(aStmt);
		// 	System.out.println("=============inserted ACcount statement.");
		// }

		// // aSrepo.custom12manyjoin("ACC0.90397049372153084").forEach(System.out::println);

		// PermananetEmployee pe = new PermananetEmployee();
		// pe.setEmail("rajk@gmai.com");
		// pe.setEmpId("123456");
		// pe.setLocation("CHN");
		// pe.setPfNumber("1124343433");

		// ContractEmployee ce = new ContractEmployee();
		// ce.setEmail("rajk1@gmai.com");
		// ce.setEmpId("132323456");
		// ce.setVendorCode("VN1242432");
		// ce.setdOfExit(new Date());

		// personRepo.save(ce);
		// personRepo.save(pe);

		// List<Person> lstPersons = personRepo.getPersons();
		// for (int i = 0; i < lstPersons.size(); i++) {
		// 	if (lstPersons.get(i) instanceof PermananetEmployee) {
		// 		PermananetEmployee pm = (PermananetEmployee) lstPersons.get(i);
		// 		System.out.println("PM==" + pm);
		// 	} else {
		// 		ContractEmployee ce1 = (ContractEmployee) lstPersons.get(i);
		// 		System.out.println("CE==" + ce1);
		// 	}
		// }

		// Pencil pl = new Pencil();
		// pl.setIsHB(true);
		// pl.setProdName("Nataraj Pencil");
		// pl.setType("5MM");

		// Pencil p2 = new Pencil();
		// p2.setIsHB(true);
		// p2.setProdName("Camlin Pencil");
		// p2.setType("7MM");

		// Pen pn = new Pen();
		// pn.setInkColor("blue");
		// pn.setIsGel(true);
		// pn.setProdName("Pilot Pen");

		// prodRepo.save(pl);
		// prodRepo.save(pn);
		// prodRepo.save(p2);


		// ChennaiZoo chnZoo = new ChennaiZoo();
		// chnZoo.setLocation("Vandaloor");
		// chnZoo.setnOfLions(10);
		// chnZoo.setnOfTigers(25);

		// SingaporeZoo singZoo = new SingaporeZoo();
		// singZoo.setLocation("gaylang");
		// singZoo.setnOfElephants(55);
		// singZoo.setnOfPython(15);

		// zooRepo.save(chnZoo);
		// zooRepo.save(singZoo);

		// System.out.println(zooRepo.findById(841).get().toString());

		System.out.println("Completed");
	}

}
