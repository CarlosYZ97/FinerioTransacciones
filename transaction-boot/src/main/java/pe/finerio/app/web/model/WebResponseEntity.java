package pe.finerio.app.web.model;

public class WebResponseEntity<T> {
    private String trackingId;
    private String shortMessage;
    private String message;
    private String errorCode;
    private T data;

    public WebResponseEntity() {
    }

    public String getTrackingId() {
        return this.trackingId;
    }

    public String getShortMessage() {
        return this.shortMessage;
    }

    public String getMessage() {
        return this.message;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public T getData() {
        return this.data;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof WebResponseEntity)) {
            return false;
        } else {
            WebResponseEntity<?> other = (WebResponseEntity)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$trackingId = this.getTrackingId();
                    Object other$trackingId = other.getTrackingId();
                    if (this$trackingId == null) {
                        if (other$trackingId == null) {
                            break label71;
                        }
                    } else if (this$trackingId.equals(other$trackingId)) {
                        break label71;
                    }

                    return false;
                }

                Object this$shortMessage = this.getShortMessage();
                Object other$shortMessage = other.getShortMessage();
                if (this$shortMessage == null) {
                    if (other$shortMessage != null) {
                        return false;
                    }
                } else if (!this$shortMessage.equals(other$shortMessage)) {
                    return false;
                }

                label57: {
                    Object this$message = this.getMessage();
                    Object other$message = other.getMessage();
                    if (this$message == null) {
                        if (other$message == null) {
                            break label57;
                        }
                    } else if (this$message.equals(other$message)) {
                        break label57;
                    }

                    return false;
                }

                Object this$errorCode = this.getErrorCode();
                Object other$errorCode = other.getErrorCode();
                if (this$errorCode == null) {
                    if (other$errorCode != null) {
                        return false;
                    }
                } else if (!this$errorCode.equals(other$errorCode)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data == null) {
                        return true;
                    }
                } else if (this$data.equals(other$data)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof WebResponseEntity;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $trackingId = this.getTrackingId();
        result = result * 59 + ($trackingId == null ? 43 : $trackingId.hashCode());
        Object $shortMessage = this.getShortMessage();
        result = result * 59 + ($shortMessage == null ? 43 : $shortMessage.hashCode());
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        Object $errorCode = this.getErrorCode();
        result = result * 59 + ($errorCode == null ? 43 : $errorCode.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "WebResponseEntity(trackingId=" + this.getTrackingId() + ", shortMessage=" + this.getShortMessage() + ", message=" + this.getMessage() + ", errorCode=" + this.getErrorCode() + ", data=" + this.getData() + ")";
    }
}
