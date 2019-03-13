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
public class InsertionService{
    private final Route newroute;
    private final Delivery newdelivery;
    private final int newindex;
    
    public InsertionService(Route newroute, Delivery newdelivery, int newindex){
        this.newroute = newroute;
        this.newdelivery = newdelivery;
        this.newindex = newindex;
    }
    public Route getRoute(){
        return newroute;
    }
    public Delivery getDelivery(){
        return newdelivery;
    }
    public int getIndex(){
        return newindex;
    }


}
