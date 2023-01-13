package dtos;

import entities.RenameMe;
import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private Integer id;
    private String username;
    private String password;

    public UserDTO(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserDTO(User user) {
        if(user.getId() != null)
            this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
    }


    public static List<UserDTO> getDtos(List<User> users){
        List<UserDTO> userDTOS = new ArrayList();
        users.forEach(user->userDTOS.add(new UserDTO(user)));
        return userDTOS;
    }
}
