function neverUseKeyword(name: string): never 
{
    throw new Error(name);
}
function withoutParameter(): never 
{
    while (true) { console.log("This is Sample Code"); }
    console.log("This is Sample Code");
}
neverUseKeyword("Tarkeshwar");
withoutParameter();