# 🍕 Pizza Bill Generator (Java OOPs-Based) 🍕

Welcome to the **Pizza Bill Generator** project! This console-based application simplifies the pizza ordering process by allowing users to choose from different pizza types, add toppings, and opt for takeaway. The program then calculates the final bill based on user selections.

This project is built using **Java** and follows **Object-Oriented Programming (OOP)** principles, making it a great way to demonstrate how these concepts can be applied in a real-world scenario.

---

## 💡 Key Features:

- **🍕 Pizza Types:** Choose between **Veg** or **Non-Veg** pizza.
- **🧀 Extra Toppings:** Add extra toppings such as **Tomato**, **Onion**, or **Both**.
- **📦 Takeaway Option:** Opt for takeaway to customize your order.
- **💰 Bill Calculation:** Automatic calculation of the final bill based on selected options.

---

## 🔑 OOP Concepts Implemented:

- **Encapsulation:**  
  All critical attributes (such as price, toppings, and takeaway options) are made **private** to ensure controlled access through **public methods**. This maintains data integrity and security.

- **Abstraction:**  
  The `Pizza` class handles all internal operations, exposing only necessary methods (like `askForExtraToppings()`, `takeAway()`, and `finalBill()`) to keep the program modular and user-friendly.

- **Constructor Usage:**  
  The constructor initializes the base price based on whether the user chooses a **Veg** or **Non-Veg** pizza, ensuring that each pizza object starts with the right attributes.

- **Method Overloading & Modularity:**  
  Multiple methods are used for adding toppings, calculating prices, and printing the final bill. This keeps the code **modular**, well-structured, and **reusable**.

---

## 📦 Tech Stack:

- **Java (OOP Principles)**
- **Console-Based UI**
