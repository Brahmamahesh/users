# users
I developed  an application in java which provides a REST API with endpoints for searching, creating and deleting “server” objects

To implement this application, we will need to use the following technologies:

1)Java 11+
2)Spring Boot
3)Spring Data MongoDB
4)MongoDB
5)Postman or any other HTTP client

Step 1: Install MongoDB

     *Download and install MongoDB on your local machine or set up a cloud-based MongoDB service.
     *In my project I set up a cloud based MongoDB service.

Step 2: Set up the project

     *Create a new Spring Boot project using your preferred IDE or using the Spring Boot Initializr website. 
     *Add the following dependencies to your pom.xml file.
           1)Spring Web
           2)Spring Data MongoDB
           
Step 3: Configure the MongoDB connection

      *Open the application.properties file and add the following configuration
         spring.data.mongodb.uri=mongodb+srv://bp1843:Pvsmb123@cluster0.exbd27r.mongodb.net/?retryWrites=true&w=majority
         spring.data.mongodb.database=Test
          
      *This configuration tells Spring to connect to a MongoDB instance running on the local machine on port 8080, using a database named 'Test'.
      
 Step 4: Create the server entity

      *Create a new Java class named Server with the following attributes
      
Step 5: Create the server repository

       *Create a new interface named ServerRepository that extends the MongoRepository interface.
       *In this interface, we are defining a custom method findByNameContaining that will be used to find servers by name.
     
Step 6: Implement the REST endpoints

       *Create a new Java class named ServerController
       *In this class, we are using Spring annotations to define the REST endpoints:

               @RestController and @RequestMapping
               @GetMapping with an optional id parameter to retrieve all servers or a single server by ID
               @PutMapping to create a new server
               @DeleteMapping with an id parameter to delete a server
               @GetMapping with a name parameter to find servers by name
              
Step 7: Run the application

         Run the application and test the endpoints using Postman or any other HTTP client.
         
        
 
 #OUTPUT: 
 # Screenshots:
 
 1) This screenshot shows my application Response to Request using postman
   ![Screenshot 2023-04-27 015916](https://user-images.githubusercontent.com/89354212/235359154-c1d98710-6189-4eba-a8af-f32366527138.png)
   
2)  This screenshot shows the get response to Request by name using postman
   ![Screenshot 2023-04-27 020008](https://user-images.githubusercontent.com/89354212/235360821-6120ef4e-c371-4416-b3ef-8994d5aaa054.png)
   
3)  This screenshot shows the get response to Request by id using postman
  ![Screenshot 2023-04-27 020137](https://user-images.githubusercontent.com/89354212/235361228-de5b06d7-0642-45d9-bc34-75fecafd4cb4.png)
  
4)This screenshot shows the before the delete response
![Screenshot 2023-04-27 021143](https://user-images.githubusercontent.com/89354212/235362738-6af74350-0992-4362-9de4-f7aac193c178.png)

5)This screenshot shows the delete request
![Screenshot 2023-04-27 021203](https://user-images.githubusercontent.com/89354212/235362846-bf2ab4d3-ae2c-41ba-a6d1-ca8a39ccc17a.png)

6)This screenshot shows the after delete request, the requested document was deleted from cloud database.
![Screenshot 2023-04-27 021045](https://user-images.githubusercontent.com/89354212/235361543-8e8dea29-a20b-44f8-a48c-f56d2ce0ab21.png)




       







