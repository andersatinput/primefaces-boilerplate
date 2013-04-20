package de.gr4yweb.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name="booleanBean")
@SessionScoped
public class BooleanBean implements Serializable {
  
  private static final long serialVersionUID = 1L;
  
  private static boolean booleanValue;

  public boolean getBooleanValue() {
    return this.booleanValue;
  }


  public void setBooleanValue(boolean _booleanValue) {
    this.booleanValue = _booleanValue;
  }
    
}
