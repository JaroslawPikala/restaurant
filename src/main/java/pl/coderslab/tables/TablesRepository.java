package pl.coderslab.tables;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TablesRepository extends JpaRepository<Tables, Long> {

    Tables findTableByName(String name);
}
