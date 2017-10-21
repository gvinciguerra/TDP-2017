# Java Design Patterns
This repository contains examples of Design Patterns implemented in Java. The problems were given as assignments in a course at Università di Pisa.

Project files can be opened with the [BlueJ development environment](
https://www.bluej.org/).

## Assignment descriptions
### [Strategy](/Strategy)
PizzaCap is a company that sells pizzas and gives discounts to clients. But there are many kinds of discount calculation methods such as: 10% off, reduce a fixed amount, happy hour, no discount at all, etc.

Now Pizza Cap asks you to develop a sales management system, they want you to design a schema to calculate the discount when selling pizzas.Your design should be capable of selecting the discount calculation methods. Furthermore, when they need new discount calculation methods or want to modify old methods, it should be very easy and will not affect the existing system.

### State [[1]](/State1) [[2]](/State2)
Consider a class with two methods, `push()` and `pull()`, whose behaviour changes depending on the object state.

To send the push and pull requests to the object, we'll use a GUI with "Push" and "Pull" buttons. The state of the object will be indicated by the colour of the canvas in the top part of the GUI.
  The states are: black, red, blue and green

Create State objects ahead of time and never destroy them. Implement different variants, accordingly to the following implementation strategies:
1. Letting Context to decide the flow of state transitions.
2. Using a table to define state transitions.

### [Observer](/Observer)
You will build a point of sale GUI for a restaurant staff.

Consider a menu: Hamburger 3.99, Cheeseburger 4.99, Milk Shake 5.00, Soda 2.00, Fries 2.50. The program should load the menu and create a panel full of large buttons (ideal for a touchscreen) for each menu item.

A waiter should be able to click on each menu item to add it to the current order (the subject). This should add the item to a receipt panel which displays the full order and the total cost. The total cost should be accurate at all times, updated as each item is added (not only when the order is finalised).

The waiter should be able to click a Place Order (notification needed now) button that simulates transmitting the order to the kitchen and cashier. Simply, a screen in the kitchen shows the list of the order and the number of the order. The screen of the cashier shows the order number, names and costs of the ordered items, and the total cost (two different observers).

### [Decorator](/Decorator)
The winter holidays will be here (again) before you know it! Being the organised individual you are, you have a plan for next year's holiday tree. Implement a software system that allows you to calculate the price of any tree plus any combination of decorations. The system must be easily extendable in the sense that whenever new decorations are added in the store you will have to at most add one class.

A very important requirement is that a tree can only have one star (not trivial to implement this requirement). When a user wants to decorate a tree with a star with a new star you must print a warning that the tree already has a star and not add the price of a star to tree. Users must be able to continue decorating their tree if they add another star to it.

### Factory Patterns [1](/FactoryMethod) [2](/AbstractFactory)
Apply the factory patterns to produce TVs and remote controls
  of two types: Samsung and Philips.

1. With factory method the creator builds a TV and its RC, then packs it.
2. With abstract factory a client chooses the factory and asks for the product(s) he needs.