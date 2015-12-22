package pl.com.mmadry.helloworld.web.helper.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.com.mmadry.helloworld.core.model.User;
import pl.com.mmadry.helloworld.core.service.UserService;
import pl.com.mmadry.helloworld.web.assembler.UserAssembler;
import pl.com.mmadry.helloworld.web.dto.UserDTO;

/**
 *
 * @author Mateusz Mądry <mmadry@soft-project.pl>
 */
@Component
public class UserHelper {

    @Autowired
    private UserService userService;

    @Autowired
    private UserAssembler userAssembler;

    public UserDTO getUserDTOById(Long id) {

        User dbo = userService.getElement(id);

        if (dbo == null) {
            return null;
        } else {
            return userAssembler.assemblyToDto(dbo);
        }

    }

}
