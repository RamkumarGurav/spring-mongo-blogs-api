package com.ram.myblogsmongo.service;

import com.ram.myblogsmongo.collection.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    Role createRole(Role role);

    List<Role> getAllRoles();

    Optional<Role> getActiveSingleRole(String id, boolean active);

    Optional<Role> getSingleRole(String id);

    void permanentlyDeleteRole(String id);
}
