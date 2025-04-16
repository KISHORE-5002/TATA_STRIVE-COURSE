function Person(){
let _name="ram";
let _age=18;
this.setName=function(newName){
_name=newName
}
this.setAge=function(newAge){
_age=newAge
}
this.getName=function(){
return _name;
}
this.getAge=function(){
return _age;
}
}
let obj=new Person()
obj.setName("arvi")
obj.setAge(19)
console.log(obj.getName()+"  "+obj.getAge())

