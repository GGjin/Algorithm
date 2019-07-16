import bean.Node

/**
 * 先进先出队列的链表实现
 */
class Queue<Item> {

    private var last: Node<Item>? = null
    private var first: Node<Item>? = null
    private var count = 0

    fun isEmpty(): Boolean = count == 0 && first == null

    fun size(): Int = count

    fun enqueue(item: Item) {

        val oldLast = last
        last = Node(item = item)

        if (isEmpty()) {
            first = last
        } else {
            oldLast?.let {
                it.next = last
            }
        }
        count++
    }

    fun dequeue(): Item? {
        val item = first?.item
        first = first?.next
        count--
        if (isEmpty())
            last = null
        return item
    }
}



fun main() {
    val queue = Queue<Int>()

    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    queue.enqueue(5)
    queue.enqueue(6)


    while (!queue.isEmpty()) {
        println(queue.dequeue())
    }
}