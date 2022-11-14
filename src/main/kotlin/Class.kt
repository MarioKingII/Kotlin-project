class User(private val _name: String, private val _budget: Int) {
    var name: String = _name
    var budget: Int = _budget
    private var total : Int = 0
    var list_Items = mutableMapOf<Int, Any>()

    // Adds an item to the map
    fun add_Item(item: String, itemPrice : Int) {
        list_Items[itemPrice] = item

    }
    // deletes an item from the map
    fun delete_Item(item: String, itemPrice : Int) {
        list_Items.remove(itemPrice, item)
    }

    // Adds up all the prices of all items in the map
    fun totalToSpend(){
        list_Items.forEach{key, value ->
            total += key
        }
        // Display the total if it is withing the budget of a "out of budget message otherwise.
        if (total< budget) {
            println("Your total is $total")
        } else { println("Your total is $total")
            println("out of budget")
    }
    }
}


