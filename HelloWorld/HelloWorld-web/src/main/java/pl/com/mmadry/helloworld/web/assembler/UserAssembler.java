package pl.com.mmadry.helloworld.web.assembler;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import pl.com.mmadry.helloworld.core.model.User;
import pl.com.mmadry.helloworld.web.dto.UserDTO;

/**
 *
 * @author Mateusz Mądry <mmadry@soft-project.pl>
 */
@Component
public class UserAssembler implements Assembler<User, UserDTO>{

    private static final String[] EXCLUDED_FIELDS = new String[]{""};

    @Override
    public User assemblyToDbo(UserDTO dto) {
        User dbo = new User();
        BeanUtils.copyProperties(dto, dbo, EXCLUDED_FIELDS);
        return dbo;
    }

    @Override
    public UserDTO assemblyToDto(User dbo) {
        UserDTO dto = new UserDTO();
        BeanUtils.copyProperties(dbo, dto, EXCLUDED_FIELDS);
        return dto;
    }
    
}
