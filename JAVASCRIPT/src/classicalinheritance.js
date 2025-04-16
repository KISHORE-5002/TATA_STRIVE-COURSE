class Animal{
constructor(name,age){
this.name=name;
this.age=age;
}
walk(){
console.log("walking")
}
}
class dog extends Animal{
constructor(name,breed){
super(name);
this.breed=breed;
}
walk(){
console.log("walking")
}
}
let obj=new dog("leo","pit bull")
let obj1=new Animal("leo",2)//if we want call parent class
obj.walk();
console.log(obj.name+" "+obj.breed+" "+obj1.age)