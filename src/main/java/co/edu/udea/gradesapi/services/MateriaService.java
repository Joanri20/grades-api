package co.edu.udea.gradesapi.services;

import co.edu.udea.gradesapi.models.MateriaModel;
import co.edu.udea.gradesapi.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository materiaRepository;

    public ArrayList<MateriaModel> getMaterias(){
        return (ArrayList<MateriaModel>)  materiaRepository.findAll();
    }

    public MateriaModel saveMateria(MateriaModel materia){
        return materiaRepository.save(materia);
    }
}
