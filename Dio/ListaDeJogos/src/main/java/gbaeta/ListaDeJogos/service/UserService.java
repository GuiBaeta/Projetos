package gbaeta.ListaDeJogos.service;

import gbaeta.ListaDeJogos.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User userToCreate);
	
}
