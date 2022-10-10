package io.github.heitorgomes900.quarkussocial.domain.repository;

import javax.enterprise.context.ApplicationScoped;

import io.github.heitorgomes900.quarkussocial.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {

}
