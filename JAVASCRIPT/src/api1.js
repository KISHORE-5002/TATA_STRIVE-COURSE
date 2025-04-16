import axios from 'axios'
axios.get("https://jsonplaceholder.typicode.com/posts/1")
.then(response=>console.log(response.data))




fetch("https://jsonplaceholder.typicode.com/posts/1")
.then(response=>response.json())
.then(data=>console.log(data))



async function fetchData(){
let response=await fetch("https://jsonplaceholder.typicode.com/posts/1")
let data2=await response.json()
console.log(data2)
}
fetchData()