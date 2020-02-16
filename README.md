# Problem Statement
I own a multi-storey parking lot that can hold up to 'n' cars at any given point in time. Each slot is given a number starting at 1 increasing with increasing distance from the entry point in steps of one. I want to create an automated ticketing system that allows my customers to use my parking lot without human intervention.

When a car enters my parking lot, I want to have a ticket issued to the driver. The ticket issuing process includes us documenting the registration number (number plate) and the colour of the car and allocating an available parking slot to the car before actually handing over a ticket to the driver (we assume that our customers are nice enough to always park in the slots allocated to them). The customer should be allocated a parking slot which is nearest to the entry. At the exit the customer returns the ticket which then marks the slot they were using as being available.

Executing the program:

1.	Unzip
2.	Open console and go to the location
3.	./parking_lot.sh    -   This will build the code, run the tests and now you can use the console for executing the various commands
4.	./parking_lot.sh file_inputs.txt  - This will build the code, run the tests and execute the commands from the file and print the output

Source Code Details:
1.	All the source files can be found in package com.gojek.parkinglot inside src/main/java
2.	All the Junit tests ParkinglotTest & ParkingLotIntegrationTest can be found inside test/java

Other Files:
1.	Parking_lot.sh file can be used to execute the programs (both command line and file based)
2.	File_inputs.txt contains the sample input file as provided with the case study.
