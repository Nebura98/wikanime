package wikanime.apps.backoffice.backend.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import wikanime.shared.infrastructure.config.Parameter;
import wikanime.shared.infrastructure.config.ParameterNotExist;

public class BackofficeBackendServerPortCustomizer implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
    private final Parameter param;

    public BackofficeBackendServerPortCustomizer(Parameter param) {
        this.param = param;
    }

    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        try {
            factory.setPort(param.getInt("BACKOFFICE_BACKEND_SERVER_PORT"));
        } catch (ParameterNotExist parameterNotExist) {
            parameterNotExist.printStackTrace();
        }
    }


}
