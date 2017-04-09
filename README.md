Drools Experiments With Spring Boot
===
 __Note that the project has been mirrored from :__ https://github.com/gratiartis/buspass-ws

If you are behind a public nexus group repository, you need to add jboss public releases to your public nexus group.

You can run the application from Intellij. 

After running the application send a request to the API using curl or your favourite web browser. 
As described by the rules, if you request a bus pass for a person with age less than 16, you should see a ChildBusPass 
and for someone 16 or over, you should see an AdultBusPass.

For example, opening http://127.0.0.1:8080/buspass?name=Steve&age=15 gives me:
    
    {"person":{"name":"Steve","age":15},"busPassType":"ChildBusPass"}
    
... and opening http://127.0.0.1:8080/buspass?name=Steve&age=16 gives me:
    
    {"person":{"name":"Steve","age":16},"busPassType":"AdultBusPass"}

