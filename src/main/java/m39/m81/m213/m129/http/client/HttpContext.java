/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */
package m39.m81.m213.m129.http.client;

import m39.m81.m213.m129.http.request.HttpRequest;
import m39.m81.m213.m129.http.response.HttpResponse;

public class HttpContext {
    private HttpRequest _request;
    private HttpResponse _response;

    public HttpContext(HttpRequest request, HttpResponse response) {
        _request = request;
        _response = response;
    }

    /**
     * Getter for the Http Request
     * @return HttpRequest request
     */
    public HttpRequest getRequest() {
        return _request;
    }

    /**
     * Getter for the Http Response
     * @return HttpResponse response
     */
    public HttpResponse getResponse() {
        return _response;
    }
}