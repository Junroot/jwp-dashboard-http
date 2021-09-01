package nextstep.jwp.controller;

import nextstep.jwp.infrastructure.http.request.HttpRequest;
import nextstep.jwp.infrastructure.http.response.HttpResponse;
import nextstep.jwp.infrastructure.http.response.ResponseLine;
import nextstep.jwp.infrastructure.http.response.StatusCode;

public class IndexController extends AbstractController {

    @Override
    public String uri() {
        return "/index";
    }

    @Override
    protected void doGet(final HttpRequest request, final HttpResponse response) {
        response.setResponseLine(new ResponseLine(StatusCode.OK));
        respondByFile("/index.html", response);
    }
}
