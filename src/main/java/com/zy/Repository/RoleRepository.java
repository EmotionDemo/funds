package com.zy.Repository;

import com.zy.Entry.Role;
import com.zy.Entry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,String> {
    Role findByRoleId(String roleId);
}
