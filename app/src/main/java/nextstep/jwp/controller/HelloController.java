package nextstep.jwp.controller;

import nextstep.jwp.infrastructure.http.request.HttpMethod;
import nextstep.jwp.infrastructure.http.request.HttpRequest;
import nextstep.jwp.infrastructure.http.request.HttpRequestLine;
import nextstep.jwp.infrastructure.http.view.ResourceView;
import nextstep.jwp.infrastructure.http.view.View;

public class HelloController implements Controller {

    @Override
    public HttpRequestLine requestLine() {
        return new HttpRequestLine(HttpMethod.GET, "/");
    }

    @Override
    public View handle(final HttpRequest request) {
        return new ResourceView("/hello.html");
    }
}
