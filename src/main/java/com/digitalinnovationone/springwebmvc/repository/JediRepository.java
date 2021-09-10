package com.digitalinnovationone.springwebmvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.digitalinnovationone.springwebmvc.model.Jedi;

@Repository
public class JediRepository {

	private List<Jedi> jedi;

	public JediRepository() {
		jedi = new ArrayList<>();
		jedi.add(new Jedi("Luke", "Skywalker"));
	}

	public List<Jedi> getAllJedi() {

		return this.jedi;
	}

	public void add(Jedi jedi) {
		this.jedi.add(jedi);
	}

}
