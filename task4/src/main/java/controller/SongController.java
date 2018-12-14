package controller;

import entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import services.SongService;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class SongController {

    @Autowired
    private SongService songService;

    @RequestMapping("/")
    public String userForm(Locale locale, Model model) {

        model.addAttribute("song", new Song());
        model.addAttribute("songs", songService.list());

        return "songForm";
    }

    @RequestMapping("/saveSong")
    public String saveUser(@ModelAttribute("song") @Valid Song song,
                           BindingResult result, Model model) {

        if (result.hasErrors()) {

            model.addAttribute("songs", songService.list());
            return "songForm";
        }

        songService.save(song);

        return "redirect:/";
    }
}
