package listener;

import jakarta.servlet.http.*;

public class SessionLogger implements HttpSessionAttributeListener {
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("Thêm session attribute: " + event.getName() + " = " + event.getValue());
    }

    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("Thay đổi session attribute: " + event.getName());
    }
}
