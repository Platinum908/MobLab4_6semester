class Box<T> {

    private var item: T? = null

    fun put(item: T) {
        this.item = item
    }

    fun get(): T? {
        return item
    }

    fun isEmpty(): Boolean {
        return item == null
    }
}

fun main() {
    val box = Box<String>()

    println("Коробка пустая? ${box.isEmpty()}")

    print("Что положить в коробку: ")
    val text = readln()
    box.put(text)

    println("Коробка пустая? ${box.isEmpty()}")
    println("Достаем из коробки: ${box.get()}")
}