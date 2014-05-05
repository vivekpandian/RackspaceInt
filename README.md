
Instructions to deploy/run Fibanocci Service.

1. Run the project on cloud.
  
 Deployed the project on openshift. you can use the following steps  to test the project.
  
 Step 1: open any tool such as POSTMAN or RestClient to test the Rest API.
 
          1. set the url as 
          		http://fibanocciservice-fibanocci.rhcloud.com/api/v1/fib/{n}  
          		
          	where {n} should be replaced any number.For example, to find the first 5 fibanocci numbers, the url would be 
          	
          		http://fibanocciservice-fibanocci.rhcloud.com/api/v1/fib/5
          		
          2. set the method as "GET"
          
          3. set Accept Header as "application/json"
          
 step 5: you would get the response in json format.
 
2. Deploy and Run the app on local 


Since this is a gradle project, it's adviced to setup gradle to execute the project. Though gradle wrappers are provided, it's not recommended.

step 1 : clone the repo to your local machine

step 2 : cd to your project directory

step 3:  Deploy the project to InMemory Jetty Container using the following command.
         
         	<promopt>gradle clean jettyRunWar
         	
         if gradle is not installed, use the following command
         	
         	<promopt>gradlew clean jettyRunWar
         
         Jetty server will be started on port 8080 and you will see the message ":jettyRunWar > Running at http://localhost:8080/fibanocci".
         
step 4 : Now, open any tool such as POSTMAN or RestClient to test the Rest API.
         
         1. set the url as 
         
         		http://localhost:8080/fibanocci/api/v1/fib/{n}  
         		
         	where {n} should be replaced any number.For example, to find the first 5 fibanocci numbers, the url would be 
         	
         		http://localhost:8080/fibanocci/api/v1/fib/5
         
         2. set the method as "GET"
         
         3. set Accept Header as "application/json"
         
step 5: you would get the response in json format.


3. Run the tests on local.
 
step 1: make sure, the REST service (if not, follow the above 4 steps) is deployed on your local machine.

step 2: cd to the project directory.

step 3: Run the following command.

        	<promopt>gradle test
        	
        if gradle is not installed, use the following command
        	
        	<prompt>gradlew test
        	
step 4: Test reports will be generated at the following location  <PROJECT_HOME>\build\reports\tests\index.html
        