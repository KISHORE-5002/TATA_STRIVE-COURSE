function Demo(name,age)//constructor starting is capital
{
    this.name=name
    this.age=age
    this.details=function()
    {
    console.log("hello world")
    }
}
let one= new Demo("arun",22)
let two=new Demo("hari",33)
console.log(one)
console.log(two)
one.details()

function Student(student_rollno,student_name,student_age,student_address,student_percentage)
{
    this.studentSrollno=student_rollno
    this.student_name=student_name
    this.student_age=student_age
    this.student_address=student_address
    this.student_percentage=student_percentage
}
let s1=new Student(1,"kiran",17,"blr layout",75)
let s2=new Student(2,"karan",18,"kr layout",65)
let s3=new Student(3,"saran",18,"kr pura",55)
let s4=new Student(4,"ram",17,"tin factory",45)
let s5=new Student(5,"murali",16,"blr layout",70)
console.log(s1)
console.log(s2)
console.log(s3)
console.log(s4)n
console.log(s5)

