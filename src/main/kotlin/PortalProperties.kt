import jakarta.validation.constraints.NotBlank
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "portal")
data class PortalProperties(

    @NotBlank
    var origin: String = ""
)
