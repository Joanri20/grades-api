package co.edu.udea.gradesapi.controllers;

import co.edu.udea.gradesapi.models.MateriaModel;
import co.edu.udea.gradesapi.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/materia")
public class MateriaController {
    @Autowired
    MateriaService materiaService;

    @GetMapping()
    public ArrayList<MateriaModel> getMaterias(){
        return materiaService.getMaterias();
    }

    @PostMapping()
    public MateriaModel saveMateria(@RequestBody MateriaModel materia){
        return this.materiaService.saveMateria(materia);
    }

}
