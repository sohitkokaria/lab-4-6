package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FacesValidator("occupationValidator")
public class OccupationValidator implements Validator {

    private static final String OCCUPATION_PATTERN = "\b(Doctor|doctor|Programmer|programmer|Engineer|engineer)\b";

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) {
        Matcher matcher = Pattern.compile(OCCUPATION_PATTERN).matcher(value.toString());
        if (!matcher.matches()) {
            FacesMessage msg =
                    new FacesMessage("Occupation validation failed.",
                            "Invalid Occupation.");
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
            throw new ValidatorException(msg);
        }
    }
}
