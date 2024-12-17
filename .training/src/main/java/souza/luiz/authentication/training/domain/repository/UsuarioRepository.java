package souza.luiz.authentication.training.domain.repository;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import souza.luiz.authentication.training.domain.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    UserDetails findByLogin(String login);

    boolean existsByLogin(@NotBlank String login);

    Page<Usuario> findAll(Pageable page);
}
