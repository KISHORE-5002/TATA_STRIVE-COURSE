console.log("hello world")
//number
var a=10
var c=10
var d=12345678901
var e=1e43
console.log(a+c)
console.log(typeof a)
console.log( typeof d)
console.log(typeof e)

//string
let b="messi"
let f='ronaldo'
console.log(typeof b)
console.log(b+"  "+f)
console.log(a==b)


//boolean
let bool=3>2
console.log(bool)
console.log(typeof bool)
//null
let z=null
console.log(z)
console.log(typeof z)
//undefined
let y
console.log(y)
console.log(typeof y)

//arthimatic
console.log(a+c)
console.log(a-c)
console.log(a/c)
console.log(a*c)
console.log(a%c)
console.log("relational")
//relation
console.log(a>c)
console.log(a>=c)
console.log(a<c)
console.log(a<=c)
console.log(a==c) 
console.log(a!=c)
console.log(a===c)
console.log(a!==c)
console.log("logical")
let h=1
let i=0
console.log(h&&i)
console.log(h||i)
console.log(~i)
console.log("bitwise")
console.log(a&c)
console.log(a|c)
console.log(a^c)
console.log(~c)
console.log(a<<c)
console.log(a>>>c)
console.log(a>>c)
console.log("whileloop")

let u=3
let k=5
let sum=0
while(u<=k){
sum=sum+u;
u++;
console.log(sum)
}