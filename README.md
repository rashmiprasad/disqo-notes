disqo-notes-service

This Service provides REST end points to do CRUD operations . Supports JSON for requests and responses.

# Health check end point
curl -i -H "Content-Type: application/json" -X GET  localhost:8080/ping


# Example URL commands  for Notes related rest usage -

//To create Note
curl -i -H "Content-Type: application/json" -X POST -d '{
        "title": "notes title here",
        "note": "these are user notes.",
        "userId": 2
    }' localhost:8080/1/note


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
