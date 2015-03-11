
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author phuongtm
 */
@ManagedBean
@ViewScoped
public class IndexManagedBean {

    private String answer1;

    private String answer2;

    private String answer3;

    private Map<String, Object> question1;

    private Map<String, Object> question2;

    private Map<String, Object> question3;

    public String getAnswer1() {        
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public Map<String, Object> getQuestion1() {
        question1 = new LinkedHashMap<String, Object>();
        question1.put("Dog", "Dog"); //label, value
        question1.put("Cat", "Cat");
        question1.put("Bird", "Bird");
        return question1;
    }

    public void setQuestion1(Map<String, Object> question1) {
        this.question1 = question1;
    }

    public Map<String, Object> getQuestion2() {
        question2 = new LinkedHashMap<String, Object>();
        question2.put("10 - 18", "10-18"); //label, value
        question2.put("20 - 25", "20-25");
        question2.put("30 - 35", "30-35");
        return question2;
    }

    public void setQuestion2(Map<String, Object> question2) {
        this.question2 = question2;
    }

    public Map<String, Object> getQuestion3() {
        question3 = new LinkedHashMap<String, Object>();
        question3.put("Google search", "google"); //label, value
        question3.put("Bing search", "bing");
        question3.put("Yahoo search", "yahoo");
        return question3;
    }

    public void setQuestion3(Map<String, Object> question3) {
        this.question3 = question3;
    }

    /**
     * Creates a new instance of IndexManagedBean
     */
    public IndexManagedBean() {
    }
    
    public String getAccess() {
        if (answer1 == null || answer2 == null || answer3 == null || answer1.equals("") || answer2.equals("") || answer3.equals("")) {
            return "Please answer the question";
        } else {
            return "<form name=\"login\" method=\"post\" action=\"http://192.168.11.1:5280/\">\n"
                    + "\n"
                    + "<div align=\"center\">\n"
                    + "\n"
                    + "  <input type=\"hidden\" name=\"accept_terms\" value=\"yes\" />   <input type=\"hidden\" name=\"redirect\" value=\"https://facebook.com\">\n"
                    + "\n"
                    + "  <input type=\"hidden\" name=\"mode_login\">\n"
                    + "\n"
                    + "  <input type=\"submit\" value=\"Click here to continue\">\n"
                    + "\n"
                    + "</div>";
        }
        
    }

}
