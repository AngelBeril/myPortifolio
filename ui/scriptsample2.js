console.log("Welcome all");
//scope
var input1 = 10;
var input1 = 15;
console.log(input1);

let input2 = 10;
// let input2 = 20; // not allowing here
input2 = 20;
console.log(input2);

const input3 = 25;
// input3 = 30; // can't reassign throw error
console.log(input3);

// if
let name = "jesvin";
let answer;
if(name){
    console.log(answer);
    answer = ` Hello ${name}`;
} else{
    answer = "Sorry u r not eligible";
}

console.log(answer);
//switch
let number1 = 1;
switch(number1){
    case 1:
        console.log("This is number 1");
        break;
    case 2:
        console.log("This is number 2");
        break;
    default:
        console.log("Wrong data");
}

// Ternary Operator

let answer1 = name? ` Hello ${name}` : "Sorry";
console.log(answer1);

let mark = 100;
let score = mark > 99 ? "Rank1" : mark > 90 ? "Rank 2" : mark > 85 ? "Rank 3" : "Rank4";

console.log(score);

// loop
let input4 = 0;
while(input4<=10){
    console.log(input4);
    input4 = input4+2;
}

for(let i = 0; i <= name.length; i++){
    console.log(name.charAt(i));
}

// Function
function display(){
    console.log("Hello I am Method");
}

display();

// Array
let exampleArray = [];
exampleArray[0] = "Arun";
exampleArray[1] = "Jesvin";
exampleArray[2] = "Ratheesh";
console.log(exampleArray);
console.log(exampleArray[1]);

// Object
let obj1 = {name3:"Ratheesh"};
console.log(obj1);
let obj2 = {name3:"Arun",
    mark : 100,
    address : { door : 101,
        street : "KK",
        village : "RTP"},
    grade : "A"
    };
console.log(obj2);
console.log(obj2.grade);
console.log(obj2.address.door);

//interact

if(name){
    alert(` Hello ${name}`);
    console.log(` Hello ${name}`);
}

if(name){
    confirm(` Hi ${name}`);
    console.log(` Hi ${name}`);
    
    
}
if(obj2.name3){
    prompt(` Welcome ${obj2.name3}`);
    console.log(` Welcome ${obj2.name3}`);
}









// scope -
// let
//const
// var
