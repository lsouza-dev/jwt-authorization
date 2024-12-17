package souza.luiz.authentication.training.domain.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroLogin(
        @NotBlank String login,
        @NotBlank String senha
) {
}
