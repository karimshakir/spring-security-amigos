package com.example.springsecurityamigos.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.springsecurityamigos.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, COURSE_WRITE));

    private final Set<ApplicationUserPermission> permissions;
    public String name;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
