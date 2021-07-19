package one.digin.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digin.api.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
