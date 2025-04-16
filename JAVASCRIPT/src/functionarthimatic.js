//without return type
function add(a,b)
{
console.log(a+b)
}
function sub(a,b)
{
console.log(a-b)
}
let a=8
let b=4
let c=add(a,b)
let d=sub(a,b)


//with return type
function div(a,b)
{
return a/b;
}
function mul(a,b)
{
return a*b;
}
let e=div(a,b)
console.log(e)
let f=mul(a,b)
console.log(f)

function person(name,age,gender)
{
console.log("name:"+name,"age:"+age,"gender:"+gender)
}
function dog(dogname,dogage)
{
console.log("dogname:"+dogname,"dogage:"+dogage)
}
let name='mohan'
let age=23
let gender='male'
let p=person(name,age,gender)
let dogname='leo'
let dogage=3
let p1=dog(dogname,dogage)

//anonyms function
let addition=function (a,b)
{
console.log(a+b)
}
addition(5,1)
let subtraction=function (a,b)
{
console.log(a-b)
}
subtraction(5,1)

//arrow fuction
let addition1=(a,b) =>console.log(a+b)
addition(10,1)
let subtraction1=(a,b) =>console.log(a-b)
subtraction1(10,1)
let person2=(name1,age2) =>console.log("name1:"+name1 +"  "+"age2:"+age2)
person2("udi",21)


let multiplication1=(a,b) =>console.log(a*b)
multiplication1(10,2)
let division1=(a,b) =>console.log(a/b)
division1(10,1)
let person3=(pname,page,paddress) =>console.log("pname:"+pname+"    "+"page:"+page+"  "+"paddress:"+paddress)
person3("sachin",22,"blr layout")