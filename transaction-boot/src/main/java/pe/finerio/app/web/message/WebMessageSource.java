package pe.finerio.app.web.message;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.nio.charset.StandardCharsets;

public class WebMessageSource extends ReloadableResourceBundleMessageSource {
    private static final String SHORT_MESSAGE_SUFIX = ".short";
    private static final String DEFAULT_MESSAGE = "Error";
    private static final String DEFAULT_MESSAGE_SHORT = "ERROR";
    private final String defaultMessage;
    private final String defaultShortMessage;

    public WebMessageSource(String defaultCode, long cacheMillis, String... baseNames) {
        this.setBasenames(baseNames);
        this.setCacheMillis(cacheMillis);
        this.setDefaultEncoding(StandardCharsets.UTF_8.name());
        this.defaultMessage = this.getMessage(defaultCode, (Object[])null, "Error", LocaleContextHolder.getLocale());
        this.defaultShortMessage = this.getMessage(defaultCode + ".short", (Object[])null, "ERROR", LocaleContextHolder.getLocale());
    }

    public Message getMessage(String code) {
        String message = this.getMessage(code, (Object[])null, this.defaultMessage, LocaleContextHolder.getLocale());
        String shortMessage;
        if (this.isDefaultMessage(message)) {
            shortMessage = this.defaultShortMessage;
        } else {
            shortMessage = this.getMessage(code + ".short", (Object[])null, this.defaultShortMessage, LocaleContextHolder.getLocale());
        }

        return new Message(message, shortMessage);
    }

    protected String getDefaultMessage(String code) {
        return this.defaultMessage;
    }

    private boolean isDefaultMessage(String msg) {
        return msg != null && msg.equals(this.defaultMessage);
    }

    public static class Message {
        private final String message;
        private final String shortMessage;

        public String getMessage() {
            return this.message;
        }

        public String getShortMessage() {
            return this.shortMessage;
        }

        public Message(String message, String shortMessage) {
            this.message = message;
            this.shortMessage = shortMessage;
        }
    }
}
