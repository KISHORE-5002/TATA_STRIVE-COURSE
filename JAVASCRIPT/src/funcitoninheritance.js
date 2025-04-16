function Animal(name){
this.name=name
}
function Dog(name,breed)
{
Animal.call(this.name)
this.breed=breed
}
let obj=new Dog("leo","pitbull")
console.log(obj)//in object
console.log(obj.name+" "+obj.breed)