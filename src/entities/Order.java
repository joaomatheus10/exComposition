package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order {
	private Date moment;
//	private OrderStatus status;
	
	List<OrderItem> items = new ArrayList<>();
	public static Client client = new Client();
	OrderStatus status;
		
//	public Order() {
		
//	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	
}
