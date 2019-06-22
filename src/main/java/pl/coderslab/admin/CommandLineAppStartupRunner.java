package pl.coderslab.admin;

import org.springframework.beans.factory.annotation.Autowired;


public class CommandLineAppStartupRunner {



    private AdminRepository repository;

    public CommandLineAppStartupRunner(AdminRepository repository) {
        this.repository = repository;
    }

    public void run(String...args) throws Exception {

        if(repository.findByUsername("jarek")==null) {
            Admin admin = new Admin();
            admin.setUsername("jarek");
            admin.setPassword("jarek");
            repository.save(admin);
        }
    }

}
