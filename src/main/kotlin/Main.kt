import java.lang.Exception
import kotlin.system.exitProcess

fun main() {
    // Initiate the user
    val user = getUser()
    // Enter the main program loop to begin accepting input
    while (true) {
        Menu()
        print("--> ")
        val input: Int
        try {
            input = readln().toInt()
        } catch (e: Exception) {
            println("Please Enter a valid selection")
            continue
        }
        when (input) {
            1 -> addingItem(user)
            2 -> deleteItem(user)
            3 -> displayList(user)
            4 -> user.totalToSpend()
            5 -> {
                println("Thank you ${user.name}")
                exitProcess(0)
            }

            else -> println("Please enter a valid menu item.")
        }
    }
}

// gets the username and the desired budget.
fun getUser(): User {
    print("Enter name: ")
    val name = readln()
    print("Enter your budget: ")
    val budget: Int
    try {
        budget = readln().toInt()
    } catch (e: Exception) {
        println("Please enter a valid amount")
        exitProcess(1)
    }

    return User(name, budget)
}

// Displays main menu
fun Menu() {
    println("1: Add a new Item")
    println("2: Delete a Item")
    println("3: Display List")
    println("4: Show Total")
    println("5: Exit")
}
// Gets input and calls add_Item function in the class.
fun addingItem(user : User) {
    print("Enter the product's name: ")
    val item = readln()
    print("Enter price: ")
    val itemPrice = readln().toInt()
    user.add_Item(item, itemPrice)
}
// Gets input and calls delete_Item function in the class.
fun deleteItem(user : User) {
    print("Enter the product's name: ")
    val item = readln()
    print("Enter price: ")
    val itemPrice = readln().toInt()
    user.delete_Item(item, itemPrice)
}

// Displays all items within the map
fun displayList( user: User){
    val addedItems = user.list_Items
    println("..........................")
    println("Your Shopping list:")
    println()
    addedItems.forEach{ (key, value) ->
        println("- $value for $key$")
    }


}




