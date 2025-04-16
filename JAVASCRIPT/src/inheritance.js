const Animal={
name:"cat",
color:{shape:"circle black",pure:"pure white"},
walk(){
console.log("walking")
}
}
let dog=Object.create(Animal)
console.log(dog.name+" "+dog.color.pure)
dog.walk()
//protypic inheritance