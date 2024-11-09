package gbaeta.ListaDeJogos.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gbaeta.ListaDeJogos.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
