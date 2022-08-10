# ScalaTest Website
=====================================

[ScalaTest Official Website](https://www.scalatest.org) 

# Development

To run the site locally: 

```
> export APP_SECRET=12345678
> sbt run
```

# Docker

Update version in build.sbt, then publish docker image locally: 

```
> sbt docker:publishLocal
```

Optionally, you can run published local docker image (please replace APP_SECRET value): 

```
docker container run --env APP_SECRET=<replace-secret-here> --publish 9000:9000 --detach --name scalatest-website.svc artima/scalatest-website
```