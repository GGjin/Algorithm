package bean

data class Node<T>(var item: T? = null, var next: Node<T>? = null)