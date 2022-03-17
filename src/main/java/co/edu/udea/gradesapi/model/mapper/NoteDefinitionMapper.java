package co.edu.udea.gradesapi.model.mapper;

import co.edu.udea.gradesapi.model.NoteDefinition;
import co.edu.udea.gradesapi.model.dto.NoteDefinitionDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface NoteDefinitionMapper {
    NoteDefinition noteDefinitionDtoToNoteDefinition(NoteDefinitionDto noteDefinitionDto);

    NoteDefinitionDto noteDefinitionToNoteDefinitionDto(NoteDefinition noteDefinition);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateNoteDefinitionFromNoteDefinitionDto(NoteDefinitionDto noteDefinitionDto, @MappingTarget NoteDefinition noteDefinition);
}
