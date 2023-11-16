package wikanime.backoffice.auth.domain.exception;

import wikanime.backoffice.auth.domain.AuthUsername;

public final class InvalidAuthUsername extends RuntimeException {
    public InvalidAuthUsername(AuthUsername username) {
        super(String.format("The user <%s> does not exist", username.value()));
    }
}
