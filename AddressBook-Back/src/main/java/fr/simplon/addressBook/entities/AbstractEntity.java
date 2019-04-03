package fr.simplon.addressBook.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Anne-sophie, Johnathan, Alex, Pascal, Louis and Nathalie
 * 
 * this class generate an ID.
 *
 */

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    protected AbstractEntity() {
	super();
    }


    
    /**
     * @return id
     */
    public Long getId() {
        return id;
    }


    
    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    

    
}
