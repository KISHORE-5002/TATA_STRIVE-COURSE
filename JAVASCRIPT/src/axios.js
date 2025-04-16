import axios from'axios'
axios.get("https://jsonplaceholder.typicode.com/posts/1")// to install use npm install axios
.then(response=>console.log(response.data))