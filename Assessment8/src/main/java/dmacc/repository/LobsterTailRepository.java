package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.LobsterTail;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Nov 30, 2023
 */
@Repository
public interface LobsterTailRepository extends JpaRepository<LobsterTail, Long> { 
	
}

