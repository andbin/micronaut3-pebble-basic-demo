<a name="">![Java 11](https://img.shields.io/badge/Java-11-cd853f "Java 11")</a>
<a name="">![Micronaut 3.8.0](https://img.shields.io/badge/Micronaut-3.8.0-6db33f "Micronaut 3.8.0")</a>
<a name="">![Built with Apache Maven](https://img.shields.io/badge/Built%20with-Apache%20Maven-f76504 "Built with Apache Maven")</a>
<a name="">![MIT License](https://img.shields.io/badge/License-MIT-1081c1 "MIT License")</a>

# Micronaut 3 &ndash; Pebble Basic Demo

This is a basic demo project that shows how to use **[Pebble Templates](https://pebbletemplates.io)** (a template engine for Java) with **[Micronaut](https://micronaut.io) 3**.

## License

This project is released under the **MIT License**, a very *permissive* free software license.

See the full text of the license: **[LICENSE.txt](LICENSE.txt)**

## How to build and run the application

You can build and run the application in different ways (depending on your environment and/or IDE).

#### 1) Using Maven to build a &ldquo;shaded&rdquo; JAR that is easy to run

From command line (in project's main directory):
* run `mvn package`
* go into the `target/` directory
* run `java -jar micronaut3-pebble-basic-demo.jar`

#### 2) Using Maven to directly build&run the application

From command line (in project's main directory):
* run `mvn mn:run`

#### 3) Using the Eclipse IDE

**IMPORTANT**: Micronaut makes use of *annotation processing*, so in Eclipse you need to have the m2e-apt. If you don't have it (or if you are not sure):

* open the marketplace (&ldquo;Help&rdquo; -> &ldquo;Eclipse Marketplace...&rdquo;)
* search: **m2e-apt** (you should find: m2e-apt X.Y.Z where X.Y.Z is a version number)
* if the button on the right shows &ldquo;Installed&rdquo;, you already have it. Otherwise, *install* it
* in any case (especially after the m2e-apt installation), check the global preferences (&ldquo;Window&rdquo; -> &ldquo;Preferences&rdquo;), section &ldquo;Maven&rdquo; -> &ldquo;Annotation Processing&rdquo; and ensure that the option &ldquo;**Automatically configure JDT APT ( ..... )**&rdquo; is checked

Then:

* import the project (&ldquo;File&rdquo; -> &ldquo;Import...&rdquo; then &ldquo;Existing Maven Projects&rdquo; etc...)
* build the project (if &ldquo;Build Automatically&rdquo; is not active)
* locate the `Micronaut3PebbleBasicDemoApp` class and then &ldquo;Run As&rdquo; -> &ldquo;Java Application&rdquo;

**Note**: other IDEs *may* be used, however you must carefully check if and how the IDE uses *annotation processing*.

## How to use the application

Once the application is running, point your preferred browser to [http://localhost:8080](http://localhost:8080). You should see a simple page showing some version informations.
