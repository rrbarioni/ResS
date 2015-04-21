package pages
import org.springframework.web.servlet.support.RequestContextUtils as RCU

class GetPageTitle {
    def messageSource
    
    String getMessage(String code) {

        messageSource.getMessage(code, null, "", RCU.getLocale(request));


    }
}