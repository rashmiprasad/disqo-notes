disqo-notes-service

This Service provides REST end points to do CRUD operations . Supports JSON for requests and responses.
All these are without auth in the curl, please add auth info.

# Health check end point
curl -i -H "Content-Type: application/json" -X GET  localhost:8080/ping


# Example URL commands  for Notes related rest usage -

//To create Note
curl -i -H "Content-Type: application/json" -X POST -d '{
        "title": "notes title here",
        "note": "these are user notes.",
        "userId": 2
    }' localhost:8080/user/1/note


//To Get Note by noteId
curl -i -H "Content-Type: application/json" -X GET  localhost:8080/note/14

//To Update note
curl -i -H "Content-Type: application/json" -X PUT -d '{
       "title": "notes title",
       "note": "updated these are user notes.",
       "userId": 1,
       "id": 14
   }'  localhost:8080/note/14

//To Get note for a specific user
curl -i -H "Content-Type: application/json" -X GET  localhost:8080/user/1/note

//To Delete Note
curl -i -H "Content-Type: application/json" -X DELETE  localhost:8080/note/14

Basic http auth info added to curl -
curl -i -H "Content-Type: application/json" -X GET localhost:8080/note/13 -u user:password


------
Docker addon -
- Added Dockerfile
- Built the container - docker build --build-arg JAR_FILE=build/libs/disqo-notes-service-1.3-0.jar -t springio/gs-spring-boot-docker .
- container coming up - 
    - $ docker build -t springio/gs-spring-boot-docker .
      $ docker run -p 8080:8080 springio/gs-spring-boot-docker

