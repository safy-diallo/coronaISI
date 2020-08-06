package hasa.hafia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hasa.hafia.entities.Cas;

@Repository
public interface CasRepository extends JpaRepository<Cas, Long> {

}
