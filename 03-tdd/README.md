# TDD

Use the *Test-Driven Development (TDD)* methodology to develop the following.

## 1. Fizz Buzz

**Goal**: Write a program that returns the numbers from 1 to 100. But for multiples of three return "Fizz" instead of the number and for the multiples of five return "Buzz". For numbers which are multiples of both three and five return "FizzBuzz".

Sample output

	1
	2
	Fizz
	4
	Buzz
	Fizz
	7
	8
	Fizz
	Buzz
	11
	Fizz
	13
	14
	FizzBuzz
	16
	17
	Fizz
	19
	Buzz
	... etc up to 100


**Stop reading until you have developed this part**

#### New requirements

 - A number is Fizz if it has a 3 in it
 - A number is Buzz if it has a 5 in it
 - A number is FizzBuzz if
 	- it has a 3 in it, and
 	- it has a 5 in it

 - The previous requirements are still correct.


## 2. Password validator

**Goal**: design a "password validator" component using TDD.

For instance, you could configure a password validator to check that a user password:

	 - Has more than 8 characters
	 - Contains a capital letter
	 - Contains a lowercase
	 - Contains a number
	 - Contains an underscore

Start simple and then make your design more reusable by applying OOP principles and patterns.