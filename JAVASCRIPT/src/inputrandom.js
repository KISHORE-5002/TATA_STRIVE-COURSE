let data=[]
data[0]=4
data[99]=3
console.log(data)
for(let n of data)  //for of //it used to print 0 to 100 from the index
{
console.log(n)
}
for(let m in data)  //for in //it used  print the index from the index value
{
console.log(m)
}


//distraction
let value=[1,2,3,4,5]
console.log(value)
let [a,b,c,d,e]=value
console.log(b,c,d,e,a)


let rem="welcome to tatastrive nagawara banagalore karnataka india".split(' ');
console.log(rem)
let [h,i,j,k,l,m,n]=rem
console.log(j,k,l,m,n,h)
