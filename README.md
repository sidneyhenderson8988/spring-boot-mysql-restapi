# Sample Spring Boot Rest API
A Rest Api that uses CRUD functionality with a MySQL database. This API communicate with a Technologies table that contains information about popular technologies.



## Technologies Used
- Springboot - version 4.19.0
- MySql - version 8.0.32
- Java - version 19
- Postman - version 10.16



## Setup

### Database Script

Copy and Paste this MySql script in your MySql Workbench.
Be sure to select a database to use!

```MySql
USE <your_database_name>;

CREATE TABLE technologies (
   id INT,
   name VARCHAR(50),
   year INT,
   company  VARCHAR(50)
);

INSERT INTO technologies (id, name, year, company)
VALUES ('1','Java', 1996, 'Sun Microsystems'),
('2','Python', 1991, 'Python Software Foundation'),
('3','NodeJs', 2009, 'Microsoft'),
('4','C++', 1983, 'Bjarne Stroustrup'),
('5','Ruby', 1996, 'Yukihiro Matsumoto');

SELECT * FROM technologies;
```

### Postman Collection

Copy this block below into a notepad file. Be sure to give that file the .json extension.
Then, import that file into Postman. There are 6 endpoints in total.

```Postman
{
	"info": {
		"_postman_id": "9c22e27a-638e-4ff9-b1f3-8d38b08e62aa",
		"name": "Test Endpoints",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "GET All Technologies",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/api/v1/techologies/all",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"v1",
						"techologies",
						"all"
					]
				}
			},
			"response": []
		},
		{
			"name": "GET By name",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/api/v1/techologies?name=java",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"v1",
						"techologies"
					],
					"query": [
						{
							"key": "name",
							"value": "java"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "GET By id",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/api/v1/techologies/2",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"v1",
						"techologies",
						"2"
					]
				}
			},
			"response": []
		},
		{
			"name": "POST Add a new Technology",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"id\": 6,\r\n    \"name\": \"SQL\",\r\n    \"year\": 1989,\r\n    \"company\": \"Raymond Boyce\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/v1/techologies/addNewTech",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"v1",
						"techologies",
						"addNewTech"
					]
				}
			},
			"response": []
		},
		{
			"name": "PUT Update record or Add new",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"id\": 7,\r\n    \"name\": \"Test\",\r\n    \"year\": 2023,\r\n    \"company\": \"Some Company\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/v1/techologies/updateTech/7",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"v1",
						"techologies",
						"updateTech",
						"7"
					]
				}
			},
			"response": []
		},
		{
			"name": "DELETE Technology by id",
			"request": {
				"method": "DELETE",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/api/v1/techologies/7",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"v1",
						"techologies",
						"7"
					]
				}
			},
			"response": []
		}
	]
}
```



### Running the application and using Postman

1. Launch the Spring Boot application, you should see these two lines at the bottom of the logs:
  : Tomcat started on port(s): 8080 (http) with context path ''
  : Started DemoNathanApplication in 2.282 seconds (process running for 2.671)

2. Make sure your MySql workbench is running on localhost:3306

3. After importing the Postman collection (above) into Postman, you should see a list of available endpoints.

4. Have fun!



### To do:
- Implement more features
- Implement more endpoints
- Implement security, possibly tokenization?



## Credit
Created by Sidney Henderson for demonstration purposes
