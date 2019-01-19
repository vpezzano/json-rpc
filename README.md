# json-rpc
Example of exposing JSON-RPC methods with Spring Boot, as described here:
https://dzone.com/articles/is-java-remote-procedure-call-dead-in-the-rest-age

You can invoke the send method of MessageService via the POST call to http://localhost:8080/rpc/messageservice,
with body:

{
    "id": "0",
    "method": "send",
    "params":["Ciao!"]
}

Similarly, you can invoke the validate method of ValidationService via the POST call to http://localhost:8080/rpc/validationservice,
with body:

{
    "id": "0",
    "method": "validate",
    "params":["Ciao!"]
}