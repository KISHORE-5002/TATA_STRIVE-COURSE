import axios from 'axios'
axios.get("https://jsonplaceholder.typicode.com/posts/1")
.then(response=>console.log(response.data))     //api


fetch("https://jsonplaceholder.typicode.com/posts/1")
.then(response=>response.json())
.then(data=>console.log(data))//fetch


async function fetchData(){
let response=await fetch("https://jsonplaceholder.typicode.com/posts/1")
let data1=await response.json()
console.log(data1)
}
fetchData()