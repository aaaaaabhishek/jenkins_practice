package com.Jenkins.program.jenkins.repositary;

import com.Jenkins.program.jenkins.entity.JenkinsUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JenkinsRepositary extends JpaRepository<JenkinsUser,Integer> {
}
