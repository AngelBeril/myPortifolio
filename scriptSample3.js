console.log("Welcome all to Java script");
const studentData = {
    name : "Arun",
    mark : 100,
    grade : function(){
        console.log("I am getting A grade");
    }
};
const nameeee = "xxxx";
console.log(studentData.name);
studentData.grade();
// class
class studentDetails{
    dept = "IT";
    #college = "FX";

    constructor(name, mark){
        this.name = name;
        this.mark = mark;
    }
    getGrade(){
        return this.grade;
    }

    setGrade(grade){
        this.grade = grade;
    }

    display(){
        return `Your name is ${this.name} and ur mark is ${this.mark} ur grade ${this.grade} dept ${this.dept} and collge is ${this.#college}`;
    }

}

const stu = new studentDetails("Arun", 100);
stu.setGrade("A");
console.log(stu.display());

//Inheritance
class childStudent extends studentDetails{

    
}
const chiObj = new childStudent();
console.log(chiObj.display());


class Student1{

    
}
const chiObj1 = new childStudent();
console.log(chiObj1.display());

// entire class run - child data. new class data

