
class User(private val _name: String, private val _budget: Int) {
    var name: String = _name
    var budget: Int = _budget
    private var total : Int = 0
    var list_Items = mutableMapOf<Int, Any>()

    fun add_Item(item: String, itemPrice : Int) {
        list_Items[itemPrice] = item

    }

    fun delete_Item(item: String, itemPrice : Int) {
        list_Items.remove(itemPrice, item)
    }


    fun totalToSpend(){
        list_Items.forEach{key, value ->
            total += key
        }
        println(total)
    }}

