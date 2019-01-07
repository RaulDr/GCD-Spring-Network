# GCD-Spring-Network

This is an application made with docker and one Java Spring backend, and a tower control which receives the final result.

To start the application fist install **Docker**.
Enter the 2 sub folders `/gdc-spring-network` and `/gdc-spring-towercontrol` and run: `gradlew build` for bouth of them.
Then run: `dokcer-compose up` to start and create the containers.
To stop them: `docker-compose down`

###### Run the application:
To start the application, make a get request to "localhost:8081/start" (the port could be either 8081, 8082, 8083). Do not expect a rest
response, the function is a **void**. Look for the final result in the console.

If changes are intended, the applications need to be rebuild, to do this, enter whichever and run: 
```
   gradlew build ( in ...\GCD-Spring-Network\gdc-spring-network\gdc-spring-network and ..\GCD-Spring-Network\gdc-spring-network\gdc-spring-tower-control)
   docker-compose up --build ( in ...\GCD-Spring-Network\gdc-spring-network)
```
To make sure all the containers are running, run: `docker ps`

The application returns the GDC of the env variables (values) defined in the docker-compose file.
The final result is sent to the tower-control. At the moment, the env variables are 32, 12, 4.

![CMD Run](https://github.com/RaulDr/GCD-Spring-Network/blob/master/gdc-spring-network/res_images/Capture.JPG)
![CMD Run FINISH](https://github.com/RaulDr/GCD-Spring-Network/blob/master/gdc-spring-network/res_images/2019-01-05_17h34_46.png)
