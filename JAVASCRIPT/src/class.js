class Animal{
constructor(name,color)
{
this.name=name
this.color=color
}
walk()
{
console.log("animal can walk")
}
}
let obj =new Animal("dog","black")
console.log(obj.name+" "+ obj.color)
obj.walk();

