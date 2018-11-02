/**
 * @Author: ANIMASHAUN HABEEB ABIMBOLA
 * Purpose: A representation of Product Entity
 * @Version: 1.0
 * Date: 1st November 2018
 * */
package ee.erply.product.domain;

import jdk.jfr.Timespan;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name="PRODUCTS")
public class Product implements Serializable {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(name="NAME")
    private String name;
    @Column(name="PRICE")
    private BigDecimal price;

    @Column(name="time_stamp")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date timestamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
