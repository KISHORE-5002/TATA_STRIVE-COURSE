//let data=[1,2,3,4,5]
//console.log(data[0])
//console.log(data.length)




//let data=new Array();
//data.push(10);

//data.push(20);
//data.push(30);//insert in last
//data.push(40);
//console.log(data);
//data.pop(data); //delete in last
//console.log(data);


let data=[3,"murali",{name:"karan"},function(){console.log("hello teams");}]
console.log(data)
data[3]();
console.log(data[3])


let value=[1,2,3,4,5]
value.shift() //delete in front
value.unshift(11)//infront it will instert
value.splice(3)//it delete from the index of we given
console.log(value)

let add=[9,8,7,6,5]
add.splice(1,2)//it delete from index we give and strop to the range we given
console.log(add)

let addins=[6,5,4,3,2,1,9,8,7]
addins.splice(1,4,6,5,4,3)//it delete from index we give and strop to the range we given and add the value after we added
console.log(addins)