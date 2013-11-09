Boilerplate code for creating flexible and clean RESTful services using Spring 3.
This project uses a java-based config and a JPA connection to a MySQL DB.
This project is also CORS aware and can be used easily with JQuery from another domain than the dataserver without any modifications.
Don't hesitate to fork and star the project if you like it.

The POM is inherited from another project that I don't remember, but has changed since from.

## What you have to do to run this code
  * Change Application.class to connect your DB
  * Run Application.main() (Spring boot so no servlet container needed)

## How does it work
  If you have ever developed using Spring you should understand all the code that is quite simple,
  buf if you're not experienced, reading this section could be time-saving.
  Here's the main points on how it work:
  
  * Controllers should define the URLs and maybe get specific parameters (custom HTTP headers ...).
    Then it uses services (that are passed to the controller using dependency injection) to perform what it has to.
    The @ReponseBody annotation tells that the response has to be JSON encoded (using Jackson). The responses should
    return a header (see controller example) to allow CORS to work fine.
  
  * Services receive all the paramaters from controllers and treat them (DB access using Repositories, calculation, etc)
    Services should precise if they use the DB with @Transactionnal annotation.
  
  * Repositories are interfaces whose source code is generated via Hibernate.
  
  * Models are POJOs and are marked with annotations to configure their comportment with the DB.
  
  * webapp is the directory where you can add your static content
  
  * application.properties defines the properties of the application such as the port used (8080 by default)

## More infos
  * CORS: http://zhentao-li.blogspot.fr/2013/06/example-for-enabling-cors-support-in.html
  * Spring boot: http://spring.io/blog/2013/08/06/spring-boot-simplifying-spring-for-everyone
