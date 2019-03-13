/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionrouting;

/**
 *
 * @author Xin Yi
 */
public class Insertion {

    private final Route route;
    private final Delivery delivery;
    private final int index;
    
    public Insertion(Route route, Delivery delivery, int index){
        this.route = route;
        this.delivery = delivery;
        this.index = index;
    }
    public Route getRoute(){
        return route;
    }
    public Delivery getDelivery(){
        return delivery;
    }
    public int getIndex(){
        return index;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
