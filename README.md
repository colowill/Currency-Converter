## Currency Converter
A Java-based personal currency converter that utilizes the JSoup library to scrape real-time exchange rates from the web. This tool supports conversion for over 50 of the world’s most utilized currencies and strengthens data manipulation processes through efficient web scraping techniques.

## Features:

	 • Real-time currency conversion using up-to-date exchange rates.
	 • Supports over 50 currencies from around the globe.
	 • Intuitive terminal-based UI.

## Prerequisites:
	• Java JDK 8 or higher installed on your system.
	• Apache Maven for dependency management 
## Installation
	1. In your preferred IDE go to Team -> Git -> Remote -> Clone
	2. Enter in the repository URL
	3. Complete set-up
	4. Run the project

## Using the application
	1. From the viewed options type in the corresponding number of the currency you want to convert
	2. Enter in the amount of money to be converted
	3. The program will fetch the currency rates and convert accordingly
	4. Run again if desired

![ScreenRecording2024-10-24at5 24 02PM-ezgif com-speed](https://github.com/user-attachments/assets/3a8a126c-6d4f-4ec1-8cf2-c87f1dc8ada3)
## How it works
	Evertime the program is run it parses the HTML doc of www.x-rates.com
	Program read's conversion rates and writes them to data.txt, updating pre-stored conversion rates
	The program uses these rates to calculate accurate conversions during run-time

## Program goals
Working to impliment this program as a chrome extension, to allow on the fly conversions

## Issues
If you experience any issues with the program please email me at willminor64@gmail.com
