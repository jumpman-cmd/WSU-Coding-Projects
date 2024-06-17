# Invoice Management System

## Description
This project implements a simple Invoice management system in C++. The `Invoice` class stores details about an invoice, including the part number, description, quantity, and price. It provides methods to get and set these details, as well as a method to calculate the total invoice amount.

## Features
- Create an invoice with part number, description, quantity, and price.
- Get and set the part number, description, quantity, and price.
- Calculate the total invoice amount, ensuring non-negative values for quantity and price.

## How to Use
1. Clone the repository to your local machine.
2. Open the project in your preferred C++ IDE or text editor.
3. Compile and run the `main.cpp` file to see the output.

### Sample Output
Part number: 12345
Description: Hammer
Quantity: 100
Price per item: R5
Invoice amount: R500

## Compilation Instructions
1. Ensure you have a C++ compiler installed (e.g., g++).
2. Compile the `main.cpp` file using the following command:
   ```sh
   g++ -o Invoice main.cpp
3. Run the compiled program:
   ./Invoice

File Structure
InvoiceManagementSystem/
├── README.md
└── main.cpp
