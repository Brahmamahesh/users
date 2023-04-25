package com.kaiburrtask1.users.controller;

import com.kaiburrtask1.users.ServerRepository;
import com.kaiburrtask1.users.model.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/servers")
public class PostController
{
    @Autowired
   private ServerRepository serverRepository;

    @GetMapping
    public List<Server> getServers(@RequestParam(required = false) String id) {
        if (id == null) {
            return serverRepository.findAll();
        } else {
            return serverRepository.findById(id).map(Collections::singletonList).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        }
    }
    @PostMapping("/servers")
    public Server addServer(@RequestBody Server server)
    {
        return serverRepository.save(server);
    }


    @PutMapping
    public void createServer(@RequestBody Server server) {
        serverRepository.save(server);
    }

    @DeleteMapping({"/{id}"})
    public void deleteServer(@PathVariable String id) {
        serverRepository.deleteById(id);
    }

    @GetMapping(params = "name")
    public List<Server> findServersByName(@RequestParam String name) {
        List<Server> servers = serverRepository.findByNameContaining(name);
        if (servers.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            return servers;
        }
    }
}
