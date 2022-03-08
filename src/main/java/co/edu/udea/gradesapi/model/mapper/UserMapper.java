package co.edu.udea.gradesapi.model.mapper;

import co.edu.udea.gradesapi.model.User;
import co.edu.udea.gradesapi.model.dto.UserDto;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);
}