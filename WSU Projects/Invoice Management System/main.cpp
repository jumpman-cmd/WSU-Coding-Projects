#include <iostream>
#include <string>

using namespace std;

class Invoice
{	
	private:
		// Data members
		string number;
		string description;
		int quantity;
		int price;
	
	public:
		// Constructor
		Invoice(string num, string desc, int quan, int pri)
		{
			number = num;
			description = desc;
			quantity = quan;
			price = pri;
		}

		// Accessor methods
		string getNumber()
		{
			return number;
		}
		
		string getDescription()
		{
			return description;
		}
		
		int getQuantity()
		{
			return quantity;
		}
		
		int getPrice()
		{
			return price;
		}
		
		// Mutator/Set methods
		void setNumber(string num)
		{
			number = num;
		}
		
		void setDescription(string desc)
		{
			description =
cpp
Copy code
			description = desc;
		}
		
		void setQuantity(int quan)
		{
			quantity = quan;
		}
		
		void setPrice(int pri)
		{
			price = pri;
		}
		
		int getInvoiceAmount()
		{
			if (quantity < 0)
			{
				setQuantity(0);
			}
			
			if (price < 0)
			{
				setPrice(0);
			}
			
			int amount = quantity * price;
			return amount;
		}
};

int main()
{
	// Create an Invoice object
	Invoice ex1("12345", "Hammer", 100, 5);
	
	cout << "Part number: " << ex1.getNumber() << endl;
	cout << "Description: " << ex1.getDescription() << endl;
	cout << "Quantity: " << ex1.getQuantity() << endl;
	cout << "Price per item: R" << ex1.getPrice() << endl;
	cout << "Invoice amount: R" << ex1.getInvoiceAmount() << endl;

	return 0;
}