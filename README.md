# Blog Application API using Spring Boot #
## Technologies ##
1. Spring Boot
2. MySQL 

#### As the schema of this application contains a OneToMany Relation (Comments to Post), I selected MySQL which is a SQL relational database to keep the track of relations inbetween the table data. 
## Schema ##
### Post Table
Column | Datatype 
-------|---------
id     |     int(PK,AI) 
title  | varchar  
content| varchar

### Comment Table
Column | Datatype 
-------|--------- 
id     |     int 
post_id| int     
message| varchar 

## API Endpoints
### Posts
1. #### GET  - /posts - Get all the blog posts
2. #### POST  - /posts - Add a new blog post
3. #### GET  - /posts/id - Get a blog post by id
4. #### DELETE  - /posts/id - Delete a blog with given id
5. #### PUT  - /posts/id - Updates a blog with given id
### Comments
1. #### GET  - /posts/postid/comments - Get all the comments of a blog post with given id
2. #### POST  - /posts/postid/comments - Adds a new comment to a blog post with given id 

## Variables
#### Post
* int id
* String title;
* String content;

#### Comment
* int id
* int post_id;
* String message;

## Postman Collection
https://www.getpostman.com/collections/f8e55334485a023cc2e9
