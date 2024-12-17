package souza.luiz.authentication.training.domain.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosTokenJWT(
        @NotBlank String token
) {
}
