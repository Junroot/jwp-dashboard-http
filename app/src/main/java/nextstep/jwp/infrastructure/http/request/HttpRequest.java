package nextstep.jwp.infrastructure.http.request;

import java.util.Objects;
import java.util.Optional;
import nextstep.jwp.infrastructure.http.Headers;

public class HttpRequest {

    private final RequestLine requestLine;
    private final Headers headers;
    private final String messageBody;

    public HttpRequest(final RequestLine requestLine, final Headers headers, final String messageBody) {
        this.requestLine = requestLine;
        this.headers = headers;
        this.messageBody = messageBody;
    }

    public void addHeader(final String key, final String value) {
        headers.add(key, value);
    }

    public String getBaseUri() {
        return requestLine.getBaseUri();
    }

    public RequestLine getRequestLine() {
        return requestLine;
    }

    public boolean hasNotCookie(final String key) {
        return !headers.getCookie().hasKey(key);
    }

    public Optional<String> getCookie(final String key) {
        return headers.getCookie().getValue(key);
    }

    public String getMessageBody() {
        return messageBody;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final HttpRequest request = (HttpRequest) o;
        return Objects.equals(requestLine, request.requestLine) && Objects.equals(headers, request.headers) && Objects
            .equals(messageBody, request.messageBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestLine, headers, messageBody);
    }
}
