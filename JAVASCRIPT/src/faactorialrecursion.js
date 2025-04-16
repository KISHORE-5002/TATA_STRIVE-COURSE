function demo(n)
{
if (n==0)
return 1
else
return n*demo(n-1);//factorial concept
}
let n=5;
let r=demo(n)
console.log(r)