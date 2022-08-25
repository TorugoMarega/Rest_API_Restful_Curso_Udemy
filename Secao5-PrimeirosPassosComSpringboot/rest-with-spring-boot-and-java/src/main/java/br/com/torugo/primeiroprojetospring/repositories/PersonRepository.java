package br.com.torugo.primeiroprojetospring.repositories;

import br.com.torugo.primeiroprojetospring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
