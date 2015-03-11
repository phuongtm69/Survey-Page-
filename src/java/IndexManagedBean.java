
import Controllers.ValidationControl;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author phuongtm
 */
@ManagedBean
@ViewScoped
public class IndexManagedBean {

    private String firstName;

    private String lastName;

    private String email;

    private String region;

    private String age;

    private String sex;

    private boolean firstView = true;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Creates a new instance of IndexManagedBean
     */
    public IndexManagedBean() {
    }

    public String getAccess() {
        if (firstView) {
            firstView = false;
            return "";
        }
        if ((firstName != null && lastName != null && email != null && age != null) && (!firstName.equals("") && !lastName.equals("") && !email.equals("") && !region.equals("Question") && !age.equals(""))) {
            if (ValidationControl.isValidEmailAddress(email)) {
                return "<form name=\"login\" method=\"post\" action=\"http://192.168.11.1:5280/\">\n"
                        + "\n"
                        + "<div align=\"center\">\n"
                        + "\n"
                        + "  <input type=\"hidden\" name=\"accept_terms\" value=\"yes\" />   <input type=\"hidden\" name=\"redirect\" value=\"https://facebook.com\">\n"
                        + "\n"
                        + "  <input type=\"hidden\" name=\"mode_login\">\n"
                        + "\n"
                        + "  <input type=\"submit\" value=\"Bấm vào đây để tiếp tục\">\n"
                        + "\n"
                        + "</div>";
            } else {
                return "<br/> Địa chỉ email không hợp lệ";
            }

        }
        return "<br/> Xin vui lòng điền đầy đủ thông tin";
    }

}
