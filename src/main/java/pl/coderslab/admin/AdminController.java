package pl.coderslab.admin;


import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.reservation.Reservation;
import pl.coderslab.reservation.ReservationRepository;
import pl.coderslab.reservation.ReservationService;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@SessionAttributes("adminSession")
public class AdminController {


    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/login")
    public String login() {
        try {
            CommandLineAppStartupRunner runner = new CommandLineAppStartupRunner(adminRepository);
            runner.run();
        }catch (Exception e){e.printStackTrace();}

        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {

        Admin admin = adminRepository.findByUsername(username);
        model.addAttribute("isLogged", false);
        if (BCrypt.checkpw(password, admin.getPassword())) {
            model.addAttribute("adminSession", admin);
            return "redirect:/panel";
        } else {
            return "login";
        }
    }
    @GetMapping("/panel")
    public String panel(){
        return "admin";
    }

    @GetMapping("/panel/list")
    public String list(Model model){
        List<Reservation> reservationList = reservationRepository.findAll();
        model.addAttribute("reservations", reservationList);
        return "reservationList";
    }

    @GetMapping("/panel/delete/{id}")
    public String delete(@PathVariable Long id) {
        reservationService.delete(id);
        return "redirect:../list";
    }

}
