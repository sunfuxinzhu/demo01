package hellostruts;

import com.opensymphony.xwork2.ActionSupport;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月8日 下午11:34:02 <br/>       
 */
public class UserAction extends ActionSupport {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String findById() {
        return SUCCESS;
    }
}
  
