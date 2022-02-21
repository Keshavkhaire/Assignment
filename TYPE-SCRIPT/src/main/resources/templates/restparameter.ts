function greet(name:string, ...msg:string[]): string 
{
    return "Hi,"+name+". "+msg.join(", ")+"!";
}
console.log(greet("keshav"));
console.log(greet("keshav","Good Morning","Good Afternoon","Good Evening"));