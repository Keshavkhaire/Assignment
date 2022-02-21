function myFunction(){
    var name="keshav khaire";
    function printName(){
        alert("My Name is : "+name);
        console.log("My Name is : "+name);
    }
    printName();
}
myFunction();
var yourFunction=myFunction();
//yourFunction();
//=============================================================
function addition(a){
    return function(y){
        return a+y;
    };
}
var first=addition(5);
var second=addition(10);
console.log("5+15 = "+first(15));   // answer will be 20
console.log("10+30 = "+second(30)); // 40