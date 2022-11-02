package crud.crud.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_produto")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private int quantidade;
    private double preco;
}
