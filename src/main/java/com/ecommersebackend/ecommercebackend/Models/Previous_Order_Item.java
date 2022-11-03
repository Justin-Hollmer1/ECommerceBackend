//package com.ecommersebackend.ecommercebackend.Models;
//
//
//import org.aspectj.weaver.ast.Or;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "previous_order_items")
//public class Previous_Order_Item {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @ManyToOne
//    @JoinColumn(name = "items_id")
//    private Item item_id;
//
//    @ManyToOne
//    @JoinColumn(name = "orders_id")
//    private Order order_id;
//
//    public long getId() {
//        return id;
//    }
//
//    public Item getItem_id() {
//        return item_id;
//    }
//
//    public void setItem_id(Item item_id) {
//        this.item_id = item_id;
//    }
//
//    public Order getOrder_id() {
//        return order_id;
//    }
//
//    public void setOrder_id(Order order_id) {
//        this.order_id = order_id;
//    }
//}
