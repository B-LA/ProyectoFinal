package sv.edu.entity;
// Generated 11-11-2019 10:44:30 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Caso generated by hbm2java
 */
@Entity
@Table(name="caso"
    ,catalog="Taller"
)
public class Caso  implements java.io.Serializable {


     private Integer idcaso;
     private Gerente gerente;
     private Mecanico mecanico;
     private Vehiculo vehiculo;
     private Date fechaEntrada;
     private Date fechaSalida;
     private String detalle;
     private Integer descuento;
     private Integer presupuesto;
     private Set<Bitacora> bitacoras = new HashSet<Bitacora>(0);

    public Caso() {
    }

	
    public Caso(Gerente gerente, Mecanico mecanico, Vehiculo vehiculo, Date fechaEntrada, Date fechaSalida, String detalle) {
        this.gerente = gerente;
        this.mecanico = mecanico;
        this.vehiculo = vehiculo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.detalle = detalle;
    }
    public Caso(Gerente gerente, Mecanico mecanico, Vehiculo vehiculo, Date fechaEntrada, Date fechaSalida, String detalle, Integer descuento, Integer presupuesto, Set<Bitacora> bitacoras) {
       this.gerente = gerente;
       this.mecanico = mecanico;
       this.vehiculo = vehiculo;
       this.fechaEntrada = fechaEntrada;
       this.fechaSalida = fechaSalida;
       this.detalle = detalle;
       this.descuento = descuento;
       this.presupuesto = presupuesto;
       this.bitacoras = bitacoras;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idcaso", unique=true, nullable=false)
    public Integer getIdcaso() {
        return this.idcaso;
    }
    
    public void setIdcaso(Integer idcaso) {
        this.idcaso = idcaso;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idgerente", nullable=false)
    public Gerente getGerente() {
        return this.gerente;
    }
    
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idmecanico", nullable=false)
    public Mecanico getMecanico() {
        return this.mecanico;
    }
    
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idvehiculo", nullable=false)
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_entrada", nullable=false, length=10)
    public Date getFechaEntrada() {
        return this.fechaEntrada;
    }
    
    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_salida", nullable=false, length=10)
    public Date getFechaSalida() {
        return this.fechaSalida;
    }
    
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    
    @Column(name="detalle", nullable=false, length=1000)
    public String getDetalle() {
        return this.detalle;
    }
    
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    
    @Column(name="descuento")
    public Integer getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    
    @Column(name="presupuesto")
    public Integer getPresupuesto() {
        return this.presupuesto;
    }
    
    public void setPresupuesto(Integer presupuesto) {
        this.presupuesto = presupuesto;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="caso")
    public Set<Bitacora> getBitacoras() {
        return this.bitacoras;
    }
    
    public void setBitacoras(Set<Bitacora> bitacoras) {
        this.bitacoras = bitacoras;
    }




}


