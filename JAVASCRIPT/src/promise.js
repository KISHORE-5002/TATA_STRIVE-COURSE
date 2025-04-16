const fetchData=()=>{
return new Promise((resolve,reject)=>{
setTimeout(()=>{
resolve("data fetch")
},3000)
});
}
fetchData()
.then((data)=>console.log(data))
.catch((error)=>console.log(error))