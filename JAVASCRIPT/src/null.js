const prompt=require("prompt-sync")();
let name=prompt("enter the name:");
let age=parseInt(prompt("enter the age:"));
let address=prompt("enter the address:");
let details=function(name,age,address)
{
console.log(name,age,address);
}