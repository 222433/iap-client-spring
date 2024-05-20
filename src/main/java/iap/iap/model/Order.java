package iap.iap.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Entity
@Table
public class Order {
    @Id
    @Column
    public int id;
    @Column
    public int productId;

    @Column
    public int quantity;
}
