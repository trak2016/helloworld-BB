package pl.com.mmadry.helloworld.web.controller.api;

import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.com.mmadry.helloworld.web.dto.UserDTO;
import pl.com.mmadry.helloworld.web.helper.api.UserHelper;

/**
 *
 * @author Mateusz Mądry <mmadry@soft-project.pl>
 */
@RestController
@RequestMapping(UserController.URL)
public class UserController {

    public static final String URL = "/api/user";
    public static final String GET_USER_BY_ID = "/getById/{id}";

    @Autowired
    private UserHelper userHelper;

    @RequestMapping(value = UserController.GET_USER_BY_ID, method = RequestMethod.GET, 
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> getUserById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userHelper.getUserDTOById(id), HttpStatus.OK);
    }

}
