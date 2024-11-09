package gbaeta.ListaDeJogos.service.impl;

import java.util.NoSuchElementException;

import gbaeta.ListaDeJogos.service.UserService;
import org.springframework.stereotype.Service;

import gbaeta.ListaDeJogos.domain.model.User;
import gbaeta.ListaDeJogos.domain.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if (userRepository.existsByAccountUsername(userToCreate.getAccount().getUsername())) {
			throw new IllegalArgumentException("This Account Username already exists.");
		}
		return userRepository.save(userToCreate);
	}
	

}
