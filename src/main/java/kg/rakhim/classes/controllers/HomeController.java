package kg.rakhim.classes.controllers;


import kg.rakhim.classes.dao.MovieDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
public class HomeController {
    private final MovieDAO movieDAO;

    @Autowired
    public HomeController(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("films", movieDAO.films());
        return "movie/index";
    }


    @GetMapping("/{id}")
    public String show(@PathVariable("id") String id, Model model){
        model.addAttribute("movie", movieDAO.show(id));
        return "movie/show";
    }
}
