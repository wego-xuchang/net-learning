package com.netlearning.framework.domain.order;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Data
@ToString
@Entity
@Table(name="xc_orders_pay")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class NetLearningOrdersPay implements Serializable {
    private static final long serialVersionUID = -916357210051689789L;
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    @Column(name = "order_number")
    private String orderNumber;
    @Column(name = "pay_number")
    private String payNumber;
    private String status;

}
