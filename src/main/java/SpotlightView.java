import service.impl.UserService;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class SpotlightView implements Serializable {

    @Inject
    private UserService userService;

    private String firstName;

    private String lastName;

    private String DOB;

    private String email;

    private String occupation;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String save() {
        userService.addUser(firstName, lastName, DOB, occupation, email);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've registered"));
        setFirstName(null);
        setLastName(null);
        setDOB(null);
        setOccupation(null);
        setEmail(null);
        return "/hello.xhtml?faces-redirect=true";
    }
}