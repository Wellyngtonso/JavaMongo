package br.com.wellyngton.javamongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.wellyngton.javamongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
