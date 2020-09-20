## Gradle commands:
* Dependencies in: **/build.gradle**
* List tasks: **>> ./gradlew tasks**
* Run app: **>> ./gradlew bootRun**

## Data in database:

H2 test url:
* http://localhost:8080/h2-console
* log text: H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:d28a9bb1-9c12-4d22-a979-5ef7092c42ee'
* set spring.datasource.url: jdbc:h2:mem:mydatabase in application.properties|yml to have same db name with each deploy

Schema:
* If there’s a file named schema.sql in the root of the application’s classpath, then the SQL in that file will be executed against the database when the application starts. 
* **schema.sql** in the **src/main/resources/** folder.

Data (insert statements):
* Add spring.jpa.hibernate.ddl-auto=none in application.properties|yml to make Spring use data.sql
* **data.sql** in **src/main/resources/** folder.