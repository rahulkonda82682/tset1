package com.mytask.phonenumbertask;
public class Marks {
void Studentmarks(int Marks)throws CustomException {
if(Marks > 100)
throw new CustomException();
else
System.out.println(Marks+" Marks are valid");
}}

	