import bean.Node
import kotlin.random.Random

/**
 * 后进先出链表
 */
fun main(args: Array<String>) {
    val stack = Stack<Int>()


    stack.push(11)
    stack.push(22)
    stack.push(33)
    stack.push(44)
    stack.push(55)

    while (!stack.isEmpty()) {
        println(stack.pop())

    }
}


class Stack<Item> {

    var node: Node<Item>? = null

    var count = 0

    fun isEmpty(): Boolean = count == 0


    fun size(): Int = count

    fun push(item: Item) {
        val oldNode = node
        node = Node(item = item, next = oldNode)

        count++

    }

    fun pop(): Item? {
        val item: Item? = node?.item
        node?.let {

            node = node?.next
            count--
        }
        return item
    }

}