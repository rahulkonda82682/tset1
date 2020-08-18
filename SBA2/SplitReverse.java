package com.mytask.phonenumbertask;
public class SplitReverse {
void stringSplitReverse(String data) {
String[] str=data.split(" ");
for(int i=0; i<str.length;i++) {
int j=0;
char[] arr = str[i].toCharArray();
char[] arr1 = new char[arr.length];
for (int k = arr.length - 1; k >= 0; k--) {
arr1[j]=arr[k];
j++;
}
String manstr = new String(arr1);
System.out.println(manstr);
}}
public static void main(String [] args) {
SplitReverse stringSplitReverse=new SplitReverse();
stringSplitReverse.stringSplitReverse("This is Java Programming");
}}
