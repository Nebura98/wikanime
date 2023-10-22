package wikanime.backoffice.users.domain;

public final class User {
    private final UserName username;
    private final UserEmail email;
    private final UserPassword password;
    private final UserDomainName domainName;

    public User(String username, String email, String password, String domainName) {
        this.username = new UserName(username);
        this.email = new UserEmail(email);
        this.password = new UserPassword(password);
        this.domainName = new UserDomainName(domainName);
    }

}
