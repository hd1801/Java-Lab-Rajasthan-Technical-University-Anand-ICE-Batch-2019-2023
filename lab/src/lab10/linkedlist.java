/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author karti
 */


public class linkedlist {
  node head;
  int count;
   private class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
        }
   public void display(){
       System.out.print(this.data+" ");
   }
    }
    public void insertAtFirst(int data){
        
        node newnode = new node(data);
        if(this.head!=null){
           newnode.next=head;
        }
        head=newnode;
        count++;
    }
    public void insertAfter(int data,node pos){
        if(this.head.next==null){
          System.out.println("list is empty");
        }
        else{
        node newnode = new node(data);
        node temp = head;
        while(temp!=pos){
            temp=temp.next;
        }
        newnode.next=pos.next;
        pos.next=newnode;
        count++;
        }
    }
    public void insertAtLast(int data){
       
        if(this.head==null){
          System.out.println("list is empty");
        }
        else{
        node newnode = new node(data);
        node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        count++;
        }
    }
    public void deleteAt(int data,int pos){
       if(this.head==null){
          System.out.println("list is empty");
        }
        else{
           node temp=head;
           int i=0;
           while(i<pos){
               pos++;
               temp=temp.next;
           }
           temp.next=temp;
           temp=null;
        }
    } 
    public void show(){
        if(this.head==null){
          System.out.println("list is empty");
        }
        else{
        node temp=head;
        while(temp!=null){
            temp.display();
            temp=temp.next;
        }
        }
          }

    public linkedlist() {
        this.head = null;
        this.count=0;
    }
    
    public static void main(String args[]){
        linkedlist a=new linkedlist();
        a.insertAtFirst(100);
        a.insertAtFirst(200);
        a.insertAtLast(500);
        a.show();
    }
}
