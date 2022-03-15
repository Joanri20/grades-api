package co.edu.udea.gradesapi.model.mapper;

import co.edu.udea.gradesapi.model.Note;
import co.edu.udea.gradesapi.model.dto.NoteDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface NoteMapper {
    Note noteDtoToNote(NoteDto noteDto);

    NoteDto noteToNoteDto(Note note);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateNoteFromNoteDto(NoteDto noteDto, @MappingTarget Note note);
}
