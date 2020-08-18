package com.mytask.phonenumbertask;
public class Split {
void stringSplit(String data) {
String[] str=data.split(" ");
for(String a:str) {
System.out.println(a);
}}
public static void main(String[] args) {
Split StringSplit=new Split();
StringSplit.stringSplit("This is Java Programming");
}}
