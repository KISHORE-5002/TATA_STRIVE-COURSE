let data=new Map()
data.set("ajith","kumar")
data.set("srinivasa","baskar")
data.set("naveen","balamurugan")
data.set("naveen","kumar")//it will take last one
console.log(data.keys())//it take's key value
console.log(data.get("naveen"))
console.log(data.has("ajith"))//it tell true or false

for(let [k,v] of data)
{
console.log(k,":",v)
}//for of method
data.forEach((v,k)=>{console.log(k+" "+v)})
data.forEach((k,v)=>{console.log(v+" "+k)})//for each method