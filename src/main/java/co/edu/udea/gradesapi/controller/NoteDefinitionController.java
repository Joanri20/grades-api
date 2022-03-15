package co.edu.udea.gradesapi.controller;


import co.edu.udea.gradesapi.model.NoteDefinition;
import co.edu.udea.gradesapi.model.Subject;
import co.edu.udea.gradesapi.model.dto.NoteDefinitionDto;
import co.edu.udea.gradesapi.model.dto.SubjectDto;
import co.edu.udea.gradesapi.model.mapper.NoteDefinitionMapper;
import co.edu.udea.gradesapi.service.NoteDefinitionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;
import java.util.stream.Collectors;

import static co.edu.udea.gradesapi.config.SwaggerConfig.BASIC_AUTH_SECURITY_SCHEME;

@RequiredArgsConstructor
@RestController
@RequestMapping("/notesdefinitions")
public class NoteDefinitionController {

    private final NoteDefinitionService noteDefinitionService;
    private final NoteDefinitionMapper noteDefinitionMapper;

    @Operation(security = {@SecurityRequirement(name = BASIC_AUTH_SECURITY_SCHEME)})
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public NoteDefinitionDto createNoteDefinition(@Valid @RequestBody NoteDefinitionDto noteDefinitionDto) {
        NoteDefinition noteDefinition = noteDefinitionMapper.noteDefinitionDtoToNoteDefinition(noteDefinitionDto);
        return noteDefinitionMapper.noteDefinitionToNoteDefinitionDto(noteDefinitionService.saveNoteDefinition(noteDefinition));
    }

    @Operation(security = {@SecurityRequirement(name = BASIC_AUTH_SECURITY_SCHEME)})
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping
    public List<NoteDefinitionDto> getAllNoteDefinitions() {
        return noteDefinitionService.getNoteDefinitions().stream()
                .map(noteDefinitionMapper::noteDefinitionToNoteDefinitionDto)
                .collect(Collectors.toList());
    }
/*
    @Operation(security = {@SecurityRequirement(name = BASIC_AUTH_SECURITY_SCHEME)})
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping
    public List<NoteDefinitionDto> getNoteDefinitionsBySubjecId(@Valid @RequestParam(value = "subject", required = false) String subjectId) {
        return noteDefinitionService.getNoteDefinitionsBySubjectId(subjectId).stream()
                .map(noteDefinitionMapper::noteDefinitionToNoteDefinitionDto)
                .collect(Collectors.toList());
    }*/
}
