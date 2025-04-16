const fetchData =(sucess)=>{
return new Promise ((resolve,reject)=>{
setTimeout(()=>{
if(sucess){
resolve("data has been fetched")}

else{
reject("data has not be fetched")
}
},3000)
})
}
fetchData(false)
.then((data)=>console.log(data))
.catch((error)=>console.log(error))


