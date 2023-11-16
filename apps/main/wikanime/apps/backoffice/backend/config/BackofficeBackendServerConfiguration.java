package wikanime.apps.backoffice.backend.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wikanime.apps.backoffice.backend.middleware.BasicHttpAuthMiddleware;
import wikanime.shared.domain.bus.command.CommandBus;

@Configuration
public final class BackofficeBackendServerConfiguration {
    private final CommandBus bus;

    public BackofficeBackendServerConfiguration(CommandBus bus) {
        this.bus = bus;
    }

    @Bean
    public FilterRegistrationBean<BasicHttpAuthMiddleware> basicHttpAuthMiddleware() {
        FilterRegistrationBean<BasicHttpAuthMiddleware> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new BasicHttpAuthMiddleware(bus));
        registrationBean.addUrlPatterns("/health-check");

        return registrationBean;
    }
}
