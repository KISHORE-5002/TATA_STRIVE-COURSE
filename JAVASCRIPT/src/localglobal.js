let a=1
function demo(a){
let b=2
console.log(a,b)
}
demo(a)
console.log(a)


//three value

function demo(x,y,z){
console.log(x+y+z)
}
demo(1,2,3)//6

//nana arrived due to less in value
function demo1(u,v,w){
console.log(u+v+w)
}
demo1(1,2)

//assigining the value in function parameter
function demo2(s=2,t=3,d=4){
console.log(s+t+d)
}
demo2()