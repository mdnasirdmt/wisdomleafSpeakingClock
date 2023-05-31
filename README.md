Speaking Clock API
The Speaking Clock API provides a service to convert the given time into words.

## Prerequisites
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)
- [Maven 3.9.2](https://maven.apache.org)
- Access to [Git Repository](https://github.com/mdnasirdmt/wisdomleafSpeakingClock.git)
- [Swagger 2](http://localhost:8080/swagger-ui/index.html)

## Initializing
- **Repository Setup**

  git clone https://github.com/mdnasirdmt/wisdomleafSpeakingClock.git
    ```
      cd speakingClock
    ```

  - **Java Setup**

      - Download Java 17
      - Download and install from https://www.oracle.com/java/technologies/downloads/#java17
      - Check java version:
         ****
    ``
      java -version
    ``

- **Maven Setup**
    - Download and install from https://maven.apache.org/install.html
    - For Path setup edit .zshrc file with below data
      ****
          export JAVA_HOME=$(/usr/libexec/java_home)
          export M2_HOME="/Users/mohammad.shahruk/Documents/apache-maven-3.8.6"
          export MAVEN_HOME=$M2_HOME
          export M2=$M2_HOME/bin
          PATH="$M2_HOME/bin:$JAVA_HOME/bin:$PATH"
          export PATH
    - Check maven version:
      ****
          mvn -version
    - Download Sample settings.xml file for proxy setup [setting.xml](http://10.5.7.22:8090/download/attachments/18944688/settings.xml?version=1&modificationDate=1590068844523&api=v2)
    - Replace the settings.xml inside .m2 folder. The .m2 folder can be found at the home directory of the system.


- **InteliJ Setup Steps:**
    - Go to https://www.jetbrains.com/idea/download/  and download InteliJ IDEA Ultimate
    - Create the User with your IDFC Mail Id follow the instruction with this link https://www.jetbrains.com/help/idea/register.html.
    - Go to Maven tab on right side of InteliJ -> Click on Settings Symbol( Screw driver icon) and then give the path of settings.xml mentioned in the above step.
    - Download the Lombok.zip file compatible with your version of InteliJ. Then Goto InteliJ IDEA in Menu Bar -> Click Preferences -> Select Plugins -> click on settings -> Install from disk. Restart InteliJ.


# To build the Speaking Clock API, follow these steps:

Clone the repository: 
    git clone https://github.com/your/repository.git

Navigate to the project directory: 
    cd speakingClock

Build the project using your preferred build tool. For example, with Maven: 
        ```
            mvn clean install
        ```

Deployment

# step to build and run wisdomleafSpeakingClock project

Deploying as a standalone Spring Boot application
   Build the project using the instructions mentioned in the "Build" section.
   Run the generated JAR file (speakingClock-0.0.1-SNAPSHOT.jar) using the following command: 
        java -jar speakingClock-0.0.1-SNAPSHOT.jar

   The API will be accessible at 
        http://localhost:8080/current-time?time=12:30. 
   You can customize the port by modifying the application.properties file.
        server.port=8081

   API Documentation
   The API documentation is available using the Swagger UI. After deploying the application, you can access the documentation at 
        http://localhost:8080/swagger-ui/index.html.

Configuration
    You can modify the application configuration by editing the application.properties file located in the src/main/resources directory.

Testing
The Speaking Clock API includes unit tests and integration tests. You can run the tests using your preferred build tool. For example, with Maven: 
        mvn test.


## Build and local run

- **With Maven**

   ```
       mvn clean install
       mvn spring-boot:run
   ```
  

## Use of Make Command

- Installs dependencies and create executable
    - For Building Application
       ****
        mvn clean install


- **Swagger URLs**
        http://localhost:8080/swagger-ui/index.html

<<<<<<< HEAD
  
=======
  
>>>>>>> 93f4ce223056db518b70f1eae17434d0a6c9f47c
