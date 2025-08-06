<!-- markdownlint-configure-file { "MD013": { "line_length": 300 } } -->

# ajav-launcher

## General instructions

- Allowed to use any language features up to the latest Java LTS
  - Latest one is Java 25
- Not allowed to use any external libraries, build tools or code generators
- Not allowed to use the default package
- Create your own relevant packages following the Java naming convention
- Do not commit .class files
- Make sure you have both java and javac
- Compile with the following command in the root of the project:

```bash
$find * -name "*.java" > sources.txt
$javac @sources.txt
```

## Mandatory part

Implement the UML diagram given:
![UML class diagram](avaj_uml.png)

Feel free to add more classes or attributes if they're necessary.

### Program behaviour

Your program must take only one argument
Executing your program should generate a `simulation.txt` file:

```text
$java ro.academyplus.avaj.simulator.Simulator scenario.txt

$cat -e simulation.txt
Tower says: Balloon#B1(1) registered to weather tower.
Tower says: JetPlane#J1(2) registered to weather tower.
Tower says: Helicopter#H1(3) registered to weather tower.
Tower says: Helicopter#H4(4) registered to weather tower.
Balloon#B1(1): Let's enjoy the good weather and take some pics.
JetPlane#J1(2): It's raining. Better watch out for lightings.
Helicopter#H1(3): This is hot.
Helicopter#H4(4): My rotor is going to freeze!
Balloon#B1(1): Damn you rain! You messed up my balloon.
JetPlane#J1(2): OMG! Winter is coming!
Helicopter#H1(3): This is hot.
Helicopter#H4(4): My rotor is going to freeze!
Balloon#B1(1): It's snowing. We're gonna crash.
JetPlane#J1(2): It's raining. Better watch out for lightings.
Helicopter#H1(3): This is hot.
Helicopter#H4(4): My rotor is going to freeze!
Balloon#B1(1): Damn you rain! You messed up my balloon.
Balloon#B1(1) landing.
Tower says: Balloon#B1(1) unregistered from weather tower.
JetPlane#J1(2): OMG! Winter is coming!
Helicopter#H1(3): This is hot.
Helicopter#H4(4): My rotor is going to freeze!
```

### Scenario file

Here's an example of the scenario file:

```shell
25
Baloon B1 2 3 20
Baloon B2 1 8 66
JetPlane J1 23 44 32
Helicopter H1 654 33 20
Helicopter H2 22 33 44
Helicopter H3 98 68 99
Baloon B3 102 22 34
JetPlane J2 11 99 768
Helicopter H4 223 23 54
```

The first line has a positive integer that represents the
amount of iterations of the simulation.
Each following line represents an aircraft with the following format:

- TYPE NAME LONGITUDE LATITUDE HEIGHT

### Weather generation

There are 4 types of weather:

- RAIN
- FOG
- SUN
- SNOW

Each 3D point has a weather.
Choose whatever generation algorithm you want.

### Aircrafts

- JetPlane
  - SUN - Latitude increases with 10, Height increases with 2
  - RAIN - Latitude increases with 5
  - FOG - Latitude increases with 1
  - SNOW - Height decreases with 7
- Helicopter
  - SUN - Longitude increases with 10, Height increases with 2
  - RAIN - Longitude increases with 5
  - FOG - Longitude increases with 1
  - SNOW - Height decreases with 12
- Balloon
  - SUN - Longitude increases with 2, Height increases with 4
  - RAIN - Height decreases with 5
  - FOG - Height decreases with 3
  - SNOW - Height decreases with 15

### Simulation

- Coordinates are positive numbers
- Height range is 0-100
- If Height > 100, Height = 100
- Each aircraft has a unique ID, assigned at creation
- If Height <= 0, aircraft lands, unregisters from weather tower and logs a message
- When a weather change occurs, each aircraft type needs to log a message. The format is:
  - TYPE#NAME(UNIQUE_ID): SPECIFIC_MESSAGE
- When the aircraft registers or unregisters from the weather tower, a message will be logged

### Validation

The input file needs to be validated.
Any abnormal behaviour due to anomalous data is not valid.
If the format is not correct, stop execution, logging any error messages.
