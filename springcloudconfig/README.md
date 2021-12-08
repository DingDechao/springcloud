# Spring cloud Config Server
1.  Add @EnableConfigServer within class SpringcloudconfigApplication
2.  Add file bootstrap.yml
3.  Add file application.yml
4.  Setup profile as native, it means we use local file system
5.  Setup Springcloud config server path
6.  Setup configuration settings for each client(Example : springcloudclient1)

## How to get configuration settings for different environment
```
GET request
http://localhost:8888/springcloudclient1/default
JSON response
{
    "name": "springcloudclient1",
    "profiles": [
        "default"
    ],
    "label": null,
    "version": null,
    "state": null,
    "propertySources": [
        {
            "name": "classpath:/config/springcloudclient1/springcloudclient1.yml",
            "source": {
                "server.port": 8081,
                "spring.application.name": "springcloudclient1",
                "example.property": "This is springcloudclient1 demo"
            }
        }
    ]
}
```
```
GET request
http://localhost:8888/springcloudclient1/prod
JSON response
{
    "name": "springcloudclient1",
    "profiles": [
        "prod"
    ],
    "label": null,
    "version": null,
    "state": null,
    "propertySources": [
        {
            "name": "classpath:/config/springcloudclient1/springcloudclient1-prod.yml",
            "source": {
                "example.property": "This is springcloudclient1-prod demo"
            }
        },
        {
            "name": "classpath:/config/springcloudclient1/springcloudclient1.yml",
            "source": {
                "server.port": 8081,
                "spring.application.name": "springcloudclient1",
                "example.property": "This is springcloudclient1 demo"
            }
        }
    ]
}
```