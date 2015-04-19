package pages
import org.springframework.web.servlet.support.RequestContextUtils as RCU

class GetPageTitle {
    def messageSource

<<<<<<< HEAD
    String getMessage(String code) {

        messageSource.getMessage(code, null, "", RCU.getLocale());
=======

    String getMessage(String code) {

        messageSource.getMessage(code, null, "", RCU.getLocale(request));

>>>>>>> 4cbf37f862ffada963d2383cbe38a3dee9df7cff
    }
}