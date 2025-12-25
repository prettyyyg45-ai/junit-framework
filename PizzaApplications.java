package com.tekation.service;
public class PizzaApplications {
 public int pizzaonDine(int quantity, int price) {
 return quantity * price;
 }
 public int pizzaOnDelivery(int quantity, int price, int deliveryCharges)
{
 return (quantity * price) + deliveryCharges;
 }
 public int sundayoffer(int quantity, int price, int offer) {
 int total = quantity * price;
 return total - (total * offer) / 100;
 }
}
