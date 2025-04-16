let data=[1,2,3,4,5]
//data.forEach((m,n)=>{console.log(m+n)})    //foreach using arrow function
let r=data.filter(n=>n%2==0) //filter the value
.map(n=>n*n)    //selected value using
.reduce((a,b)=>a+b)         //reduce into less
console.log(r)