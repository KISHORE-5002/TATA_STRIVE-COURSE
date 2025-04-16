class person{
#name="ravi";
#age=18;
setName(newName){
this.#name=newName
}
setAge(newAge){
this.#age=newAge
}
getName(){
return this.#name;
}
getAge(){
return this.#age;
}
}
let obj=new person()
obj.setName("aravind")
obj.setAge(17)
console.log(obj.getName()+" "+obj.getAge())

