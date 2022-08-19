package com.apstore.api.pos.posapiserver2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apstore.api.pos.posapiserver2.model.Country;
import com.apstore.api.pos.posapiserver2.repo.CountryRepository;


@Service
@Transactional
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryRepository repo;

	@Override
	public List<Country> getCountries() {
		return repo.findAll();
	}

}
