async function fetchData(){
return new Promise((resolve)=>{
setTimeout(()=>{resolve("data fetched successfully")
},3000)
})  
}
async function displayData(){
console.log("data fetching....")
let data=await fetchData()
console.log(data)
}
displayData()