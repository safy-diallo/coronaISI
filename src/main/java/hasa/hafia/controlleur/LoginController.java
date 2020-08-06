package hasa.hafia.controlleur;

import hasa.hafia.dao.UtilisateurRepository;
import hasa.hafia.entities.LoginRequest;
import hasa.hafia.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired private UtilisateurRepository repository;
    @GetMapping
    public String login(Model model){
        model.addAttribute("request", new LoginRequest());
        return "login";
    }

    @PostMapping
    public String login(@ModelAttribute("request") LoginRequest request){
        Utilisateur utilisateur = repository.getByUsername(request.getUsername()).orElseThrow(() -> new RuntimeException("ce nom d'utilisateur n'exist pas"));
        if (utilisateur.getPassword().equals(request.getPassword())){
            return "redirect:/covid/cas";
        }
        return "redirect:/login";
    }
}