let a=String(10)
console.log(a,typeof a)
let b=Number("123")
console.log(b,typeof b)
let c=Number("one")
console.log(c,typeof c)
let d=a+b
console.log(d,typeof d)
let f=a+b
console.log(f,typeof f)
let e=null
console.log(e,typeof e)
let g=!c
console.log(g,typeof g)
console.log(Boolean(1))



let z={
name:"kiran",
age:23,
'work exp':4,
bike:{
model:"ns200",
color:"grey",
cc:199,
}
}
console.log(z)
console.log(typeof z)
console.log(z.age)
console.log(z.name)
console.log(z['work exp'])
console.log(z.bike.color)
delete z.age;
console.log(z)
delete z['work exp'];
console.log(z)