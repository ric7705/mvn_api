package com.ceiere.mvn_api.controller;

import com.ceiere.mvn_api.controller.api.UserApi;
import com.ceiere.mvn_api.model.User;
import com.ceiere.mvn_api.model.UserList;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@Api
public class UserController implements UserApi {

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public Optional<String> getAcceptHeader() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<Void> createUser(@Valid User body) {
        return null;
    }

    @Override
    public ResponseEntity<UserList> userList() {
        return null;
    }
}
