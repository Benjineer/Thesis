/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesis.repositories;

import com.thesis.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author NiyiO
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
