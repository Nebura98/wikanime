package wikanime.apps.backoffice.backend;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import wikanime.shared.domain.Service;

import java.util.HashMap;

@SpringBootApplication()
@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class), value = {"wikanime.shared", "wikanime.backoffice", "wikanime.apps.backoffice.backend"})
public class BackofficeBackendApplication {
    public static HashMap<String, Class<?>> commands() {
        return new HashMap<String, Class<?>>() {{
        }};
    }
}

