package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

    private Long id;
    private String name;
    
    /**
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * set customer name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * get customer id
     * @return
     */
    public Long getId() {
        return id;
    }
    
    /**
     * set customer id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    
}
