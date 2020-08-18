package com.mytask.phonenumbertask;
class CustomException extends RuntimeException{
public CustomException() {
super("Not valid please enter the valid marks 0 and 100");
}
public static void main(String[] args) {
Marks t=new Marks();
try{
t.Studentmarks(200);
}
catch (Exception e) {
System.out.println(e);
}}}



