package wikanime.apps.backoffice.backend.middleware;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import wikanime.backoffice.auth.domain.exception.InvalidAuthCredentials;
import wikanime.backoffice.auth.domain.exception.InvalidAuthUsername;
import wikanime.shared.domain.bus.command.CommandBus;
import wikanime.shared.domain.bus.command.CommandHandlerExecutionError;

import java.io.IOException;
import java.util.Base64;

public class BasicHttpAuthMiddleware implements Filter {
    private final CommandBus bus;

    public BasicHttpAuthMiddleware(CommandBus bus) {
        this.bus = bus;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String authorizationHeader = ((HttpServletRequest) request).getHeader("authorization");
        if (hasIntroducedCredentials(authorizationHeader)) {

        }
    }

    private boolean hasIntroducedCredentials(String authorizationHeader) {
        return null != authorizationHeader;
    }

    private void authenticate(
            String authorizationHeader,
            FilterChain chain,
            ServletRequest request,
            ServletResponse response
    ) throws IOException, ServletException {
        String[] auth = decodeAuth(authorizationHeader);
        String user = auth[0];
        String pass = auth[1];

        try {
//            bus.dispatch(new AuthenticateUserCommand(user, pass));

            request.setAttribute("authentication_username", user);

            chain.doFilter(request, response);
        } catch (InvalidAuthUsername | InvalidAuthCredentials | CommandHandlerExecutionError error) {
            setInvalidCredentials(response);
        }
    }

    private String[] decodeAuth(String authString) {
        return new String(Base64.getDecoder().decode(authString.split("\\s+")[1])).split(":");
    }

    private void setInvalidCredentials(ServletResponse response) {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.reset();
        httpServletResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
    }

    private void askForCredentials(ServletResponse response) {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.reset();
        httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        httpServletResponse.setHeader("WWW-Authenticate", "Basic realm=\"Wikanime\"");
    }
}
