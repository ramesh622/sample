package com.hackerrank.stereotypes.repository;


import com.hackerrank.stereotypes.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ContactRepository extends JpaRepository<Person,Integer> {
}
