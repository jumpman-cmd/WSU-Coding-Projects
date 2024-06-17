# House Price Calculator

## Description
This repository contains a C++ program that calculates the number of years required to save for a house given an initial deposit, the price of the house, and an annual interest rate. The program uses the formula for compound interest and includes an additional R5000 in the final amount.

## About This Program
The program prompts the user to input:
1. The initial deposit amount.
2. The price of the house.
3. The annual interest rate.

Using these inputs, the program calculates the number of years needed to save for the house and displays the results. The program continues to prompt for new inputs until the user enters a negative number to exit.

### Formula
The formula used for the calculation is derived from the compound interest formula:

\[ A = P(1+i)^n + 5000 \]

Where:
- \( A \) is the final amount (house price).
- \( P \) is the initial deposit amount.
- \( i \) is the annual interest rate.
- \( n \) is the number of years.

Rearranging the formula to solve for \( n \):

\[ n = \frac{\log_{10}((A - 5000) / P)}{\log_{10}(1 + i)} \]

## How to Use
1. Clone the repository to your local machine.
2. Compile the program using a C++ compiler.
3. Run the executable and follow the on-screen prompts.

### Sample Input and Output
Enter the initial amount (negative number to exit): R10000

Enter the price of the house: R200000

Enter the rate: 5

Price of the house: R200000
Initial deposit: R10000
Interest rate: 0.05
Number of years it is going to take: 53 year(s)

The initial amount (negative number to exit): R-1

## File Structure
There is a folder written "A program", click on it, then in that folder you will see a file named "main", click on it and you will see the code for this project.

### main.cpp
The main C++ source file containing the implementation of the house price calculator.

## Contributions
If you have any suggestions or improvements, feel free to fork this repository and submit a pull request. Any contributions are welcome!

## License
This repository is licensed under the MIT License. See the LICENSE file for more information.
