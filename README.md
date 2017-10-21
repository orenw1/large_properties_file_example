# Example of Spring Boot application with large properties file

show an issue of the application startup time when using large properties file

Application use @PropertySource("classpath:large-prop-number.properties")

scenario:
   
dependency spring-boot-starter-parent 1.5.2.RELEASE and spring-cloud-config-server 1.2.3.RELEASE:
  * file contains 6000 metrics short key name: startup time ~12 seconds.
  * file contains 6000 metrics long key name:  startup time ~23 seconds.


dependency spring-boot-starter-parent 2.0.0.M5 and spring-cloud-config-server 2.0.0.M2:
  * file contains 6000 metrics short key name: startup time ~12 seconds.
  * file contains 6000 metrics long key name:  startup time ~12 seconds.


# recreate

  * src/main resources directory contain 2 versions of properties files
    one with short key names and one with long key names
   
  * the file that is loaded is large-prop-number.properties
  * copy the file according to the scenario you want to test

  * build the project: mvn clean install
  * run runApp script
  * check the start up time in log 

