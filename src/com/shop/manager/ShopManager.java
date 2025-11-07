package com.shop.manager;

import com.shop.model.Product;
import com.shop.model.Order;

public class ShopManager {
    private Product[] products;  // 상품 배열 (크기 50)
    private int productCount;    // 현재 등록된 상품 수
    private Order[] orders;      // 주문 배열 (크기 50)
    private int orderCount;      // 현재 주문 수


    public ShopManager() {
        products = new Product[50];
        productCount = 0;
        orders = new Order[50];
        orderCount = 0;
    }


    public void addProduct(Product product){
        if(productCount < 50){
        products[productCount++]=product;
            System.out.println("[상품 등록] " + product.getName() + " - " + product.getPrice() + "원");
        }

    }

    public Product findProductById(String id){
        for(Product p : products){
            if(id == p.getId()){
                return p;
            }
        }
            return null;
    }

    public Product[] searchProductsByName(String keyword){
        Product[] arr =new Product[productCount];
        int index=0;
        for(int i=0;i < productCount;i++){
            if(products[i].getName().toLowerCase().contains(keyword.toLowerCase())){
                arr[index]= products[i];
                index++;
            }
        }
        Product[] newArr = new Product[index];
        for(int i=0; i< index; i++){
            newArr[i]=arr[i];
        }
        return newArr;

    }

    public Product[] searchProductsByCategory(String category){
        Product[] arr =new Product[productCount];
        int index=0;
        for(int i=0;i < productCount;i++){
            if(products[i].getCategory().equalsIgnoreCase(category)){
                arr[index]= products[i];
                index++;
            }
        }
        Product[] newArr = new Product[index];
        for(int i=0; i< index; i++){
            newArr[i]=arr[i];
        }
        return newArr;

    }
    public void printAllProducts(){
        for(int i=0 ; i < productCount; i++){
            Product p = products[i];
            System.out.println((i+1) + ". [" + p.getId() + "] " + p.getName() + " - " + p.getPrice() + "원 (재고: " + p.getStock() + "개)");
        }
    }

    public Order createOrder(){
    Order order = new Order();
        System.out.println("생성되었습니다.");
        return order;
    }

    public void addOrderItem(Order order, String productId, int quantity){
        if(findProductById(productId)==null){
            System.out.println("상품을 주문 할 수 없습니다.");

        }else{
            if(findProductById(productId).isAvailable(quantity)){
                order.addItem(productId,quantity);
            }else{
                System.out.println("재고 부족");
            }
        }

    }

    public void processOrder(Order order){
        order.calculateTotal(this);
        for(int i = 0; i < order.getItemCount();i++){
            //상품명을 알기 위해서 order에 productIds[i]
            Product p = findProductById(order.getProductIds()[i]);
            p.getName();
            int amount =order.getQuantities()[i];//상품 주문 수량
            int total = p.getPrice()*amount;
            System.out.println("상품명 :"+p.getName()+" 주문 수량:"+amount+" 금액:"+total);
            p.decreaseStock(amount);
        }
        order.complete();
    orders[orderCount]=order;
    orderCount++;
    }


    public Order findOrderById(String orderId){
        for(int i=0; i< orderCount;i++){
            if(orders[i].getOrderId().equals(orderId)){
                return orders[i];
            }
        }
        return null;
    }
    public void printAllOrders(){
        for(int i=0; i<orderCount ; i++){
            // id :orders[i].getOrderId()
            //총금액원
            orders[i].getTotalAmount();
            System.out.println((i+1) + ". [" + orders[i].getOrderId() + "] " + orders[i].getTotalAmount() + "원 (" + orders[i].getStatus() + ")");
        }

    }


}
