package sv.edu.entity;
// Generated 11-11-2019 10:44:30 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Administrador generated by hbm2java
 */
@Entity
@Table(name="administrador"
    ,catalog="Taller"
)
public class Administrador  implements java.io.Serializable {


     private Integer idadmin;
     private String usuario;
     private String contraseña;

    public Administrador() {
    }

    public Administrador(String usuario, String contraseña) {
       this.usuario = usuario;
       this.contraseña = contraseña;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idadmin", unique=true, nullable=false)
    public Integer getIdadmin() {
        return this.idadmin;
    }
    
    public void setIdadmin(Integer idadmin) {
        this.idadmin = idadmin;
    }

    
    @Column(name="usuario", nullable=false, length=30)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="contraseña", nullable=false, length=30)
    public String getContraseña() {
        return this.contraseña;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }




}

