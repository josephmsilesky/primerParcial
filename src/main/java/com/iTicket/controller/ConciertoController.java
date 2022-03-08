package com.iTIcket.controller;

import com.iTIcket.entity.Concierto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.iTIcket.service.IConciertoService;

@Controller
public class ConciertoController {

    @Autowired
    private IConciertoService conciertoService;

    @GetMapping("/conciertos")
    public String index(Model model) {
        List<Concierto> listaConciertos = conciertoService.getAllConciertos();
        model.addAttribute("titulo", "Conciertos");
        model.addAttribute("conciertos", listaConciertos);
        return "conciertos";
    }

    @GetMapping("nuevoConcierto")
    public String crearConcierto(Model model) {
        model.addAttribute("concierto", new Concierto());
        return "nuevoConcierto";
    }

    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concierto concierto) {
        conciertoService.saveConcierto(concierto);
        return "redirect:/conciertos";
    }

    @GetMapping("/delete/{id}")
    public String eliminarConcierto(@PathVariable("id") Long idconcierto) {
        conciertoService.delete(idconcierto);
        return "redirect:/conciertos";
    }

}
