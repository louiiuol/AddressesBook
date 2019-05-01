package fr.simplon.addressBook.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 
 * <h3>this entity generate a dynamic ID for entities present in this package.</h3>
 * 
 * @see GeneratedValue
 * @see GenerationType
 * @see Serializable
 * @see MappedSuperclass
 *
 */

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    protected AbstractEntity() {super();}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    
}
