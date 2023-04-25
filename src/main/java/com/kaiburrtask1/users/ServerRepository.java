package com.kaiburrtask1.users;

import com.kaiburrtask1.users.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServerRepository extends MongoRepository<Server,String>
{
    List<Server> findByNameContaining(String name);
}
