# Spring cloud Config Client
1. Start service springcloudconfig first
2. Setup application.properties
3. Start service springcloudclient1
4. Regist springcloudclient to springcloudeureka
5. Add springcloud openfeign

## How to verify properties which getting from config service
### Check service springcloudclient1 is up
```
Get Request
http://localhost:8081/actuator/
Response
{
    "_links": {
        "self": {
            "href": "http://localhost:8081/actuator",
            "templated": false
        },
        "health": {
            "href": "http://localhost:8081/actuator/health",
            "templated": false
        },
        "health-path": {
            "href": "http://localhost:8081/actuator/health/{*path}",
            "templated": true
        }
    }
}
```
### Check the property which getting from config service
```
Get Request
http://localhost:8081/helloworld
Response
This is springcloudclient1 demo
```
### Check from spring cloud service registry eureka
```
http://localhost:8761/
http://localhost:8761/eureka/apps
http://localhost:8761/eureka/apps/SPRINGCLOUDCLIENT1
```
### Add spring cloud openFeign
```
http://localhost:8081/testFeignClient
Response:
This is springcloudclient2 demo
```

