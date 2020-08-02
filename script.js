function CheckPassword(Password, CnfPass) {
alert(Password);
alert(CnfPass);
if (Password == CnfPassword){
return '1';
}
}
types=["Graduation","Post Graduation",];
function filldd()
{
var typeDD=document.getElementById('type');
for(i=0;i<types.length;i++){
var ele=document.createElement('option');
ele.text=types[i];
typeDD.add(ele,i+1)
}
}
data=[['Commerce','ECE','EEE','CSE'],['MA','MTech','MBA']];
function fillData()
{
var typeDDN=document.getElementById('type');
var selectedIdx= typeDDN.selectedIndex;
console.log(selectedIdx);
var dataDD=document.getElementById('dd');
dataDD.innerText=null;
for(i=0;i<data[selectedIdx-1].length;i++)
{
var ele=document.createElement('option');
ele.text=data[selectedIdx-1][i];
dataDD.add(ele,i+1)
}
}

function CheckAll() {

var Name = document.getElementById("Name");
var Password = document.getElementById("Password").value;
var CnfPass = document.getElementById("CnfPassword").value;
if (Name==""){
Name.Placeholder = "enter a name";
return;
}
else if (Password==""){
return;
}
else if (CnfPass == ""){
return;
}
var bool = CheckPassword(Password, CnfPass);
var boolName = false;
var re = new RegExp('[a-zA-Z]', 'g');
if (re.test(Name.value)){
boolName = true;
if (Password==CnfPass){
document.write("check successful");
}
else{
alert('Enter the same password');
}
}
else{
alert('Enter the name in only alphabets');
}
}

