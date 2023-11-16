package wikanime.backoffice.auth.domain.exception;

import wikanime.backoffice.auth.domain.AuthUsername;

public final class InvalidAuthCredentials extends RuntimeException{
    public InvalidAuthCredentials(AuthUsername username) {
        super(String.format("The credentials for <%s> are invalid", username.value()));
    }
}
