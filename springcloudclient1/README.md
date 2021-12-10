# Spring cloud Config Client
1. Start service springcloudconfig first
2. Setup application.properties
3. Start service springcloudclient1

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