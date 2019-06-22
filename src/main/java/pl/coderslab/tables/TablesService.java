package pl.coderslab.tables;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TablesService {

    @Autowired
    TablesRepository tablesRepository;

    public Tables findTableByName(String name) {
        return tablesRepository.findTableByName(name);
    }

}