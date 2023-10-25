package wikanime.apps.mwo.backend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import wikanime.shared.infrastructure.config.ParameterNotExist;

public final class MwoBackendServerPortCustomizer implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
    @Value("${MWO_FRONTEND_SERVER_PORT}")
    private Integer MWO_FRONTEND_SERVER_PORT;

    public MwoBackendServerPortCustomizer() {
    }

    @Override
    public void customize(ConfigurableWebServerFactory factory){
        try {
            factory.setPort(MWO_FRONTEND_SERVER_PORT);
        } catch (Exception ex) {
            new ParameterNotExist("MWO_FRONTEND_SERVER_PORT").printStackTrace();
        }
    }
}
