
# Star Wars API in Maven Java

Console java program that displays information in pretty json format about Star Wars world, people etc. Data is downloaded from https://swapi.dev/api API.

## Used dependencies
#### gson
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
#### json
    <dependency>
            <groupId>org.json</groupId>
            <artifactId>json</artifactId>
            <version>20160810</version>
    </dependency>
#### jackson
    <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.9.8</version>
    </dependency>
## How it works
- User can choose between 3 categories and exit button
- If user choose People/Planets/Starships button there will be to options to choose:
    - 1 ) Display full json for People/Planets/Starships
        
    - 2 ) Display specified Person/Planet/Starship by id
    - 3 ) <- Back
- 1 ) button will display all values from json
- 2 ) button will display specified value by id provided by the User
- 3 ) button will take User Back to the main console menu
- Exit button closes the program


## Screenshots

### Main menu
![Main menu](https://github.com/janFranczakk/StarWarsAPI/blob/main/Screenshots/1.png?raw=true)

### 1-3 Button menu
![Button menu](https://github.com/janFranczakk/StarWarsAPI/blob/main/Screenshots/2.png?raw=true)

### Display full json
![Display full json](https://github.com/janFranczakk/StarWarsAPI/blob/main/Screenshots/3.png?raw=true)

### Display specified
![Display specified](https://github.com/janFranczakk/StarWarsAPI/blob/main/Screenshots/4.png?raw=true)
