fetch("https://jsonplaceholder.typicode.com/posts/1")
.then(response=>response.json())
.then(data=>console.log(data))//if url is crt it will run
//other wise we want to use catch method
//async fetch