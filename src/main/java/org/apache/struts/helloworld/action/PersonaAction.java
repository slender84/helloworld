
package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.helloworld.model.Persona;

public class PersonaAction extends ActionSupport{
    
private static final long serialVersionUID = 1L;
private Persona personaBean;

    public Persona getPersonaBean() {
        return personaBean;
    }

    public void setPersonaBean(Persona personaBean) {
        this.personaBean = personaBean;
    }



public String execute() throws Exception{
    
    return SUCCESS;
    
}

public void validate(){
    
    
    if(personaBean.getEdad()<15){
        addFieldError("personaBean.edad", "edad debe ser mayor de 15");
    }
    
}
    
}
