package souza.luiz.authentication.training.domain.dto;

import souza.luiz.authentication.training.domain.model.Usuario;

public record DadosDetalhamentoUsuario(
        Long id,
        String login
) {
    public DadosDetalhamentoUsuario(Usuario u) {
        this(
                u.getId(),
                u.getLogin()
        );
    }
}
