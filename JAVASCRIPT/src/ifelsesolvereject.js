const fetchData=(success)=>{
return new Promise((resolve,reject)=>{
setTimeout(()=>{
if(success)
{
resolve("data fetch successfully");
}
else
{
reject("unable to fetch data")
}
},3000)
});
}
fetchData(false)
.then((data)=>console.log(data))
.catch((error)=>console.log(error))