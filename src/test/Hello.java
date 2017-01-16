/**
 * Created by bobi on 2017/1/16.
 * at jsf
 */
package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlInputText;

@ManagedBean(name = "bobi")
public class Hello {

    private HtmlInputText text;

    public void action() {
        Calendar now = Calendar.getInstance();
        text.setValue("hello world! " + new SimpleDateFormat("hh:mm:ss").format(now.getTime()));
    }

    public HtmlInputText getText() {
        return text;
    }

    public void setText(HtmlInputText text) {
        this.text = text;
    }

}
