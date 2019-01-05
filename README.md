# GCD-Spring-Network

This is an application made with docker and one Java Spring backend, and a tower control which receives the final result.

To start the application fist install **Docker**.
Then run: `dokcer-compose up` to start and create the containers.
To stop them: `docker-compose down`

If changes are intended, the applications need to be rebuild, to do this, enter whichever and run: 
```
   gradlew build 
   docker-compose up --build
```
To make sure all the containers are running, run: `docker ps`

The application returns the GDC of the env variables (values) defined in the docker-compose file.
The final result is sent to the tower-control.

![CMD Run](https://github.com/RaulDr/GCD-Spring-Network/blob/master/gdc-spring-network/res_images/Capture.JPG)
![CMD Run FINISH](https://github.com/RaulDr/GCD-Spring-Network/blob/master/gdc-spring-network/res_images/2019-01-05_17h34_46.png)
