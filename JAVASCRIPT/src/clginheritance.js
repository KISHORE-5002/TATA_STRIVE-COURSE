const College=
{
name:"kishore",
dept:"b.tech.it",
year:{first:1,second:2,three:3,four:4},
clg(){
console.log("ER.PERUMAL MANIMEKALAI COLLEGE OF ENGINEERING")
}
}
let student=Object.create(College)
console.log(student.name+" "+student.dept+" "+student.year.four)

student.clg()
