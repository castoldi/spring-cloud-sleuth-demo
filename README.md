# spring-cloud-sleuth-demo
Project to demo spring tracing

### Start zipkin in a separated instance
1) Download  https://zipkin.io/quickstart.sh and run it on your windows 10.
2) It will download zipkin.jar
3) java -jar zipkin.jar

Alternatively, you can download the zipkin-server*-exec.jar from maven repo:
https://repo1.maven.org/maven2/io/zipkin/zipkin-server/2.21.7/zipkin-server-2.21.7-exec.jar

Other ways to start zipkin can be found in the URL: https://zipkin.io/pages/quickstart.html

### Starting Spring Boot app and test zipkin
1) Start the SpringSleuthDemoApplication app.
2) Send some GET requests to http://localhost:8080/player
3) Check in zipkin the traces: http://127.0.0.1:9411/

### Issues with ZipKin and Spring Boot Cloud
In theory there should be a way to start zipkin with your Spring Boot app.

However, after Spring Boot 2.0 seems that it stopped working and there is no plan to fix it.
https://github.com/spring-cloud/spring-cloud-sleuth/issues/912

SpringBoot high-level config instructions:
- Add maven dependencies zipkin-server and zipkin-autoconfigure-ui
- Add @EnableZipkinServer in SpringSleuthDemoApplication.java
- Add zipkin.properties