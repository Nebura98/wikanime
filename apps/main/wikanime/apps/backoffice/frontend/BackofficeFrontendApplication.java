package wikanime.apps.backoffice.frontend;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import wikanime.shared.domain.Service;

import java.util.HashMap;

@SpringBootApplication()
@ComponentScan(
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
        value = {"wikanime.shared", "wikanime.mwo", "wikanime.apps.backoffice.frontend"}
)
public class BackofficeFrontendApplication {
    public static HashMap<String, Class<?>> commands() {
        return new HashMap<String, Class<?>>() {{
        }};
    }
}
